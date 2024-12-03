
class Solution {

    private companion object {
        const val ONE_WHITE_SPACE = ' '
    }

    fun addSpaces(input: String, spaces: IntArray): String {
        val spacedInput = CharArray(input.length + spaces.size)
        var indexInput = 0
        var indexSpacedInput = 0

        for (i in spaces.indices) {
            while (indexInput < spaces[i]) {
                spacedInput[indexSpacedInput] = input[indexInput]
                ++indexInput
                ++indexSpacedInput
            }
            spacedInput[indexSpacedInput] = ONE_WHITE_SPACE
            ++indexSpacedInput
        }

        while (indexInput < input.length) {
            spacedInput[indexSpacedInput] = input[indexInput]
            ++indexInput
            ++indexSpacedInput
        }

        return String(spacedInput)
    }
}
