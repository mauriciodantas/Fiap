package br.com.fiap.mob.fiapimoveis;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Mauricio on 11/09/2015.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
