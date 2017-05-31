package org.jsecurity.common.constants;

/**
 * xiaojianyu
 */
public enum ErrorConstants {
    BIZ_SUCCESS("BIZ_SUCCESS", "操作成功"),
    UNKNOW_ERR("UNKNOW_ERR", "未知异常"),
    PARA_ERR("PARA_ERR", "参数异常"),
    DAO_ERR("DAO_ERR", "DAO异常"),
    ENUM_PARSE_ERR("ENUM_PARSE_ERR", "枚举解析异常");

    private String errorCode;
    private String errorMessage;

    ErrorConstants(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
