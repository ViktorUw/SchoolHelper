package com.example.schoolhelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.schoolhelper.databinding.TaskListItemBinding
import kotlin.random.Random

class ExerciseListAdapter: RecyclerView.Adapter<ExerciseListAdapter.ExerciseListHolder>(){

    class ExerciseListHolder(item: View): RecyclerView.ViewHolder(item){

        val binding = TaskListItemBinding.bind(item)
        val nb_of_list = Random.nextInt(1, 11)
        fun bind(exerciseListElement: ExerciseList){
            binding.apply {
                tvNameOfSubject.text = exerciseListElement.subject.name
                tvNumberOfList.text = "Lista " + nb_of_list.toString()
                tvCountOfTask.text = "Liczba zadań " + exerciseListElement.exercise.count().toString()
                tvGrade.text = "Ocena " + exerciseListElement.grade.toString()


            }

            binding.CWRW.setOnClickListener {
                val action = AllTasksDirections.actionAllTasksToListOfTask(exerciseListElement.id,nb_of_list)
                Navigation.findNavController(itemView).navigate(action)


            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExerciseListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_list_item, parent, false)
        return ExerciseListHolder(view)
    }

    override fun onBindViewHolder(
        holder: ExerciseListHolder,
        position: Int,

    ) {

        holder.bind(ExerciseListProvider.exerciseList[position])

    }

    override fun getItemCount(): Int {
        return ExerciseListProvider.exerciseList.size
    }

}