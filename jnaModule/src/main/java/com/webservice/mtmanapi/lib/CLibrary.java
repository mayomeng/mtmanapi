package com.webservice.mtmanapi.lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface CLibrary extends Library {
    void MtManCreate();
}