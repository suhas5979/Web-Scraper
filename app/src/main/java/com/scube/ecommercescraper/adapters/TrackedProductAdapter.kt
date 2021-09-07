package com.scube.ecommercescraper.adapters

import android.content.Context
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.scube.ecommercescraper.R
import com.scube.ecommercescraper.data.entities.TrackedProductEntity
import kotlinx.android.synthetic.main.item_tracked_product.view.*
import java.text.SimpleDateFormat

class TrackedProductAdapter(
    private val context: Context,
    private var list: ArrayList<TrackedProductEntity>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_tracked_product, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is MyViewHolder) {
            holder.itemView.apply {
                ivTrackedProduct.load(item.product.image){
                    placeholder(R.drawable.ic_image_error_placeholder)
                    crossfade(500)
                    error(R.drawable.ic_image_error_placeholder)
                }
                tvTrackedProductName.text = item.product.name
                tvTrackedProductPrice.text = "Price : ${item.product.price}"
                tvTrackedProductMrp.text = "Mrp : ${item.product.mrp}"
                val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
                tvTrackedProductTimeStamp.text =
                    "Tracked From ${simpleDateFormat.format(item.timeStamp)}"
            }
        }
    }

    private class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

}