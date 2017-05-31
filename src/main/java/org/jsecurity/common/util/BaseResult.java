package org.jsecurity.common.util;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Map;

/**
 */
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = 270624828885256628L;
    private boolean success = true;
    private String msg;
    private String code;
    private T data;
    /**
     * 额外的信息对,仅用于参考
     * <pre>
     * key:errorCode
     * msg:errorMsg
     * </pre>
     */
    private Map<String, String> extMsg;

    private Throwable e;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public Map<String, String> getExtMsg() {
        return extMsg;
    }

    public void setExtMsg(Map<String, String> extMsg) {
        this.extMsg = extMsg;
    }

    public Throwable getE() {
        return e;
    }

    public void setE(Throwable e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, MyToStringStyle.STYLE);
    }

}
