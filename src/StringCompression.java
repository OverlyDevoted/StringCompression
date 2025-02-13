
public class StringCompression {
    public static String compressedStringImperative(String word) {
        if (word.isEmpty()) // stops immediately and returns empty string if empty string is passed with the way it was solved had to include an edge case if
            return "";

        char[] characters = word.toCharArray(); // create an array of chars so I could iterate with a loop
        StringBuilder result = new StringBuilder(Character.toString(characters[0])); // A string builder so I could utilize string constructing methods. We immediately append the first character as it's first letter the algorithm will keep track of
        int count = 0; // a counter that keeps track of repeating characters

        for (char character : characters) { // loop that iterates through each letter
            if (result.charAt(result.length() - 1) != character) { // checks if the current last letter in the result is the one we are counting. If yes:
                result.append(String.format("%d%c", count, character)); //append the count and next letter to check
                count = 1; // reset count to 1 because we already are on the current letter, while before the loop we had to start at 0 because we would iterate through the first letter
            } else // If no:
                count++; // it's the current letter we are keeping track of so add one to count
        }

        result.append(count); // add count as it holds the count for the last letter we are checking.

        return result.toString(); // return the result as String.
    }

    public static String decompressedStringImperative(String word) { // read compressStringImperative() first
        if (word.isEmpty()) // same as before
            return "";

        char[] characters = word.toCharArray(); // same as before
        StringBuilder result = new StringBuilder(); // this holds the result

        char curCharacter = 0; // keeps track of the current character. It had to be instantiated to something. It does not matter what value it is as you will see
        StringBuilder counter = new StringBuilder("0"); // This will append to digits to construct a number of occurrences for curCharacter

        for (char character : characters) { // loop through each letter
            if (Character.isLetter(character)) { // if symbol is a letter
                result.append(String.format("%c", curCharacter).repeat(Integer.parseInt(counter.toString()))); // this appends to result a formatted string that is constructed by repeating curCharacter by the number amount stored in counter.
                curCharacter = character; // then set current letter to our new character
                counter = new StringBuilder(); // empty counter
            } else { // if symbol not a letter must be a symbol so add to counter.
                counter.append(character);
            }
        }

        result.append(String.format("%c", curCharacter).repeat(Integer.parseInt(counter.toString()))); // same as in #41. Could be refactored

        return result.toString(); // return result as String
    }
}
