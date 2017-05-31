package org.jsecurity.service;

import org.jsecurity.common.exception.CSException;
import org.jsecurity.common.page.EasyUIPageResult;
import org.jsecurity.dto.req.ReqQuerySystemPageListDTO;
import org.jsecurity.entity.SystemDO;

import java.util.List;

/**
 * Created by xiaojianyu on 16/9/2.
 */
public interface SystemService {

    /**
     * 分页查询系统列表
     * @param querySystemPageListDTO
     * @param pageNo
     * @param pageSize
     * @return
     * @throws CSException
     */
    EasyUIPageResult<SystemDO> querySystemPageList(ReqQuerySystemPageListDTO querySystemPageListDTO, int pageNo, int pageSize) throws CSException;

    /**
     * 保存系统数据
     * @param systemDO
     * @return
     * @throws CSException
     */
    int save(SystemDO systemDO) throws CSException;

    /**
     * 更新系统数据
     * @param id
     * @param systemDO
     * @return
     * @throws CSException
     */
    int update(long id, SystemDO systemDO) throws CSException;

    /**
     * 删除系统数据
     * @param ids
     * @return
     * @throws CSException
     */
    int delete(List<Long> ids) throws CSException;

}
