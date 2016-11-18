package com.lifeof843.battlesim

import android.support.annotation.StringRes

/**
 * Created by gerryjuans on 11/18/16.
 */

object Resources {
    fun getString(@StringRes stringRes: Int): String {
        return App.context!!.getString(stringRes)
    }
}
