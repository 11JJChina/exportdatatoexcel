package com.zhang.exportdata.excelheader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColumnTitleMap {

    private Map<String, String> columnTitleMap = new HashMap<String, String>();
    private ArrayList<String> titleKeyList = new ArrayList<String>();

    public ColumnTitleMap(String datatype) {
        switch (datatype) {
            case "userinfo":
                initUserInfoColu();
                initUserInfoTitleKeyList();
                break;
            default:
                break;
        }
    }

    /**
     * mysql用户表需要导出字段--显示名称对应集合
     */
    private void initUserInfoColu() {
        columnTitleMap.put("id", "ID");
        columnTitleMap.put("username", "用户名");
        columnTitleMap.put("password", "密码");
        columnTitleMap.put("age", "年龄");
        columnTitleMap.put("height", "身高");
    }

    /**
     * mysql用户表需要导出字段集
     */
    private void initUserInfoTitleKeyList() {
        titleKeyList.add("id");
        titleKeyList.add("username");
        titleKeyList.add("password");
        titleKeyList.add("age");
        titleKeyList.add("height");

    }

    public Map<String, String> getColumnTitleMap() {
        return columnTitleMap;
    }

    public ArrayList<String> getTitleKeyList() {
        return titleKeyList;
    }


}
