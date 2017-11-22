package com.webservice.mtmanapi.controller;

import com.webservice.mtmanapi.info.TestInfo;
import com.webservice.mtmanapi.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public TestInfo test(@RequestBody TestInfo testInfo) {
        testService.test(testInfo.getId(), testInfo.getName());
        return testInfo;
    }
}
