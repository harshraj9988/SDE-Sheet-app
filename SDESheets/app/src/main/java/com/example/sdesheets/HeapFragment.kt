package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class HeapFragment : Fragment() {

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

        //Heap
        problems.add(Problem("Max heap, Min Heap Implementation (Only for interviews)","https://www.codingninjas.com/codestudio/problems/min-heap_4691801?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website"))
        problems.add(Problem("Kth Largest Element","https://leetcode.com/problems/kth-largest-element-in-an-array/"))
        problems.add(Problem("Maximum Sum Combination","https://www.interviewbit.com/problems/maximum-sum-combinations/"))
        problems.add(Problem("Find Median from Data Stream","https://leetcode.com/problems/find-median-from-data-stream/"))
        problems.add(Problem("Merge K sorted arrays","https://www.codingninjas.com/codestudio/problems/merge-k-sorted-arrays_975379"))
        problems.add(Problem("K most frequent elements","https://leetcode.com/problems/top-k-frequent-elements/"))



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