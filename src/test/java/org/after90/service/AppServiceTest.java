package test.org.after90.service;

import lombok.extern.slf4j.Slf4j;
import org.after90.Application;
import org.after90.service.AppService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class AppServiceTest {
    @Autowired
    private AppService appService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getInfo(String strID)
     */
    @Test
    public void testGetInfo() throws Exception {
        appService.getInfo("123");
    }

} 
