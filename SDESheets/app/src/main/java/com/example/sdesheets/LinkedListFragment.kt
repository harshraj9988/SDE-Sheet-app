package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class LinkedListFragment : Fragment() {

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

        //Linked List
        problems.add(Problem("Reverse a LinkedList","https://leetcode.com/problems/reverse-linked-list/"))
        problems.add(Problem("Find the middle of LinkedList","https://leetcode.com/problems/middle-of-the-linked-list/"))
        problems.add(Problem("Merge two sorted Linked List (use method used in mergeSort)","https://leetcode.com/problems/merge-two-sorted-lists/"))
        problems.add(Problem("Remove N-th node from back of LinkedList","https://leetcode.com/problems/remove-nth-node-from-end-of-list/"))
        problems.add(Problem("Add two numbers as LinkedList","https://leetcode.com/problems/add-two-numbers/"))
        problems.add(Problem("Delete a given Node when a node is given.(0(1) solution)","https://leetcode.com/problems/delete-node-in-a-linked-list/"))
        problems.add(Problem("Find intersection point of Y LinkedList","https://leetcode.com/problems/intersection-of-two-linked-lists/"))
        problems.add(Problem("Detect a cycle in Linked List","https://leetcode.com/problems/linked-list-cycle/"))
        problems.add(Problem("Reverse a LinkedList in groups of size k.","https://leetcode.com/problems/reverse-nodes-in-k-group/"))
        problems.add(Problem("Check if a LinkedList is palindrome or not.","https://leetcode.com/problems/palindrome-linked-list/"))
        problems.add(Problem("Find the starting point of the Loop of LinkedList","https://leetcode.com/problems/linked-list-cycle-ii/"))
        problems.add(Problem("Flattening of a LinkedList","https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1"))
        problems.add(Problem("Rotate a LinkedList","https://leetcode.com/problems/rotate-list/description/"))
        problems.add(Problem("Clone a Linked List with random and next pointer","https://leetcode.com/problems/copy-list-with-random-pointer/"))
        problems.add(Problem("3 sum","https://leetcode.com/problems/3sum/"))
        problems.add(Problem("Trapping rainwater","https://leetcode.com/problems/trapping-rain-water/"))
        problems.add(Problem("Remove Duplicate from Sorted array","https://leetcode.com/problems/remove-duplicates-from-sorted-array/"))
        problems.add(Problem("Max consecutive ones","https://leetcode.com/problems/max-consecutive-ones/"))


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