package problems.medium

/*
    https://leetcode.com/problems/reveal-cards-in-increasing-order/description

    You are given an integer array deck. There is a deck of cards where every card has a unique integer.
    The integer on the ith card is deck[i].
    You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.
    You will do the following steps repeatedly until all cards are revealed:
    Take the top card of the deck, reveal it, and take it out of the deck.
    If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
    If there are still unrevealed cards, go back to step 1. Otherwise, stop.
    Return an ordering of the deck that would reveal the cards in increasing order.
    Note that the first entry in the answer is considered to be the top of the deck.
*/

class RevealCardsInIncreasingOrder {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        // task constraints
        require(deck.size in 1..1000)
        require(deck.max() <= 1_000_000)
        require(deck.min() >= 1)
        require(deck.distinct().size == deck.size) { "deck must contain unique elements." }

        deck.sort()
        val res = IntArray(deck.size)
        val q = ArrayDeque<Int>().apply {
            addAll(deck.indices)
        }
        for (n in deck) {
            val i = q.removeFirst()
            res[i] = n
            if (!q.isEmpty()) {
                q.addLast(q.removeFirst())
            }
        }
        return res
    }
}