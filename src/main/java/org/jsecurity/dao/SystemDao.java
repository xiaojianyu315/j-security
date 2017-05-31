package org.jsecurity.dao;

import org.jsecurity.common.exception.DAOException;
import org.jsecurity.entity.criteria.SystemCriteriaDO;
import org.jsecurity.entity.SystemDO;

import java.util.List;

public interface SystemDao {

    /**
     * 查询总条数
     * @param systemCriteriaDO
     * @return
     * @throws DAOException
     */
    int queryPageCount(SystemCriteriaDO systemCriteriaDO) throws DAOException;

    /**
     * 查询分页list
     * @param systemCriteriaDO
     * @param startRow
     * @param pageSize
     * @return
     * @throws DAOException
     */
    List<SystemDO> queryPageList(SystemCriteriaDO systemCriteriaDO, int startRow, int pageSize) throws DAOException;

    /**
     * 根据主键删除
     * @param id
     * @return
     * @throws DAOException
     */
    int deleteByPrimaryKey(Long id) throws DAOException;

    /**
     * 保存
     * @param record
     * @return
     * @throws DAOException
     */
    int insert(SystemDO record) throws DAOException;

    /**
     * 根据主键查询
     * @param id
     * @return
     * @throws DAOException
     */
    SystemDO selectByPrimaryKey(Long id) throws DAOException;

    /**
     * 根据传入条件更新
     * @param record
     * @return
     * @throws DAOException
     */
    int updateByPrimaryKeySelective(SystemDO record) throws DAOException;

}