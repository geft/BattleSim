package com.lifeof843.battlesim

import android.content.Context
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.design.widget.Snackbar.LENGTH_SHORT
import android.view.View

/**
 * Created by Gerry on 19/11/2016.
 */
class Snackbars(val context: Context) {

    fun showInfo(view: View, @StringRes stringRes: Int) {
        Snackbar.make(view, stringRes, LENGTH_SHORT)
    }
}