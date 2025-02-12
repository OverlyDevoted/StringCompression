public class Main {
    public static void main(String[] args) {
        System.out.println("\nIMPERATIVE STRING COMPRESSION TESTS");
        System.out.println(TestUtils.assertEquals("a1b1c1d1e1", StringCompression.compressedStringImperative("abcde")));
        System.out.println(TestUtils.assertEquals("a14b2", StringCompression.compressedStringImperative("aaaaaaaaaaaaaabb")));
        System.out.println(TestUtils.assertEquals("", StringCompression.compressedStringImperative("")));
        System.out.println(TestUtils.assertEquals("a3b2", StringCompression.compressedStringImperative("aaabb")));
        System.out.println(TestUtils.assertEquals("a1b1c1", StringCompression.compressedStringImperative("abc")));
        System.out.println(TestUtils.assertEquals("a6b1a8c2a1", StringCompression.compressedStringImperative("aaaaaabaaaaaaaacca")));
    }
}
