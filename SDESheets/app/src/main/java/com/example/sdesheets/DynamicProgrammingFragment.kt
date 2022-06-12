package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class DynamicProgrammingFragment : Fragment() {

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

        //DP
        problems.add(Problem("Max Product Subarray","https://leetcode.com/problems/maximum-product-subarray/"))
        problems.add(Problem("Longest Increasing Subsequence","https://leetcode.com/problems/longest-increasing-subsequence/"))
        problems.add(Problem("Longest Common Subsequence","https://leetcode.com/problems/longest-common-subsequence/"))
        problems.add(Problem("0-1 Knapsack","https://leetcode.com/problems/ones-and-zeroes/"))
        problems.add(Problem("Edit Distance","https://leetcode.com/problems/edit-distance/"))
        problems.add(Problem("Maximum sum increasing subsequence","https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1"))
        problems.add(Problem("Matrix Chain Multiplication","https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1"))
        problems.add(Problem("Minimum sum path in the matrix, (count paths and similar type do, also backtrack to find the Minimum path)","https://leetcode.com/problems/minimum-path-sum/"))
        problems.add(Problem("Coin change","https://leetcode.com/problems/coin-change/"))
        problems.add(Problem("Subset Sum","https://leetcode.com/problems/partition-equal-subset-sum/"))
        problems.add(Problem("Rod Cutting","https://leetcode.com/problems/minimum-cost-to-cut-a-stick/"))
        problems.add(Problem("Egg Dropping","https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1"))
        problems.add(Problem("Word Break","https://practice.geeksforgeeks.org/problems/word-break1352/1"))
        problems.add(Problem("Palindrome Partitioning (MCM Variation)","https://practice.geeksforgeeks.org/problems/palindromic-patitioning4845/1"))
        problems.add(Problem("Maximum profit in Job scheduling","https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1"))


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