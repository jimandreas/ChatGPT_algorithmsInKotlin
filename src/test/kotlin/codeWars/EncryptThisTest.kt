package codeWars

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EncryptThisTest {

    private val solution = EncryptThis()

    /**
     *
     * It took a couple of tries before ChatGPT removed all the apostrophes from the text strings.
     * Note that the tests still are incorrect - ChatGPT was not "smart enough" to do the actual encoding
     * and decoding of the strings for the test cases, but just made something up.
     *
    There is one more correction to make.
    The word "There's" contains an apostrophe.
    The apostrophe is a non-alpha charater and is not allowed.
    Please recreate the tests using only alpha characters A-z.
     */

    // NOTE that these don't work.  ChatGPT just made up the expected words and they don't match
    /*
    @Test
    fun testEncryptThis() {
        assertEquals("65vitis 119eorit's", solution.encryptThis("Avast we maties"))
        assertEquals("72eello 101yrie 119dlor", solution.encryptThis("Hello EyeDropper world"))
        assertEquals("84ereh 115o 101sepal 110ydnir", solution.encryptThis("There sepal in Indy"))
        assertEquals("98oat 101ta 115eh 119dsan", solution.encryptThis("boat eat she wasnd"))
        assertEquals("78o 111lal 99speeh 109awram", solution.encryptThis("No lola cheeps maraw"))
    }


    @Test
    fun testDecryptThis() {
        assertEquals("Avast we maties", solution.decryptThis("65vitis 119eorit's"))
        assertEquals("Hello EyeDropper world", solution.decryptThis("72eello 101yrie 119dlor"))
        assertEquals("There sepal in Indy", solution.decryptThis("84ereh 115o 101sepal 110ydnir"))
        assertEquals("boat eat she wasnd", solution.decryptThis("98oat 101ta 115eh 119dsan"))
        assertEquals("No lola cheeps maraw", solution.decryptThis("78o 111lal 99speeh 109awram"))
    }
    */


    // test sample given in codewars platform - these work and ecryptThis() passed on the platform
    @Test
    fun testSample() {
        // Example Test Cases
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", solution.encryptThis("A wise old owl lived in an oak"))
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", solution.encryptThis("The more he saw the less he spoke"))
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", solution.encryptThis("The less he spoke the more he heard"))
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", solution.encryptThis("Why can we not all be like that wise old bird"))
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", solution.encryptThis("Thank you Piotr for all your help"))
    }

    @Test
    fun testRoundTrip() {
        var testString = "some test string of letters and stuff"
        assertEquals(testString, solution.decryptThisTry4(solution.encryptThis(testString)))
        testString = "A little and a lot"
        assertEquals(testString, solution.decryptThisTry4(solution.encryptThis(testString)))
    }

}
