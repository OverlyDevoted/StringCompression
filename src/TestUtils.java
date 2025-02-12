public class TestUtils {
    public static String assertEquals(String expected, String result) {
        return String.format("%s (EXPECTED: %s, RESULT: %s)", expected.equals(result)? "PASS" : "FAIL", expected, result) ;
    }
}
