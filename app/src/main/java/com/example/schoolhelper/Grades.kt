package com.example.schoolhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.schoolhelper.databinding.FragmentGradesBinding

class Grades : Fragment() {

    private lateinit var binding: FragmentGradesBinding
    private val adapter = GradeListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGradesBinding.inflate(inflater)

        init()
        return binding.root

    }

    private fun init() = with(binding){
        allGradesRv.layoutManager = LinearLayoutManager(requireActivity())
        allGradesRv.adapter = adapter
    }

}