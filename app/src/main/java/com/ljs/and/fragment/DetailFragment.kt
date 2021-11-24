package com.ljs.and.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ljs.and.fragment.databinding.FragmentDetailBinding
import com.ljs.and.fragment.databinding.FragmentListBinding

class DetailFragment : Fragment() {

    var mainActivity: MainActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.fragment_detail, container, false)
        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.btnBack.setOnClickListener { mainActivity?.goBack() }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }
}