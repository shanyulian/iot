package com.haro.iot.weixin.service;

import com.haro.iot.weixin.pojo.TUser;

/**
 * Created by shan on 2017/2/6.
 */
public interface UserServiceI {

    void addUser(TUser user);

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    TUser getUserById(int userId);
    /**
     * aesfd
     */

}
