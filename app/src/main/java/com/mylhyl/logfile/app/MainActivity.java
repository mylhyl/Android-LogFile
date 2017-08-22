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

        LogFile.putMsg("线路%d找不到操作术语", "九");

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                LogFile.putMsg("哈哈哈~出错咯！");
            }
        });

        new Thread() {
            @Override
            public void run() {
                LogFile.putMsg("众所周知，你失败咯");
            }
        }.start();

        LogFile.putMsg("与服务器连接失败：", "可能原因是您使用的2G网络");

        LogFile.putMsg("获取用户信息失败：", "%s%d%s", "用户ID", 27, "不存在");
    }
}
