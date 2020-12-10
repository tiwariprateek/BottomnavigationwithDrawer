package com.example.blackcofferassignment.trending

import com.example.blackcofferassignment.trending.TrendingData

class TrendingDataSource {

    companion object{
        fun createdata():ArrayList<TrendingData>{
            val list=ArrayList<TrendingData>()
            list.add(
                TrendingData(
                    "#techmonday", "10"
                )
            )
            list.add(
                TrendingData(
                    "#covid-19", "11"
                )
            )
            list.add(
                TrendingData(
                    "#lockdown", "3"
                )
            )
            list.add(
                TrendingData(
                    "#fifa cup", "90"
                )
            )
            list.add(
                TrendingData(
                    "#foodie", "19"
                )
            )
            list.add(
                TrendingData(
                    "#guruji", "16"
                )
            )
            list.add(
                TrendingData(
                    "#startup", "10"
                )
            )
            list.add(
                TrendingData(
                    "#techtuesday", "22"
                )
            )
            list.add(
                TrendingData(
                    "#chai", "7"
                )
            )
            list.add(
                TrendingData(
                    "blackcoffer", "109"
                )
            )
            return list
        }
    }
}
