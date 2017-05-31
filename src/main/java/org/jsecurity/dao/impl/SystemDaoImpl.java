package org.jsecurity.dao.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.jsecurity.common.exception.DAOException;
import org.jsecurity.dao.BaseDao;
import org.jsecurity.dao.SystemDao;
import org.jsecurity.entity.SystemDO;
import org.jsecurity.entity.criteria.SystemCriteriaDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaojianyu on 16/12/4.
 */
@Repository("systemDao")
public class SystemDaoImpl implements SystemDao {

    @Resource
    private BaseDao baseDao;

    public int queryPageCount(SystemCriteriaDO systemCriteriaDO) throws DAOException {
        ImmutableMap<String, SystemCriteriaDO> param = ImmutableMap.of("criteriaDO", systemCriteriaDO);
        return baseDao.executeQueryForObject("SystemDOMapper.queryPageCount", param);
    }

    public List<SystemDO> queryPageList(SystemCriteriaDO systemCriteriaDO, int startRow, int pageSize) throws DAOException {
        ImmutableMap<String, Serializable> param = ImmutableMap.of(
                "criteriaDO", systemCriteriaDO,
                "startRow", startRow,
                "pageSize", pageSize
        );
        return baseDao.executeQueryForList("SystemDOMapper.queryPageList", param);
    }

    public int deleteByPrimaryKey(Long id) throws DAOException {
        return baseDao.executeUpdate("SystemDOMapper.deleteByPrimaryKey", id);
    }

    public int insert(SystemDO record) throws DAOException {
        return baseDao.executeInsert("SystemDOMapper.insert", record);
    }

    public SystemDO selectByPrimaryKey(Long id) throws DAOException {
        return baseDao.executeQueryForObject("SystemDOMapper.selectByPrimaryKey", id);

    }

    public int updateByPrimaryKeySelective(SystemDO record) throws DAOException {
        return baseDao.executeInsert("SystemDOMapper.updateByPrimaryKeySelective", record);
    }
}
