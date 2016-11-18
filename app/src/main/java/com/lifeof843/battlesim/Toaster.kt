package com.lifeof843.battlesim

import android.widget.Toast

/**
 * Created by gerryjuans on 11/18/16.
 */

object Toaster {
    fun showToast(text: String) {
        Toast.makeText(App.getInstance(), text, Toast.LENGTH_SHORT).show()
    }
}
