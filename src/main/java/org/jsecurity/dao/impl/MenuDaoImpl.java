package org.jsecurity.dao.impl;

import com.google.common.collect.ImmutableMap;
import org.jsecurity.common.exception.DAOException;
import org.jsecurity.dao.BaseDao;
import org.jsecurity.dao.MenuDao;
import org.jsecurity.dao.SystemDao;
import org.jsecurity.entity.MenuDO;
import org.jsecurity.entity.SystemDO;
import org.jsecurity.entity.criteria.SystemCriteriaDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaojianyu on 16/12/4.
 */
@Repository("menuDao")
public class MenuDaoImpl implements MenuDao {

    @Resource
    private BaseDao baseDao;

    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(MenuDO record) {
        return 0;
    }

    public int insertSelective(MenuDO record) {
        return 0;
    }

    public MenuDO selectByPrimaryKey(Long id) {
        return null;
    }

    public int updateByPrimaryKeySelective(MenuDO record) {
        return 0;
    }

    public int updateByPrimaryKey(MenuDO record) {
        return 0;
    }
}
