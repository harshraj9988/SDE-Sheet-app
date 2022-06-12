package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class GraphFragment : Fragment() {

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

        //Graph

        problems.add(Problem("Clone a graph (Not that easy as it looks)","https://leetcode.com/problems/clone-graph/"))
        problems.add(Problem("DFS","https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1"))
        problems.add(Problem("BFS","https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1"))
        problems.add(Problem("Detect A cycle in Undirected Graph using BFS","https://leetcode.com/problems/course-schedule/"))
        problems.add(Problem("Detect A cycle in Undirected Graph using DFS","https://leetcode.com/problems/course-schedule/"))
        problems.add(Problem("Detect A cycle in a Directed Graph using DFS","https://leetcode.com/problems/course-schedule/"))
        problems.add(Problem("Detect A cycle in a Directed Graph using BFS","https://leetcode.com/problems/course-schedule/"))
        problems.add(Problem("Topological Sort BFS","https://practice.geeksforgeeks.org/problems/topological-sort/1"))
        problems.add(Problem("Topological Sort DFS","https://practice.geeksforgeeks.org/problems/topological-sort/1"))
        problems.add(Problem("Number of islands(Do in Grid and Graph Both)","https://leetcode.com/problems/number-of-islands/"))
        problems.add(Problem("Bipartite Check using BFS","https://leetcode.com/problems/is-graph-bipartite/"))
        problems.add(Problem("Bipartite Check using DFS","https://leetcode.com/problems/is-graph-bipartite/"))
        problems.add(Problem("Strongly Connected Component(using KosaRaju’s algo)","https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/discuss/766485/kosaraju-algorithm-on"))
        problems.add(Problem("Dijkstra’s Algorithm","https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1"))
        problems.add(Problem("Bellman-Ford Algo","https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/0/?fbclid=IwAR2_lL0T84DnciLyzMTQuVTMBOi82nTWNLuXjUgahnrtBgkphKiYk6xcyJU"))
        problems.add(Problem("Floyd Warshall Algorithm","https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1"))
        problems.add(Problem("MST using Prim’s Algo","https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1"))
        problems.add(Problem("MST using Kruskal’s Algo","https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1"))


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