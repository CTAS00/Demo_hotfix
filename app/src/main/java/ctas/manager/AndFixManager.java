package ctas.manager;

import android.content.Context;

import com.alipay.euler.andfix.patch.PatchManager;

/**
 * Created by CTAS on 2017/8/20.
 */
public class AndFixManager {



    public static AndFixManager andFixManager = null ;
    public PatchManager patchManager = null;


    public static AndFixManager getInstance(){
        if(andFixManager == null) {
            synchronized (AndFixManager .class){

                if(andFixManager ==null ){
                    andFixManager=new AndFixManager();
                }
            }

        }
        return andFixManager;
    }

    public void initPatch(Context context){
        patchManager = new PatchManager(context);
        patchManager.init("");
        patchManager.loadPatch();

    }

    //加载patch文件
    public void addPatch(String patch){
        try {

            if(patchManager!=null){

                patchManager.addPatch(patch);
            }
        }catch (Exception e){


        }

    }
}
