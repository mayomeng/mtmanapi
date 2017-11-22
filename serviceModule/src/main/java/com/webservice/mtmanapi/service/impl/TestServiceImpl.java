package com.webservice.mtmanapi.service.impl;

import com.webservice.mtmanapi.jna.NativeLibrary;
import com.webservice.mtmanapi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/12.
 */
@Service
public class TestServiceImpl implements TestService {

   @Autowired
    private NativeLibrary nativeLibrary;

    @Override
    public void test(int id, String name) {
        nativeLibrary.test();
        System.out.println("test");
    }
}
