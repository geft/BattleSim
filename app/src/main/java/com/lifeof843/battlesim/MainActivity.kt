package com.lifeof843.battlesim

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.lifeof843.battlesim.character.Character
import com.lifeof843.battlesim.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding = ActivityMainBinding()
    private val model: MainModel = MainModel()
    private val view: MainView = MainView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBinding()
    }

    private fun initBinding() {
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.view = view
    }

    override fun onStart() {
        super.onStart()

        initCharacterList()
    }

    private fun initCharacterList() {
        val characters = characters

        val characterStrings = ArrayList<String>()

        for (character in characters) {
            characterStrings.add(character.name)
        }

        val adapter = getCharacterListAdapter(characterStrings)
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener {
            adapterView, view, i, l -> handleItemClick(i, characters)
        }
    }

    private fun handleItemClick(i: Int, characters: List<com.lifeof843.battlesim.character.Character>) {
        val text = model.displayCharacterDetail(characters[i])
        Toaster.showToast(text)
    }

    private fun getCharacterListAdapter(characters: List<String>): ArrayAdapter<String> {
        val adapter = ArrayAdapter<String>(this, android.R.layout.activity_list_item)
        adapter.addAll(characters)
        return adapter
    }

    private val characters: List<Character>
        get() = model.populateCharacters()
}
