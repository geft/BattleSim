package com.lifeof843.battlesim

import android.content.Context
import android.widget.Toast

/**
 * Created by gerryjuans on 11/18/16.
 */

class Toasts(val context: Context) {

    fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}
