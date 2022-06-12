package com.example.sdesheets

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CategoryAdapter(fragmentManager: FragmentManager, var context: Context) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 13
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return ArrayFragment()
            }
            1 -> {
                return LinkedListFragment()
            }
            2 -> {
                return GreedyAlgorithmFragment()
            }
            3 -> {
                return RecursionFragment()
            }
            4 -> {
                return BacktrackingFragment()
            }
            5 -> {
                return BinarySearchFragment()
            }
            6 -> {
                return HeapFragment()
            }
            7 -> {
                return StackQueueFragment()
            }
            8 -> {
                return StringFragment()
            }
            9 -> {
                return BinaryTreeFragment()
            }
            10 -> {
                return GraphFragment()
            }
            11 -> {
                return DynamicProgrammingFragment()
            }
            12 -> {
                return TrieFragment()
            }
            else -> {
                return ArrayFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        when (position) {
            0 -> {
                return  getText(R.string.array)
            }
            1 -> {
                return  getText(R.string.linked_list)
            }
            2 -> {
                return  getText(R.string.greedy_algorithm)
            }
            3 -> {
                return  getText(R.string.recursion)
            }
            4 -> {
                return  getText(R.string.backtracking)
            }
            5 -> {
                return  getText(R.string.binary_search)
            }
            6 -> {
                return  getText(R.string.heap)
            }
            7 -> {
                return  getText(R.string.stack_queue)
            }
            8 -> {
                return  getText(R.string.string)
            }
            9 -> {
                return  getText(R.string.binary_tree)
            }
            10 -> {
                return  getText(R.string.graph)
            }
            11 -> {
                return  getText(R.string.dynamic_programming)
            }
            12 -> {
                return  getText(R.string.trie)
            }
            else -> {
                return  getText(R.string.array)
            }
        }
    }

    private fun getText(id: Int): CharSequence = context.getString(id)

}