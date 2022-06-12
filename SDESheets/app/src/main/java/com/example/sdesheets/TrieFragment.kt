package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class TrieFragment : Fragment() {

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

        //Trie
        problems.add(Problem("Implement Trie","https://leetcode.com/problems/implement-trie-prefix-tree/"))
        problems.add(Problem("Implement Trie 2","https://bit.ly/3I8Q9l7"))
        problems.add(Problem("Longest string with all prefixes","https://bit.ly/3n3kedU"))
        problems.add(Problem("Number of distinct substrings in a string","https://bit.ly/3ocRQW0"))
        problems.add(Problem("Power set","https://practice.geeksforgeeks.org/problems/power-set4302/1#"))
        problems.add(Problem("Maximum XOR of two numbers in an array","https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/"))
        problems.add(Problem("Maximum XOR with an element from array","https://leetcode.com/problems/maximum-xor-with-an-element-from-array/"))


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