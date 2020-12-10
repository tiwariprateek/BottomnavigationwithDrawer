package com.example.blackcofferassignment.trending

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.fragment_row.view.*

class TrendingAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var data:List<TrendingData> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_row,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is viewHolder ->{
                holder.bind(data.get(position))
            }
        }

    }

    fun submitdata(trendingData: List<TrendingData>){
        data=trendingData
    }
    class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title=itemView.trending_title
        val subtitle=itemView.trending_subtitle

        fun bind(trendingData: TrendingData){
            val string=subtitle.text.toString()
            val text=trendingData.number
            val finalString=text+" $string"
            title.setText(trendingData.data)
            subtitle.setText(finalString)
        }

    }




}