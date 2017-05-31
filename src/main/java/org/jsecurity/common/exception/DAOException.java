package org.jsecurity.common.exception;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jsecurity.common.util.MyToStringStyle;


public class DAOException extends Exception {
    private static final long serialVersionUID = -3036371742320970912L;
    protected String message;

    protected Throwable exception = null;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, MyToStringStyle.STYLE);
    }
}
