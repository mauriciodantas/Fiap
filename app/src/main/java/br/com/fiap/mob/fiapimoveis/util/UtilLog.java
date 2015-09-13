package br.com.fiap.mob.fiapimoveis.util;

import android.util.Log;

/**
 * Created by Mauricio on 13/09/2015.
 */
public class UtilLog {

    public static void logAviso(String msg){
        Log.w(Constants.TAG_APLICATIVO,msg);
    }

    public static void logInformacao(String msg){
        Log.i(Constants.TAG_APLICATIVO,msg);
    }

    public static void logErro(String msg){
        Log.e(Constants.TAG_APLICATIVO,msg);
    }

}



