package com.lifeof843.battlesim.character

import com.lifeof843.battlesim.R
import com.lifeof843.battlesim.Resources

/**
 * Created by gerryjuans on 11/18/16.
 */

class Rogue : Character {
    override fun getName(): String {
        return Resources.getString(R.string.character_rogue)
    }

    override fun getDescription(): String {
        return Resources.getString(R.string.character_rogue_description)
    }
}
