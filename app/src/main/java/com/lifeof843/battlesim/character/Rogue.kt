package com.lifeof843.battlesim.character

import com.lifeof843.battlesim.R
import com.lifeof843.battlesim.Resources

/**
 * Created by gerryjuans on 11/18/16.
 */

class Rogue : Character {
    override val name: String
        get() = Resources.getString(R.string.character_rogue)
    override val description: String
        get() = Resources.getString(R.string.character_rogue_description)
}
