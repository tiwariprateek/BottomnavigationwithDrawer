package com.example.blackcofferassignment.save

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blackcofferassignment.ItemDecoration
import com.example.blackcofferassignment.R
import kotlinx.android.synthetic.main.fragment_saved.*

/**
 * A simple [Fragment] subclass.
 */
class SavedFragment : Fragment() {
    lateinit var adapter: SaveAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = SaveDataSource.createExploreData()
        val decoration= ItemDecoration(30)

        adapter = SaveAdapter()
        adapter.submitdata(data)
        saved_recyclerview.addItemDecoration(decoration)
        saved_recyclerview.setHasFixedSize(true)
        saved_recyclerview.layoutManager = LinearLayoutManager(this.context)
        saved_recyclerview.adapter = adapter
    }

}
