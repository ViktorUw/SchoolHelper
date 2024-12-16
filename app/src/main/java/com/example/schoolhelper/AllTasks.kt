package com.example.schoolhelper

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.core.TargetBasedAnimation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.schoolhelper.databinding.FragmentAllTasksBinding
import com.example.schoolhelper.databinding.TaskListItemBinding

class AllTasks : Fragment() {

    private lateinit var binding: FragmentAllTasksBinding
    private val adapter = ExerciseListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAllTasksBinding.inflate(inflater)

        init()
        return binding.root
    }


    private fun init() = with(binding){
        allTaskListRv.layoutManager = LinearLayoutManager(requireContext())
        allTaskListRv.adapter = adapter


    }
}