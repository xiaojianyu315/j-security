package org.jsecurity.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 基类dao
 */
public class BaseDao extends SqlSessionDaoSupport {
    public Map buildPageParam(Map param, int offset, int length) {
        param.put("offset", offset);
        param.put("length", length);
        return param;
    }

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    @Override
    public SqlSession getSqlSession() {
        super.checkDaoConfig();
        return super.getSqlSession();
    }

    public <T> T executeQueryForObject(String statementName, Object parameterObject) {
        return getSqlSession().selectOne(statementName, parameterObject);
    }

    public <T> List<T> executeQueryForList(String statementName, Object parameterObject) {
        return getSqlSession().selectList(statementName, parameterObject);
    }

    public int executeUpdate(String statementName, Object parameterObject) {
        return getSqlSession().update(statementName, parameterObject);
    }


    public int executeInsert(String statementName, Object parameterObject) {
        return getSqlSession().insert(statementName, parameterObject);
    }
}
