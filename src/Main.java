public class Main {
    public static void main(String[] args) {
        System.out.println("\nIMPERATIVE STRING COMPRESSION TESTS");
        System.out.println(TestUtils.assertEquals("a1b1c1d1e1", StringCompression.compressedStringImperative("abcde")));
        System.out.println(TestUtils.assertEquals("a14b2", StringCompression.compressedStringImperative("aaaaaaaaaaaaaabb")));
        System.out.println(TestUtils.assertEquals("", StringCompression.compressedStringImperative("")));
        System.out.println(TestUtils.assertEquals("a3b2", StringCompression.compressedStringImperative("aaabb")));
        System.out.println(TestUtils.assertEquals("a1b1c1", StringCompression.compressedStringImperative("abc")));
        System.out.println(TestUtils.assertEquals("a6b1a8c2a1", StringCompression.compressedStringImperative("aaaaaabaaaaaaaacca")));

        System.out.println("\nIMPERATIVE STRING DECOMPRESSION TESTS");
        System.out.println(TestUtils.assertEquals("aaaaaabaaaaaaaacca", StringCompression.decompressedStringImperative("a6b1a8c2a1")));
        System.out.println(TestUtils.assertEquals("abcde", StringCompression.decompressedStringImperative("a1b1c1d1e1")));
        System.out.println(TestUtils.assertEquals("aaaaaaaaaaaaaabb", StringCompression.decompressedStringImperative("a14b2")));
        System.out.println(TestUtils.assertEquals("", StringCompression.decompressedStringImperative("")));
        System.out.println(TestUtils.assertEquals("aaabb", StringCompression.decompressedStringImperative("a3b2")));
        System.out.println(TestUtils.assertEquals("abc", StringCompression.decompressedStringImperative("a1b1c1")));
    }
}
