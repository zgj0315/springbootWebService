package org.after90;

import lombok.extern.slf4j.Slf4j;
import org.after90.utils.ParaUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by zhaogj on 03/11/2016.
 */
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        ParaUtil.isTesting = false;
        SpringApplication.run(Application.class, args);
    }

}
