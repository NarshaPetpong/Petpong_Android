package com.example.narshaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.narshaproject.databinding.ActivityCalenderBinding
import java.time.LocalDate

class Calender : AppCompatActivity() {

    private lateinit var binding: ActivityCalenderBinding

    //년월 변수
    lateinit var selectDate: LocalDate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)
    }
}