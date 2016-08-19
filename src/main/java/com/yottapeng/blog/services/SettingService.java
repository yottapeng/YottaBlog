package com.yottapeng.blog.services;

import java.io.Serializable;

/**
 * @author yottapeng<i@yottapeng.com>
 */
public interface SettingService {
    Serializable get(String key);
    Serializable get(String key, Serializable defaultValue);
    void put(String key, Serializable value);
}
