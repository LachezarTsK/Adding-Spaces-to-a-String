
using System;

public class Solution
{
    private static readonly char ONE_WHITE_SPACE = ' ';

    public string AddSpaces(string input, int[] spaces)
    {
        char[] spacedInput = new char[input.Length + spaces.Length];
        int indexInput = 0;
        int indexSpacedInput = 0;

        for (int i = 0; i < spaces.Length; ++i)
        {
            while (indexInput < spaces[i])
            {
                spacedInput[indexSpacedInput] = input[indexInput];
                ++indexInput;
                ++indexSpacedInput;
            }
            spacedInput[indexSpacedInput] = ONE_WHITE_SPACE;
            ++indexSpacedInput;
        }

        while (indexInput < input.Length)
        {
            spacedInput[indexSpacedInput] = input[indexInput];
            ++indexInput;
            ++indexSpacedInput;
        }

        return new string(spacedInput);
    }
}
