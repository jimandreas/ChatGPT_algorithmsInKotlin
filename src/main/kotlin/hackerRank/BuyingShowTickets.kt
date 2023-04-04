@file:Suppress("LiftReturnOrAssignment")

package hackerRank

class BuyingShowTickets {
    fun waitingTime(tickets: IntArray, p: Int): Long {
        var time: Long = 0
        var ticketsLeft = tickets.copyOf()

        while (ticketsLeft[p] != 0) {
            for (i in ticketsLeft.indices) {
                if (ticketsLeft[i] > 0) {
                    ticketsLeft[i]--
                    time++
                    if (i == p && ticketsLeft[p] == 0) {
                        return time
                    }
                }
            }
        }
        return time
    }



}