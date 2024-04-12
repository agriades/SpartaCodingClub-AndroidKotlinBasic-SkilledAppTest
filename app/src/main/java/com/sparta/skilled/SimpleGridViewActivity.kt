package com.sparta.skilled

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivitySimpleGridViewBinding

class SimpleGridViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySimpleGridViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleGridViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val items = arrayOf<String?>("item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6",  "item7", "item8")

        //어댑터 준비 (배열 객체 이용, simple_list_item_1 리소스 사용
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, items)

        // 어댑터를 GridView 객체에 연결
        binding.gridView.adapter = adapter

    }
}