public class StringCompression {
    public static String compressedStringImperative(String word) {
        if(word.isEmpty())
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
        return word;
    }

    public static String decompressedStringStream(String word) {
        return word;
    }
}
