package com.example.horizontalrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalrecyclerview.R
import com.example.horizontalrecyclerview.data.Currency

class CurrencyAdapter(val listCurrency: List<Currency>): RecyclerView.Adapter<CurrencyViewHolder>() {

    // Retorna un objeto viewHolder con un layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CurrencyViewHolder(layoutInflater.inflate(R.layout.currency_item, parent, false))
    }

    // Tamaño de la lista
    override fun getItemCount() = listCurrency.size

    // Tomar cada una de las posiciones de mi lista, y se la pasa a la clase viewHolder para que la pinte
    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val item = listCurrency[position]
        holder.render(item)
    }
}