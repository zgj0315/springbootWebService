package org.after90.service;

import org.after90.model.AppInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AppService {
    public AppInfo getInfo(String strID) {
        log.info("strID:", strID);
        AppInfo app = new AppInfo(strID, "WeiShang" + strID);
        return app;
    }
}
