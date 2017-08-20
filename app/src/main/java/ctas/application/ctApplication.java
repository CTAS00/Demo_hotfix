package ctas.application;

import android.app.Application;

import ctas.manager.AndFixManager;

/**
 * Created by CTAS on 2017/8/20.
 */
public class ctApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //完成andfix的初始化
        initAndFix();
    }

    private void initAndFix() {
        AndFixManager.getInstance().initPatch(this);
    }
}
