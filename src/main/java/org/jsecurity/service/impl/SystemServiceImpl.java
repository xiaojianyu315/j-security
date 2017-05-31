package org.jsecurity.service.impl;

import org.jsecurity.common.constants.ErrorConstants;
import org.jsecurity.common.exception.CSException;
import org.jsecurity.common.exception.DAOException;
import org.jsecurity.common.page.EasyUIPageResult;
import org.jsecurity.common.page.PageUtil;
import org.jsecurity.dao.SystemDao;
import org.jsecurity.dto.req.ReqQuerySystemPageListDTO;
import org.jsecurity.entity.SystemDO;
import org.jsecurity.entity.criteria.SystemCriteriaDO;
import org.jsecurity.service.SystemService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaojianyu on 16/9/6.
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Resource
    public SystemDao systemDao;


    public EasyUIPageResult<SystemDO> querySystemPageList(ReqQuerySystemPageListDTO querySystemPageListDTO, int pageNo, int pageSize) throws CSException {
        EasyUIPageResult<SystemDO> pageResult = new EasyUIPageResult<SystemDO>(new ArrayList<SystemDO>(),0);
        try {
            SystemCriteriaDO criteriaDO = new SystemCriteriaDO();
            int startRow = PageUtil.getStartRow(pageNo, pageSize);
            int count = systemDao.queryPageCount(criteriaDO);
            List<SystemDO> systemDOs = systemDao.queryPageList(criteriaDO, startRow, pageSize);
            pageResult.setRows(systemDOs);
            pageResult.setTotal(count);
        } catch (DAOException e) {
            throw new CSException(ErrorConstants.DAO_ERR, e);
        }
        return pageResult;
    }

    public int save(SystemDO systemDO) throws CSException {
        try {
            return systemDao.insert(systemDO);
        } catch (DAOException e) {
            throw new CSException(ErrorConstants.DAO_ERR, e);
        }
    }

    public int update(long id, SystemDO systemDO) throws CSException {
        try {
            return systemDao.insert(systemDO);
        } catch (DAOException e) {
            throw new CSException(ErrorConstants.DAO_ERR, e);
        }
    }

    public int delete(List<Long> ids) throws CSException {
        int delCount = 0;
        try {
            if(!CollectionUtils.isEmpty(ids)){
                for(Long id : ids){
                    delCount += systemDao.deleteByPrimaryKey(id);
                }
            }
            return delCount;
        } catch (DAOException e) {
            throw new CSException(ErrorConstants.DAO_ERR, e);
        }
    }
}
