package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class ArrayFragment : Fragment() {
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

        //Arrays
        problems.add(Problem("Set Matrix Zero", "https://leetcode.com/problems/set-matrix-zeroes/"))
        problems.add(Problem("Pascal's Triangle","https://leetcode.com/problems/pascals-triangle/"))
        problems.add(Problem("Next Permutation","https://leetcode.com/problems/pascals-triangle/"))
        problems.add(Problem("Kadane's Algorithm","https://leetcode.com/problems/maximum-subarray/"))
        problems.add(Problem("Sort an array of 0's 1's 2's","https://leetcode.com/problems/sort-colors/"))
        problems.add(Problem("Stock buy and sell","https://leetcode.com/problems/best-time-to-buy-and-sell-stock/"))
        problems.add(Problem("Rotate Matrix","https://leetcode.com/problems/rotate-image/"))
        problems.add(Problem("Merge overlapping subintervals","https://leetcode.com/problems/merge-intervals/"))
        problems.add(Problem("Merge two sorted arrays","https://leetcode.com/problems/merge-sorted-array/"))
        problems.add(Problem("Find the duplicate in an array of N+1 integers","https://leetcode.com/problems/find-the-duplicate-number/"))
        problems.add(Problem("Repeat and Missing Number","https://www.interviewbit.com/problems/repeat-and-missing-number-array/"))
        problems.add(Problem("Inversion of Array","https://www.codingninjas.com/codestudio/problems/count-inversions_615"))
        problems.add(Problem("Search in a 2d matrix","https://leetcode.com/problems/search-a-2d-matrix/"))
        problems.add(Problem("Pow(x,n)","https://leetcode.com/problems/powx-n/"))
        problems.add(Problem("Majority element","https://leetcode.com/problems/majority-element/"))
        problems.add(Problem("Majority element 2","https://leetcode.com/problems/majority-element-ii/"))
        problems.add(Problem("Grid unique paths","https://leetcode.com/problems/unique-paths/"))
        problems.add(Problem("Reverse pairs","https://leetcode.com/problems/reverse-pairs/"))
        problems.add(Problem("2 Sum","https://leetcode.com/problems/two-sum/"))
        problems.add(Problem("4 Sum","https://leetcode.com/problems/4sum/"))
        problems.add(Problem("Longest consecutive sequence","https://leetcode.com/problems/longest-consecutive-sequence/"))
        problems.add(Problem("Largest sub-array with 0 sum","https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1"))
        problems.add(Problem("Count number of sub-array with given XOR K","https://www.interviewbit.com/problems/subarray-with-given-xor/"))
        problems.add(Problem("Longest substring without repeat","https://leetcode.com/problems/longest-substring-without-repeating-characters/"))


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

