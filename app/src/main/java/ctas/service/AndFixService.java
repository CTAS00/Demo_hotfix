package ctas.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;


import java.io.File;
import java.util.logging.LogRecord;

/**
 * Created by CTAS on 2017/8/20.
 * function 1.检查patch文件 2.下载patch文件 3.加载patch文件
 */
public class AndFixService extends Service {
    private static final int UPDATE_PATCH= 0x02;
    private static final int Download_PATCH= 0x03;

    private String mPatchFileDir;
    private String mPatchFile;
    private Handler mHandler =new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch(msg.what){
                case UPDATE_PATCH:
                    checkPatchUpdate();
                    break;
                case Download_PATCH:
                    downLoadPatch();
                    break;
            }
        }
    };

    /**
     * 下载文件
     */
    private void downLoadPatch() {
        mPatchFile = mPatchFileDir.concat(String.valueOf(System.currentTimeMillis())).concat(".apatch");
        url , 路径 ， 回调
                文件下载失败也是停掉service
                onsuccess =》
              讲我们下载好的patch文件添加到我们的andfix中去
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }
    //被系统回收了以后  不会重启
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mHandler.sendEmptyMessage(UPDATE_PATCH)
        return START_NOT_STICKY;
    }
    private void init() {
        //父类的文件路径
        mPatchFileDir = getExternalCacheDir().getAbsolutePath()+"/apatch/";
        File file=new File(mPatchFileDir);
        try {
            if(file ==null || !file.exists()) {
                file.mkdir();
            }
        }catch (Exception e){
            stopSelf();
        }
    }
    //向服务器发送一个请求
    private void checkPatchUpdate(){
        //主要返回downloadurl
        //本次patch包的版本号
        //本次patch包含的相关信息，列入：主要做了哪些改动
        onFaile()= > stopSelf();
        
        onSuccess = >
        
        若下载地址不为空 就去下载  若为空 就stop
        

    }
}
