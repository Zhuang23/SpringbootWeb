package com.zhf.exception;


public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }

}
