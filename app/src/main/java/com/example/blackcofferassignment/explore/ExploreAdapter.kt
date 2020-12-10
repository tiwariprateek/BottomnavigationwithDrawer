package com.example.blackcofferassignment.explore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.explore_row.view.*

class ExploreAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var data:List<ExploreData> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.explore_row,
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
    fun submitdata(exploreData: List<ExploreData>){
        data=exploreData

    }
    class viewHolder(view:View):RecyclerView.ViewHolder(view){
        val image=view.saved_image
        val user=view.saved_username
        val tweet=view.saved_tweet
        val hashtag=view.saved_hashtags
        val subtitle=view.saved_subtitle

        fun bind(exploreData: ExploreData){
            image.setImageResource(exploreData.image)
            user.setText(exploreData.user)
            tweet.setText(exploreData.tweet)
            hashtag.setText(exploreData.hashtags)
            subtitle.setText(exploreData.subtitle)

        }

    }
}