package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class BacktrackingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<ProblemListviewBinding>(
            inflater,
            R.layout.problem_listview,
            container,
            false
        )

        val problems = ArrayList<Problem>()
        //Backtracking
        problems.add(Problem("Print all permutations of a string/array","https://leetcode.com/problems/permutations/"))
        problems.add(Problem("N queens Problem","https://leetcode.com/problems/n-queens/"))
        problems.add(Problem("Sudoku Solver","https://leetcode.com/problems/sudoku-solver/"))
        problems.add(Problem("M coloring Problem","https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#"))
        problems.add(Problem("Rat in a Maze","https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1"))
        problems.add(Problem("Word Break (print all ways)","https://bit.ly/3FxgW92"))


        val adapter = ProblemAdapter(binding.root, problems)

        binding.problemList.adapter = adapter

        binding.invalidateAll()

        binding.problemList.setOnItemClickListener { parent, view, position, id ->
            val problem = adapter.getItem(position)
            val intent = Intent(Intent.ACTION_VIEW, problem!!.url)
            startActivity(intent)
        }

        return binding.root
    }

}