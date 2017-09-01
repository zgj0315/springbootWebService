package org.after90.controller;

import org.after90.model.AppInfo;
import lombok.extern.slf4j.Slf4j;
import org.after90.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class BAController {
    @Autowired
    private AppService appService;

    // 备案信息查询
    @CrossOrigin(origins = {"http://localhost:8080", "http://127.0.0.1:8080"})
    @RequestMapping("/appInfo")
    public AppInfo getAppInfo(@RequestParam(value = "strID", defaultValue = "") String strID) {
        AppInfo app = appService.getInfo(strID);
        return app;
    }

}
