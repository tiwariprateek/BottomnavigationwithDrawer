package com.example.blackcofferassignment.trending

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.fragment_trending.*

/**
 * A simple [Fragment] subclass.
 */
class TrendingFragment : Fragment() {



    private lateinit var adapter: TrendingAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data= TrendingDataSource.createdata()
        adapter= TrendingAdapter()
        adapter.submitdata(data)
        trending_recyclerview.setHasFixedSize(true)
        trending_recyclerview.layoutManager = LinearLayoutManager(this.context)
        trending_recyclerview.adapter = adapter

    }






}
