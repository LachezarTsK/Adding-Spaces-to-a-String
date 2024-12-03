
/**
 * @param {string} input
 * @param {number[]} spaces
 * @return {string}
 */
var addSpaces = function (input, spaces) {
    const ONE_WHITE_SPACE = ' ';
    const spacedInput = new Array(input.length + spaces.length);
    let indexInput = 0;
    let indexSpacedInput = 0;

    for (let i = 0; i < spaces.length; ++i) {
        while (indexInput < spaces[i]) {
            spacedInput[indexSpacedInput] = input.charAt(indexInput);
            ++indexInput;
            ++indexSpacedInput;
        }
        spacedInput[indexSpacedInput] = ONE_WHITE_SPACE;
        ++indexSpacedInput;
    }

    while (indexInput < input.length) {
        spacedInput[indexSpacedInput] = input.charAt(indexInput);
        ++indexInput;
        ++indexSpacedInput;
    }

    return spacedInput.join('');
};
