package com.example.horizontalrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horizontalrecyclerview.adapter.CurrencyAdapter
import com.example.horizontalrecyclerview.data.CurrencyRepository
import com.example.horizontalrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initRecycler()

    }

    fun initRecycler(){
        binding.rvCurrency.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCurrency.adapter = CurrencyAdapter(CurrencyRepository.listCurrency)
    }
}