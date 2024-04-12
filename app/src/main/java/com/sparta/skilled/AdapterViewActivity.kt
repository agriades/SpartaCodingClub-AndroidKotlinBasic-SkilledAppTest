package com.sparta.skilled

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivityAdapterViewBinding

class AdapterViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdapterViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdapterViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpleListView.setOnClickListener {
            val simpleListViewActivityIntent = Intent(this, SimpleListViewActivity::class.java)
            startActivity(simpleListViewActivityIntent)
        }
    }
}