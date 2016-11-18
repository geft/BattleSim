package com.lifeof843.battlesim

import android.app.Application
import android.content.Context

/**
 * Created by gerryjuans on 11/18/16.
 */

class App : Application() {

    companion object {
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()

        context = this
    }
}
