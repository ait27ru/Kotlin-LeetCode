package problems.medium

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class RevealCardsInIncreasingOrderTest {

    private val solution = RevealCardsInIncreasingOrder()

    @Test
    fun deckRevealedIncreasing_ShouldSatisfy_Example1() {
        // arrange
        val deck = intArrayOf(17, 13, 11, 2, 3, 5, 7)
        // act
        val reorderedDeck = solution.deckRevealedIncreasing(deck)
        // assert
        assertArrayEquals(intArrayOf(2, 13, 3, 11, 5, 17, 7), reorderedDeck)
    }

    @Test
    fun deckRevealedIncreasing_ShouldSatisfy_Example2() {
        // arrange
        val deck = intArrayOf(1, 1000)
        // act
        val reorderedDeck = solution.deckRevealedIncreasing(deck)
        // assert
        assertArrayEquals(intArrayOf(1, 1000), reorderedDeck)
    }
}