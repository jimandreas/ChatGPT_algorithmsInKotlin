package bardGoogle

/**
 * Please write a kotlin algorithm that solves the Konigsberg Bridge Problem
 */

/*
Bard:
This algorithm works by creating a graph where each vertex represents a
landmass and each edge represents a bridge. It then initializes a set to
track the vertices that have been visited. Finally, it recursively tries
to find a path that visits all of the bridges. If a path is found, the
algorithm returns true; otherwise, it returns false.
 */

class SevenBridgesOfKonigsberg {

    fun solveKonigsbergBridgeProblem(graph: Map<String, MutableList<String>>): Boolean {
        // Initialize a set to track the vertices that have been visited.
        val visited = mutableSetOf<String>()

        // Recursively try to find a path that visits all of the bridges.
        fun dfs(vertex: String): Boolean {
            if (visited.contains(vertex)) {
                return false
            }

            visited.add(vertex)

            for (neighbor in graph[vertex] ?: return false) {
                if (dfs(neighbor)) {
                    return true
                }
            }

            visited.remove(vertex)

            return false
        }

        // Try to find a path that visits all of the bridges, starting from any landmass.
        for (landmass in graph.keys) {
            if (dfs(landmass)) {
                return true
            }
        }

        // No path exists that visits all of the bridges.
        return false
    }
}