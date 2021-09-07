package com.scube.ecommercescraper.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.scube.ecommercescraper.R
import com.scube.ecommercescraper.models.Product
import kotlinx.android.synthetic.main.item_product.view.*

class ProductAdapter(
    private val context: Context,
    private var list: ArrayList<Product>,
    private val callBack: (product: Product) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_product, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is MyViewHolder) {
            holder.itemView.apply {
                ivProduct.load(item.image){
                    placeholder(R.drawable.ic_image_error_placeholder)
                    crossfade(500)
                    error(R.drawable.ic_image_error_placeholder)
                }
                tvProductName.text = item.name
                tvProductPrice.text = "Price : ${item.price}"
                tvProductMrp.text = "Mrp : ${item.mrp}"
                btnTrackProduct.setOnClickListener {
                    callBack(item)
                }
            }
        }
    }

    private class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

}