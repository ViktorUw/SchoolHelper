package com.example.schoolhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.schoolhelper.databinding.FragmentListOfTaskBinding


class ListOfTask : Fragment() {

    private lateinit var binding: FragmentListOfTaskBinding
    private val adapter = ListOfTaskAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListOfTaskBinding.inflate(inflater)

        init()


        return binding.root
    }

    private fun init() = with(binding) {
        val exerciseListId = arguments?.let { ListOfTaskArgs.fromBundle(it).exerciseListId }
        val num_of_list = arguments?.let { ListOfTaskArgs.fromBundle(it).nbOfTask }
        val exerciseList = ExerciseListProvider.exerciseList.find { it.id == exerciseListId }

        exerciseList?.let {
            adapter.updateTasks(it.exercise)
        }
        val subject = exerciseList?.subject?.name.toString()
        binding.tvNameOfSubjectLOT.text = "Przedmiot $subject"
        binding.tvNumberOfListLOT.text = "Lista $num_of_list"


        listOfTaskRv.layoutManager = LinearLayoutManager(requireContext())
        listOfTaskRv.adapter = adapter
    }


}