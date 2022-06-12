package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class RecursionFragment : Fragment() {

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
        //Recursion
        problems.add(Problem("Subset Sums","https://practice.geeksforgeeks.org/problems/subset-sums2234/1"))
        problems.add(Problem("Subset-II","https://leetcode.com/problems/subsets-ii/"))
        problems.add(Problem("Combination sum-1","https://leetcode.com/problems/combination-sum/"))
        problems.add(Problem("Combination sum-2","https://leetcode.com/problems/combination-sum-ii/"))
        problems.add(Problem("Palindrome Partitioning","https://leetcode.com/problems/palindrome-partitioning/"))
        problems.add(Problem("K-th permutation Sequence","https://leetcode.com/problems/permutation-sequence/"))


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