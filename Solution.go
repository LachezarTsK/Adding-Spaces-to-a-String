
package main

import "fmt"

const ONE_WHITE_SPACE byte = ' '

func addSpaces(input string, spaces []int) string {
    spacedInput := make([]byte, len(input) + len(spaces))
    indexInput := 0
    indexSpacedInput := 0

    for i := range spaces {
        for indexInput < spaces[i] {
            spacedInput[indexSpacedInput] = input[indexInput]
            indexInput++
            indexSpacedInput++
        }
        spacedInput[indexSpacedInput] = ONE_WHITE_SPACE
        indexSpacedInput++
    }

    for indexInput < len(input) {
        spacedInput[indexSpacedInput] = input[indexInput]
        indexInput++
        indexSpacedInput++
    }

    return string(spacedInput)
}
