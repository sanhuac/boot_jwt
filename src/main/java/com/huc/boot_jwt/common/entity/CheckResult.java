package com.huc.boot_jwt.common.entity;

import io.jsonwebtoken.Claims;

/**
 * @Auther: 胡丛
 * @Date: 2018/9/25 10:25
 * @Description:
 */
public class CheckResult {

    private int errCode;

    private boolean success;

    private Claims claims;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }
}
