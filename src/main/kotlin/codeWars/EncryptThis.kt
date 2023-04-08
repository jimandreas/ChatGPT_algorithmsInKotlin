@file:Suppress("CascadeIf")

package codeWars

/**
 *
codeWars: EncryptThis!

Please provide a solution in kotlin for the following problem.

Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter of each word in the string must be converted to its ASCII code.
The second letter of each word must be switched with the last letter of each word in the string.
Keepin' it simple: There are no special characters in the input.

The decryption does the opposite of the above to decode the string.

Please provide a function "encryptThis" that takes a text string as input and returns an encrypted string.

Please provide a function "decryptThis" that takes a text string as input and returns the decrypted string.

Please also seperately provide 5 JUNIT5 test cases for encryption of words in a string.
Please also seperately provide 5 JUNIT5 test cases for decryption of words in a string.

Thank you!

NB: added this condition as it wasn't in the problem statement:
Please add a case to the encrypt and decrypt functions for two letter words.
For two letter words only the first letter is converted to its ASCII code
and the second letter is retained unchanged. Thank you.

 */
class EncryptThis {
    fun encryptThis(text: String): String {
        val words = text.split(" ")
        val encryptedWords = words.map { word ->
            if (word.length == 1) {
                word[0].toInt().toString()
            } else if (word.length == 2) {
                "${word[0].toInt()}${word[1]}"
            } else {
                val firstChar = word[0].toInt()
                val secondChar = word[1]
                val lastChar = word[word.length - 1]
                "$firstChar$lastChar${word.substring(2, word.length - 1)}$secondChar"
            }
        }
        return encryptedWords.joinToString(" ")
    }

    // this solution has bugs from ChatGPT
    fun decryptThisTry1(text: String): String {
        val words = text.split(" ")
        val decryptedWords = words.map { word ->
            if (word.length <= 2) {
                word
            } else {
                val firstChar = word.substring(0, 1).toInt()
                val secondChar = word[word.length - 1]
                val middleChars = word.substring(1, word.length - 2)
                "${firstChar.toChar()}$secondChar$middleChars"
            }
        }
        return decryptedWords.joinToString(" ")
    }

    /*

    The decryptThis function has a bug.  The string to be decoded has a number
    at the start of the string to be decoded.  This number needs to be converted
    back to an alpha character.  The remainder of the string needs to follow the rules above.
    Please redo the decryptThis function.

    This function is better but doesn't take into account that:
    (1) the number can range from 32 to 255 i.e. two OR three positions at
    the start of the string and (2) the special case of two character string
    no longer applies to the decryptThis() function.  Please try again.

     */

    fun decryptThisTry2(text: String): String {
        val words = text.split(" ")
        val decryptedWords = words.map { word ->
            if (word.isNotEmpty()) {
                val wordChars = word.toCharArray()
                val firstChar = if (wordChars[0].isDigit()) {
                    val num = when {
                        wordChars.size >= 3 && wordChars[2].isDigit() -> {
                            word.substring(0, 3).toInt()
                        }
                        else -> {
                            wordChars[0].toString().toInt()
                        }
                    }
                    num.toChar()
                } else {
                    wordChars[0]
                }
                val secondChar = wordChars[1]
                val middleChars = word.substring(2)
                "$firstChar$secondChar$middleChars"
            } else {
                word
            }
        }
        return decryptedWords.joinToString(" ")
    }


    /**
    Please create the function named "DecryptThis" in the Kotlin language.
    It takes a string of words.  Each word starts with a number that is two or three digits long.   Lets call this number "First Item".  Remove the number from the string.
    The word then may contain zero or more additional characters.
    If there are additional characters, the first character following the number should be saved. Remove the character from the string.   Let's call this number "Last Item."
    The returned string should consist of the "First Item" converted to an ASCII character, then the remaining characters and lastly the "Last Item" character.
     */

    /*
    response:
    You can call this function with a string of words as the input, and it will return the decrypted string according to the rules you provided. For example:

kotlin
Copy code
val input = "72olle 103doo 100ya"
val decryptedString = DecryptThis(input)
println(decryptedString) // Output: "Hello good day"
In this example, the input string "72olle 103doo 100ya" is decrypted to "Hello good day". The first item in each word is converted to an ASCII character, and the remaining characters along with the last item are kept in the decrypted string.
     */
    fun decryptThisTry3(input: String): String {
        val words = input.split(" ")
        val decryptedWords = mutableListOf<String>()

        for (word in words) {
            if (word.isNotEmpty()) {
                val firstItem = word.takeWhile { it.isDigit() }
                val remainingWord = word.substring(firstItem.length)
                val lastItem = if (remainingWord.isNotEmpty()) remainingWord[0] else null
                val decryptedWord = when {
                    firstItem.isNotEmpty() -> firstItem.toInt().toChar() + remainingWord.substring(1) + lastItem
                    else -> remainingWord + lastItem
                }
                decryptedWords.add(decryptedWord)
            } else {
                decryptedWords.add(word)
            }
        }

        return decryptedWords.joinToString(" ")
    }

    /**
    Sorry I made a mistake.  In the above description, the "Last Item" character should be swapped with the actual last character in the word, if possible.
     */
    /*
    I gave up and wrote the decryptThisTry4 myself using StringBuilder().
     */
    fun decryptThisTry4(input: String): String {
        val words = input.split(" ")
        val decryptedWords = mutableListOf<String>()

        for (word in words) {

            val firstItem = word.takeWhile { it.isDigit() }
            val rest = word.substring(firstItem.length)
            val foo = StringBuilder()
            if (rest.length > 1) {
                foo.append(firstItem.toInt().toChar())
                foo.append(rest[rest.length - 1])
                foo.append(rest.substring(1, rest.length-1))
                foo.append(rest[0])
            } else {
                foo.append(firstItem.toInt().toChar())
                foo.append(rest)
            }
            decryptedWords.add(foo.toString())
        }

        return decryptedWords.joinToString(" ")
    }


}