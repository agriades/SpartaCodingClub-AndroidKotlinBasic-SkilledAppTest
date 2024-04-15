package com.sparta.skilled

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAdapterView.setOnClickListener {
            val adapterViewActivityIntent = Intent(this, AdapterViewActivity::class.java)
            startActivity(adapterViewActivityIntent)
        }

        binding.btnViewBinder.setOnClickListener {
            val viewBinderActivityIntent = Intent(this, ViewBinderActivity::class.java)
            startActivity(viewBinderActivityIntent)
        }

        binding.btnRecyclerView.setOnClickListener {
            val recyclerViewActivityIntent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(recyclerViewActivityIntent)
        }

        binding.btnFragment.setOnClickListener {
            val fragmentTestActivityIntent = Intent(this, FragmentTestActivity::class.java)
            startActivity(fragmentTestActivityIntent)
        }
    }
}