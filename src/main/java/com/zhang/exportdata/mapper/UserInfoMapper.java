package com.zhang.exportdata.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserInfoMapper {
    /**
     * @desc 查询所有用户信息
     * @return 返回多个用户List
     * */
    List<Map<String,Object>> queryUserInfoResultListMap();
}
