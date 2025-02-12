public class StringCompression {
    public static String compressedStringImperative(String word) {
        if (word.isEmpty())
            return "";
        char[] characters = word.toCharArray();
        StringBuilder result = new StringBuilder(Character.toString(characters[0]));
        int count = 0;
        for (char character : characters) {
            if (result.charAt(result.length() - 1) != character) {
                result.append(String.format("%d%c", count, character));
                count = 1;
            } else
                count++;
        }

        result.append(count);

        return result.toString();
    }

    public static String compressedStringStream(String word) {
        return word;
    }

    public static String decompressedStringImperative(String word) {
        if (word.isEmpty())
            return "";
        char[] characters = word.toCharArray();
        StringBuilder result = new StringBuilder();
        char curCharacter = 0;
        StringBuilder counter = new StringBuilder();
        for (char character : characters) {
            if (Character.isLetter(character)) {
                if (curCharacter != 0) {
                    result.append(String.format("%c", curCharacter).repeat(Integer.parseInt(counter.toString())));
                }
                curCharacter = character;
                counter = new StringBuilder();
            }
            else {
                counter.append(character);
            }
        }
        result.append(String.format("%c", curCharacter).repeat(Integer.parseInt(counter.toString())));
        return result.toString();
    }

    public static String decompressedStringStream(String word) {
        return word;
    }
}
