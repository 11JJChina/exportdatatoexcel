package com.zhang.exportdata.service;

import com.zhang.exportdata.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * @return 返回多个用户List
     * @desc 查询所有用户信息
     */
    public List<Map<String, Object>> queryUserInfoResultListMap() {
        List<Map<String, Object>> list = userInfoMapper.queryUserInfoResultListMap();
        return list;
    }
}
