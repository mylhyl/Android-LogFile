package com.mylhyl.logfile.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mylhyl.logfile.LogFile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogFile.putMsg("找不到操作术语");

        LogFile.putMsg("%s%d%s", "线路", 1, "找不到操作术语");

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                LogFile.putMsg("哈哈哈~出错咯！");
            }
        });

        new Thread(){
            @Override
            public void run() {
                LogFile.putMsg("众所周知，你失败咯");
            }
        }.start();
    }
}
