package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class StringFragment : Fragment() {


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

        //String
        problems.add(Problem("Reverse Words in a String","https://leetcode.com/problems/reverse-words-in-a-string/"))
        problems.add(Problem("Longest Palindrome in a string","https://leetcode.com/problems/longest-palindromic-substring/"))
        problems.add(Problem("Roman Number to Integer and vice versa","https://leetcode.com/problems/roman-to-integer/"))
        problems.add(Problem("Implement ATOI/STRSTR","https://leetcode.com/problems/string-to-integer-atoi/"))
        problems.add(Problem("Longest Common Prefix","https://leetcode.com/problems/longest-common-prefix/"))
        problems.add(Problem("Rabin Karp","https://leetcode.com/problems/repeated-string-match/discuss/416144/Rabin-Karp-algorithm-C%2B%2B-implementation"))
        problems.add(Problem("Z-Function","https://leetcode.com/problems/implement-strstr/"))
        problems.add(Problem("KMP algo / LPS(pi) array","https://leetcode.com/problems/implement-strstr/"))
        problems.add(Problem("Minimum characters needed to be inserted in the beginning to make it palindromic","https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/"))
        problems.add(Problem("Check for Anagrams","https://leetcode.com/problems/valid-anagram/"))
        problems.add(Problem("Count and Say","https://leetcode.com/problems/count-and-say/"))
        problems.add(Problem("Compare version numbers","https://leetcode.com/problems/compare-version-numbers/"))


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