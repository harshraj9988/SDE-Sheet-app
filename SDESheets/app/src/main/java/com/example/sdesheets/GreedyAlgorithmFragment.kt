package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class GreedyAlgorithmFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<ProblemListviewBinding>(
            inflater,
            R.layout.problem_listview,
            container,
            false
        )

        val problems = ArrayList<Problem>()
        //Greedy Algorith
        problems.add(Problem("N meetings in one room","https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1"))
        problems.add(Problem("Minimum number of platforms required for a railway","https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#"))
        problems.add(Problem("Job sequencing Problem","https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#"))
        problems.add(Problem("Fractional Knapsack Problem","https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1"))
        problems.add(Problem("Greedy algorithm to find minimum number of coins","https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/"))
        problems.add(Problem("Activity Selection (it is the same as N meeting in one room)","https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1"))


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