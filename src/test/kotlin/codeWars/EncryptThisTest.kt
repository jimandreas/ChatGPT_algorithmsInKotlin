package codeWars

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EncryptThisTest {

    private val solution = EncryptThis()


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

}
