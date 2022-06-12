package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class StackQueueFragment : Fragment() {

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

        //Stack and Queue
        problems.add(Problem("Implement Stack Using Arrays","https://bit.ly/3KbHhN4"))
        problems.add(Problem("Implement Queue Using Arrays","https://bit.ly/3KbIjIW"))
        problems.add(Problem("Implement Stack using Queue (using single queue)","https://leetcode.com/problems/implement-stack-using-queues/"))
        problems.add(Problem("Implement Queue using Stack (0(1) amortized method)","https://leetcode.com/problems/implement-queue-using-stacks/"))
        problems.add(Problem("Check for balanced parentheses","https://leetcode.com/problems/valid-parentheses/"))
        problems.add(Problem("Next Greater Element","https://leetcode.com/problems/next-greater-element-i/"))
        problems.add(Problem("Sort a Stack","https://bit.ly/3nptF7k"))
        problems.add(Problem("Next Smaller Element","https://www.interviewbit.com/problems/nearest-smaller-element/"))
        problems.add(Problem("LRU cache (IMPORTANT)","https://leetcode.com/problems/lru-cache/"))
        problems.add(Problem("LFU Cache","https://leetcode.com/problems/lfu-cache/"))
        problems.add(Problem("Largest rectangle in a histogram","https://leetcode.com/problems/largest-rectangle-in-histogram/"))
        problems.add(Problem("Sliding Window maximum","https://leetcode.com/problems/sliding-window-maximum/"))
        problems.add(Problem("Implement Min Stack","https://leetcode.com/problems/min-stack/"))
        problems.add(Problem("Rotten Orange (Using BFS)","https://leetcode.com/problems/rotting-oranges/"))
        problems.add(Problem("Stock Span Problem","https://leetcode.com/problems/online-stock-span/"))
        problems.add(Problem("Find the maximum of minimums of every window size","https://bit.ly/3zUYLZz"))
        problems.add(Problem("The Celebrity Problem","https://leetcode.com/accounts/login/?next=/problems/find-the-celebrity/"))


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