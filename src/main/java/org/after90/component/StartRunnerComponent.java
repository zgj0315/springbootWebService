package org.after90.component;

import lombok.extern.slf4j.Slf4j;
import org.after90.utils.ParaUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by zhaogj on 17/11/2016.
 * 工程启动时需要加载的动作写在这里
 */
@Component
@Slf4j
@Order(value = 1)
public class StartRunnerComponent implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        if (ParaUtil.isTesting) {
            log.info("this is a test");
        } else {
            log.info("this is not a test");
        }

    }
}
