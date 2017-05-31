package org.jsecurity.entity.criteria;

import java.io.Serializable;

/**
 * 系统dao查询传递对象
 * Created by xiaojianyu on 16/12/4.
 */
public class SystemCriteriaDO implements Serializable{
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
