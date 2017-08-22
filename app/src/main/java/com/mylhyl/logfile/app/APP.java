package com.mylhyl.logfile.app;

import android.app.Application;

import com.mylhyl.logfile.LogFile;
import com.mylhyl.logfile.LogFileConfig;


/**
 * Created by Administrator on 2017/8/21.
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogFileConfig loggerConfig = new LogFileConfig();
        LogFile.init(this, loggerConfig);
    }
}
