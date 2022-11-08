package com.example.narshaproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.narshaproject.databinding.ActivityWritingBinding
import com.example.narshaproject.databinding.ActivityMainBinding

class WritingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWritingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing)

        binding = ActivityWritingBinding.inflate(layoutInflater) //바인딩 객체 흭득
        setContentView(binding.root) //액티비티 화면 출력

        //액티비티 뒤로가기 버튼
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}

