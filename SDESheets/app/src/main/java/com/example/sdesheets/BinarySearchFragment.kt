package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding

class BinarySearchFragment : Fragment() {


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

        //Binary Search
        problems.add(Problem("The N-th root of an integer","https://bit.ly/3rj7Ib1"))
        problems.add(Problem("Matrix Median","https://www.interviewbit.com/problems/matrix-median/"))
        problems.add(Problem("Find the element that appears once in a sorted array, and the rest element appears twice (Binary search)","https://leetcode.com/problems/single-element-in-a-sorted-array/"))
        problems.add(Problem("Search element in a sorted and rotated array/ find pivot where it is rotated","https://leetcode.com/problems/search-in-rotated-sorted-array/"))
        problems.add(Problem("Median of 2 sorted arrays","https://leetcode.com/problems/median-of-two-sorted-arrays/"))
        problems.add(Problem("K-th element of two sorted arrays","https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1"))
        problems.add(Problem("Allocate Minimum Number of Pages","https://www.interviewbit.com/problems/allocate-books/"))
        problems.add(Problem("Aggressive Cows","https://bit.ly/3zV52ob"))


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