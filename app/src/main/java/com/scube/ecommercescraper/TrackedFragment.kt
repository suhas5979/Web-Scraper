package com.scube.ecommercescraper

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.scube.ecommercescraper.adapters.ProductAdapter
import com.scube.ecommercescraper.adapters.TrackedProductAdapter
import com.scube.ecommercescraper.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_tracked.*
import kotlinx.android.synthetic.main.fragment_tracked.view.*

@AndroidEntryPoint
class TrackedFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var mView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_tracked, container, false)
        subscribeToObservers()
        mView.ibBack.setOnClickListener {
            findNavController().navigate(R.id.action_trackedFragment_to_homeFragment)
        }

        return mView
    }

    private fun subscribeToObservers() {
        mainViewModel.readTrackedProducts.observe(requireActivity()) { trackedProducts ->
            if (trackedProducts.isNotEmpty()) {
                val adapter = TrackedProductAdapter(requireActivity(), ArrayList(trackedProducts))
                mView.rvTrackedProducts.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
                mView.rvTrackedProducts.adapter = adapter
            } else {
            }

        }
    }
}