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

 */
class EncryptThis {
    fun encryptThis(text: String): String {
        val words = text.split(" ")
        val encryptedWords = words.map { word ->
            when {
                word.isEmpty() -> "" // Skip empty words
                word.length == 1 -> word[0].toInt().toString() // Encrypt single-letter words
                else -> {
                    val firstChar = word[0].toInt()
                    val secondChar = word[1]
                    val lastChar = word[word.length - 1]
                    "$firstChar$lastChar${word.substring(2, word.length - 1)}$secondChar"
                }
            }
        }
        return encryptedWords.joinToString(" ")
    }

    fun decryptThis(text: String): String {
        val words = text.split(" ")
        val decryptedWords = words.map { word ->
            when {
                word.isEmpty() -> "" // Skip empty words
                word.length == 1 -> word.toInt().toChar().toString() // Decrypt single-letter words
                else -> {
                    val firstChar = word.substring(0, 1).toInt().toChar()
                    val secondChar = word[word.length - 1]
                    val lastChar = word[word.length - 2]
                    "$firstChar$secondChar${word.substring(1, word.length - 2)}$lastChar"
                }
            }
        }
        return decryptedWords.joinToString(" ")
    }

}