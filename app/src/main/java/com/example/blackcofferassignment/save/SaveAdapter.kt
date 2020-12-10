package com.example.blackcofferassignment.save

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.saved_row.view.*

class SaveAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var data:List<SaveData> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.saved_row,
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
    fun submitdata(saveData: List<SaveData>){
        data=saveData

    }
    class viewHolder(view:View):RecyclerView.ViewHolder(view){
        val image=view.saved_image
        val user=view.saved_username
        val tweet=view.saved_tweet
        val hashtag=view.saved_hashtags
        val subtitle=view.saved_subtitle

        fun bind(saveData: SaveData){
            image.setImageResource(saveData.image)
            user.setText(saveData.user)
            tweet.setText(saveData.tweet)
            hashtag.setText(saveData.hashtags)
            subtitle.setText(saveData.subtitle)

        }

    }
}