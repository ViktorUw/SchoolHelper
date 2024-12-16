package com.example.schoolhelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.schoolhelper.databinding.EachTaskViewBinding


class ListOfTaskAdapter(): RecyclerView.Adapter<ListOfTaskAdapter.ListOfTaskholder>() {

    private var tasks: List<Exercise> = emptyList()

    class ListOfTaskholder (item: View) : RecyclerView.ViewHolder(item){
        val binding = EachTaskViewBinding.bind(item)

        fun bind(exercise: Exercise, position: Int){
            binding.apply {

                numberOfTask.text = "Zadanie ${position+1} "
                eachTaskPoints.text = "pkt: ${exercise.points}"
                taskContent.text = exercise.content
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListOfTaskholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_task_view, parent, false)
        return ListOfTaskholder(view)

    }

    override fun onBindViewHolder(
        holder: ListOfTaskholder,
        position: Int
    ) {
        holder.bind(tasks[position], position)

    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    fun updateTasks(newTasks: List<Exercise>) {
        tasks = newTasks
        notifyDataSetChanged()

    }


}