package com.webservice.mtmanapi.jna.impl;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.webservice.mtmanapi.jna.NativeLibrary;
import com.webservice.mtmanapi.lib.CLibrary;
import com.webservice.mtmanapi.lib.CLibraryUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public class NativeLibraryImpl implements NativeLibrary {

    @Autowired
    private CLibraryUtil cLibraryUtil;

    @Override
    public void test() {
        cLibraryUtil.getInstance().MtManCreate();
    }


}
