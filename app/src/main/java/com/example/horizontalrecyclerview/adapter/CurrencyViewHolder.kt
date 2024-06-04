package com.example.horizontalrecyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalrecyclerview.data.Currency
import com.example.horizontalrecyclerview.databinding.CurrencyItemBinding

class CurrencyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding:CurrencyItemBinding = CurrencyItemBinding.bind(view)

    fun render(currency: Currency){
        binding.tvName.text = currency.name
        binding.tvValue.text = currency.value.toString()
    }
}