
public class Solution {

    private static final char ONE_WHITE_SPACE = ' ';

    public String addSpaces(String input, int[] spaces) {
        char[] spacedInput = new char[input.length() + spaces.length];
        int indexInput = 0;
        int indexSpacedInput = 0;

        for (int i = 0; i < spaces.length; ++i) {
            while (indexInput < spaces[i]) {
                spacedInput[indexSpacedInput] = input.charAt(indexInput);
                ++indexInput;
                ++indexSpacedInput;
            }
            spacedInput[indexSpacedInput] = ONE_WHITE_SPACE;
            ++indexSpacedInput;
        }

        while (indexInput < input.length()) {
            spacedInput[indexSpacedInput] = input.charAt(indexInput);
            ++indexInput;
            ++indexSpacedInput;
        }

        return new String(spacedInput);
    }
}
