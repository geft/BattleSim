package com.lifeof843.battlesim

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.lifeof843.battlesim.character.Character
import com.lifeof843.battlesim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val model: MainModel = MainModel()
    private val view: MainView = MainView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindView()
    }

    private fun bindView() {
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding?.view = view
    }

    override fun onStart() {
        super.onStart()

        initCharacterList()
    }

    private fun initCharacterList() {
        val characters = model.populateCharacters()
        val characterStrings = characters.map { it.name }.sorted()
        val adapter = getCharacterListAdapter(characterStrings)

        binding?.listView?.adapter = adapter
        binding?.listView?.onItemClickListener = AdapterView.OnItemClickListener {
            adapterView, view, i, l -> handleItemClick(i, characters)
        }
    }

    private fun handleItemClick(i: Int, characters: List<Character>) {
        val description = model.displayCharacterDetail(characters[i])
        Toasts(this).showToast(description)
    }

    private fun getCharacterListAdapter(characters: List<String>): ArrayAdapter<String> {
        return ArrayAdapter(this, android.R.layout.simple_list_item_1, characters)
    }
}
