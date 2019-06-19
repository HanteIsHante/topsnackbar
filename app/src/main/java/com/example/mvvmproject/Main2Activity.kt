package com.example.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    val name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val list = listOf(10, 20, 30, 40)

        val listMutable = mutableListOf(10, 20, 30, 40)
        abc@ listMutable.add(50)
        listMutable.removeAt(0)


        val str = name is String

        val value = name as Int?

        val key = name as? Int
    }
}
