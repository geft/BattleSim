package com.lifeof843.battlesim;

import android.app.Application;
import android.content.Context;

/**
 * Created by gerryjuans on 11/18/16.
 */

public class App extends Application {

    private static Context instance;

    public static Context getInstance() {
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = getApplicationContext();
    }
}
