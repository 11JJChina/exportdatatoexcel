package com.zhang.exportdata.controller;

import com.zhang.exportdata.excelheader.ColumnTitleMap;
import com.zhang.exportdata.service.ExportDataService;
import com.zhang.exportdata.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/exportdata")
public class ExportDataController {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    ExportDataService exportDataService;

    /**
     * @param response   返回对象
     * @param time_start 筛选时间，开始(预留，查询时并未做筛选数据处理)
     * @param end_start  筛选时间，结束(预留，查询时并未做筛选数据处理)
     * @api: /apios/exportdata/excel/
     * @method: GET
     * @desc: 导出数据，生成xlsx文件
     */
    @GetMapping(value = "/excel")
    public void getUserInfoEx(HttpServletResponse response, @RequestParam(required = true) String time_start,
                              @RequestParam(required = true) String end_start) {
        try {
            List<Map<String, Object>> userList = userInfoService.queryUserInfoResultListMap();
            ArrayList<String> titleKeyList = new ColumnTitleMap("userinfo").getTitleKeyList();
            Map<String, String> titleMap = new ColumnTitleMap("userinfo").getColumnTitleMap();
            exportDataService.exportDataToEx(response, titleKeyList, titleMap, userList);
        } catch (Exception e) { //
            //
             System.out.println(e.toString());
        }
    }
}
