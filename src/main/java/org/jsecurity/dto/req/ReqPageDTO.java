package org.jsecurity.dto.req;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jsecurity.common.util.MyToStringStyle;

import java.io.Serializable;

/**
 * Created by xiaojianyu on 16/12/4.
 */
public class ReqPageDTO implements Serializable{
    private static final long serialVersionUID = 4895520691261757336L;

    protected Integer page;
    protected Integer rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, MyToStringStyle.STYLE);
    }
}
