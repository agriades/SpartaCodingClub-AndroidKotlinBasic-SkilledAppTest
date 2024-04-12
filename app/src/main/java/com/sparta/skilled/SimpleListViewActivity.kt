package com.sparta.skilled

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivitySimpleListViewBinding

class SimpleListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySimpleListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySimpleListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = arrayOf<String?>("item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item9", "item10", "item11", "item12", "item13", "item14", "item15", "item16", "item17")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        binding.listview.adapter = adapter
    }

}