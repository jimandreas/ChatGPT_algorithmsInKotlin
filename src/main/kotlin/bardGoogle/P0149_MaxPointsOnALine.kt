@file:Suppress("ClassName", "ReplaceManualRangeWithIndicesCalls")

package bardGoogle

/*
 * this code (a) doesn't compile and (b) doesn't use a appropriate
 * parameter types for the linePoints map (should use a float or double).
 *
 * IMPLICATION - wait a few months to see if Bard code generation gets better.
 */
class P0149_MaxPointsOnALine {

    /*fun maxPoints(points: Array<IntArray>): Int {
        // Create a map to store the number of points that lie on each straight line.
        val linePoints = mutableMapOf<List<Int>, Int>()
        for (i in 0 until points.size) {
            for (j in i + 1 until points.size) {
                // Calculate the slope of the line between the two points.
                val slope = (points[j][1] - points[i][1]) / (points[j][0] - points[i][0])
                // If the slope is not already in the map, add it with a count of 1.
                if (!linePoints.containsKey(slope)) {
                    linePoints[slope] = 1
                } else {
                    // Otherwise, increment the count for the slope.
                    linePoints[slope] = linePoints[slope]!! + 1
                }
            }
        }

        // Return the maximum number of points on any one straight line.
        return linePoints.values.max() ?: 0
    }*/

}