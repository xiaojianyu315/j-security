package org.jsecurity.common.exception;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jsecurity.common.constants.ErrorConstants;
import org.jsecurity.common.util.MyToStringStyle;

/**
 */
public class CSException extends AbstractException {
    private static final long serialVersionUID = -619344792238696371L;

    public CSException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CSException(String errorCode, String errorMessage, Throwable e) {
        super(errorMessage, e);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        throwable = e;
    }

    public CSException(String errorCode, Throwable e) {
        super("", e);
        this.errorCode = errorCode;
        throwable = e;
    }

    public CSException(ErrorConstants errorConstants, Throwable e) {
        this(errorConstants.getErrorCode(), errorConstants.getErrorMessage(), e);
    }

    public CSException(ErrorConstants errorConstants) {
        this(errorConstants, null);
    }

    public CSException() {
        super();
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, MyToStringStyle.STYLE);
    }
}
