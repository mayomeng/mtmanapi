package com.webservice.mtmanapi.lib;

import com.sun.jna.Native;
import com.webservice.mtmanapi.configuration.AppConfiguation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public class CLibraryUtil {

    private CLibrary instance;

    @Autowired
    private AppConfiguation appConfiguation;

    @PostConstruct
    public void init() {
        instance = (CLibrary) Native.loadLibrary(appConfiguation.getDllFilePath(), CLibrary.class);
    }

    public CLibrary getInstance() {
        return instance;
    }
}
