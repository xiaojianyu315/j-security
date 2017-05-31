package org.jsecurity.common.exception;


public abstract class AbstractException extends Exception {

    private static final long serialVersionUID = 5355201750740118871L;

    protected String errorCode;

    protected String errorMessage;

    protected Throwable throwable = null;

    public AbstractException() {
    }

    public AbstractException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public AbstractException(String errorCode, String errorMessage, Throwable e) {
        super(errorMessage, e);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        throwable = e;
    }

    public AbstractException(String errorCode, Throwable e) {
        super("", e);
        this.errorCode = errorCode;
        throwable = e;
    }

    public AbstractException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public AbstractException(Throwable e) {
        super(e);
        throwable = e;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AbstractException{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", throwable=").append(throwable);
        sb.append('}');
        return sb.toString();
    }
}
