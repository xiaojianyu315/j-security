package org.jsecurity.common.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaojianyu on 16/12/4.
 */
public class EasyUIPageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据集合
     */
    private List<T> rows;

    /**
     * 总行数
     */
    private int total;


    public EasyUIPageResult(List<T> rows, int total) {
        this.rows = rows;
        this.total = total;
    }
    public EasyUIPageResult() {
        this.rows = new ArrayList<T>();
        this.total = 0;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
