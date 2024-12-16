package com.example.schoolhelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.schoolhelper.ExerciseListProvider.exerciseList

import com.example.schoolhelper.databinding.GradesItemBinding
import kotlin.random.Random

class GradeListAdapter : RecyclerView.Adapter<GradeListAdapter.GradeListHolder>() {
    val subjectGrades = generateSubjectAverageList(exerciseList)


    class GradeListHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = GradesItemBinding.bind(item)


        fun bind(subjectGradeElement : Pair<Subject, Double>){
            binding.apply {

                tvGradesNameOfSubject.text = subjectGradeElement.first.name
//                    tvGradesNameOfSubject.text = exerciseListElement.subject.name
                tvGradeCountOfLists.text = "Liczba list: " + Random.nextInt(1, 11).toString()
//                    tvGradesAverageGrade.text = "Średnia: " + exerciseListElement.grade.toString()
                tvGradesAverageGrade.text = "Średnia: " + subjectGradeElement.second.toString()

            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GradeListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grades_item, parent, false)
        return GradeListHolder(view)
    }

    override fun onBindViewHolder(
        holder: GradeListHolder,
        position: Int
    ) {
        holder.bind(subjectGrades[position])
    }

    override fun getItemCount(): Int {
        return subjectGrades.size
    }

}