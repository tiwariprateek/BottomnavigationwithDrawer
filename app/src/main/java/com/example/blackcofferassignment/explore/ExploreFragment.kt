package com.example.blackcofferassignment.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blackcofferassignment.ItemDecoration
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.fragment_explore.*

/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : Fragment() {
    lateinit var adapter: ExploreAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = ExploreDataSource.createExploreData()
        val decoration= ItemDecoration(30)

        adapter = ExploreAdapter()
        adapter.submitdata(data)
        explore_recyclerview.addItemDecoration(decoration)
        explore_recyclerview.setHasFixedSize(true)
        explore_recyclerview.layoutManager = LinearLayoutManager(this.context)
        explore_recyclerview.adapter = adapter

    }

}
