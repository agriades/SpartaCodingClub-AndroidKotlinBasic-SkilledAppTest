package com.sparta.skilled

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivityViewBinderBinding

class ViewBinderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBinderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBinderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            binding.textView.text = "뷰바인딩이 잘 되고 있군요!"
        }
    }
}