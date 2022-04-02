package com.example.cristallball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cristallball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.tv.text = getSpisok()
        }
    }

    private fun getSpisok():String{
        return resources.getStringArray(R.array.spisok)[random()]
    }

    private fun random(): Int{
        val num = resources.getStringArray(R.array.spisok).size-1
        return (0..num).random()
    }
}