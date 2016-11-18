package com.lifeof843.battlesim

import com.lifeof843.battlesim.Enums.CharacterClass
import com.lifeof843.battlesim.character.Character
import com.lifeof843.battlesim.character.Rogue
import com.lifeof843.battlesim.character.Warrior
import com.lifeof843.battlesim.character.Wizard
import java.util.*

/**
 * Created by gerryjuans on 11/18/16.
 */

internal class MainModel {

    fun populateCharacters(): List<Character> {
        val list = ArrayList<Character>()
        val hashMap = characterHashMap()

        for ((key, value) in hashMap) {
            list.add(value)
        }

        return list
    }

    fun displayCharacterDetail(character: com.lifeof843.battlesim.character.Character): String {
        return character.name + " - " + character.description
    }

    private fun characterHashMap(): HashMap<CharacterClass, Character> {
        val hashMap = HashMap<CharacterClass, Character>()
        hashMap.put(CharacterClass.WARRIOR, Warrior())
        hashMap.put(CharacterClass.WIZARD, Wizard())
        hashMap.put(CharacterClass.ROGUE, Rogue())

        return hashMap
    }
}
