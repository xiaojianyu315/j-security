package org.jsecurity.common.util;


import org.jsecurity.common.constants.ErrorConstants;
import org.jsecurity.common.exception.CSException;
import org.jsecurity.common.exception.DAOException;

/**
 */
public class ResultUtil {

    public static void buildResult4Throwable(BaseResult result, Throwable e) {
        result.setSuccess(false);
        result.setCode(ErrorConstants.UNKNOW_ERR.getErrorCode());
        result.setMsg(ErrorConstants.UNKNOW_ERR.getErrorMessage());
        result.setE(e);
    }

    public static void buildResult4CSException(BaseResult result, CSException e) {
        result.setSuccess(false);
        result.setCode(e.getErrorCode());
        result.setMsg(e.getErrorMessage());
        result.setE(e);
    }

    public static void buildResult4CSException(BaseResult result, String message, CSException e) {
        result.setSuccess(false);
        result.setCode(e.getErrorCode());
        result.setMsg(message);
        result.setE(e);
    }


    public static void buildResult4DAOException(BaseResult result, DAOException e) {
        result.setSuccess(false);
        result.setCode(ErrorConstants.DAO_ERR.getErrorCode());
        result.setMsg(ErrorConstants.DAO_ERR.getErrorMessage());
        result.setE(e);
    }

    public static void buildResult4DAOException(BaseResult result, String code, String message, DAOException e) {
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(message);
        result.setE(e);
    }

    public static void buildResult4Exception(BaseResult result, String code, String msg, Exception e) {
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(msg);
        result.setE(e);
    }

    public static void buildResult4Exception(BaseResult result, String code, String msg, Throwable e) {
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(msg);
        result.setE(e);
    }


    public static void buildResult4Exception(BaseResult result, ErrorConstants errorConstants, Exception e) {
        result.setSuccess(false);
        result.setCode(errorConstants.getErrorCode());
        result.setMsg(errorConstants.getErrorMessage());
        result.setE(e);
    }


    public static void buildErrorInfo(BaseResult result, String code, String msg) {
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(msg);
    }

    public static void buildErrorInfo(BaseResult result, String code, String msg, Throwable e) {
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(msg);
        result.setE(e);
    }

    public static void buildErrorInfo(BaseResult result, ErrorConstants errorConstants) {
        result.setSuccess(false);
        result.setCode(errorConstants.getErrorCode());
        result.setMsg(errorConstants.getErrorMessage());
    }

    public static void buildErrorInfo(BaseResult result, ErrorConstants errorConstants, Throwable e) {
        result.setSuccess(false);
        result.setCode(errorConstants.getErrorCode());
        result.setMsg(errorConstants.getErrorMessage());
        result.setE(e);
    }


    public static void buildSuccess(BaseResult result) {
        result.setSuccess(true);
        result.setCode(ErrorConstants.BIZ_SUCCESS.getErrorCode());
        result.setMsg(ErrorConstants.BIZ_SUCCESS.getErrorMessage());
    }


}
