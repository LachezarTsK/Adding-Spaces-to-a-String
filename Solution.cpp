
#include <string>
#include <vector>
using namespace std;

class Solution {

    static const char ONE_WHITE_SPACE = ' ';

public:
    string addSpaces(const string& input, const vector<int>& spaces) const {
        string spacedInput;
        spacedInput.resize(input.size() + spaces.size());
        int indexInput = 0;
        int indexSpacedInput = 0;

        for (size_t i = 0; i < spaces.size(); ++i) {
            while (indexInput < spaces[i]) {
                spacedInput[indexSpacedInput] = input[indexInput];
                ++indexInput;
                ++indexSpacedInput;
            }
            spacedInput[indexSpacedInput] = ONE_WHITE_SPACE;
            ++indexSpacedInput;
        }

        while (indexInput < input.length()) {
            spacedInput[indexSpacedInput] = input[indexInput];
            ++indexInput;
            ++indexSpacedInput;
        }

        return spacedInput;
    }
};
