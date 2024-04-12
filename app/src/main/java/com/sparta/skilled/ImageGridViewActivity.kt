package com.sparta.skilled

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sparta.skilled.databinding.ActivityImageGridViewBinding

class ImageGridViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageGridViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageGridViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ImageAdapter 객체를 생성하고 GridView 객체에 연결
        binding.gridView.adapter = ImageAdapter()

        // 항목 클릭 이벤트 처리
        binding.gridView.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this,"" + (position + 1) + "번째 선택",
                Toast.LENGTH_SHORT).show()
        }
    }
}