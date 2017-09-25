package org.after90.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.*;

/**
 * Created by zhaogj on 25/09/2017.
 */
@Slf4j
@RestController
public class POSTController {
    // 备案信息查询
    @RequestDecode
    @ResponseBody
    @RequestMapping(path = "update", method = RequestMethod.POST)
    public String update(@RequestBody String strBody) {
        log.info("strBody:{}", strBody);
        return "";
    }

    /**
     * 解密请求数据
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface RequestDecode {

//        SecurityMethod method() default SecurityMethod.NULL;

    }
}
