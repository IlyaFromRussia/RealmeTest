package com.example.realmetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.FileProvider
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val file =  File("/storage/emulated/0/Android/data/com.example.realmetest/", ".")
        Log.d("Ilya", "${file.absolutePath}")
    }
}