package ctas.demo_hotfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

import ctas.manager.AndFixManager;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_END = ".apatch";
    private String mPatchDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPatchDir = getExternalCacheDir().getAbsolutePath()+"/apatch/";
        File file = new File(mPatchDir);
        if(file == null || !file.exists()){
            file.mkdir();
        }
    }



    public void fixBug(){

        AndFixManager.getInstance().addPatch(getPatchName());


    }
    //获得路径
    private String getPatchName() {

        return mPatchDir.concat("ct").concat(FILE_END);
    }


}
