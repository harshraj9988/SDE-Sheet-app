package com.example.sdesheets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ProblemAdapter(
    private val view: View,
    private val problems: ArrayList<Problem>
) : ArrayAdapter<Problem>(view.context, 0, problems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listView: View? = convertView
        if(listView == null){
            listView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val currentProblem : Problem = getItem(position)!!

        val problemTextview: TextView = listView!!.findViewById(R.id.problem_title_textview)
        problemTextview.text = currentProblem.title

        return listView
    }
}