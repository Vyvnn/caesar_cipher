

package ke.co.safaricom.services;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test


    public void testCipherEncodingReturnCorrectCipherText_True() {
        CaesarCipher cipher = new CaesarCipher();
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String expectedCipherText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key =23;

        String actualCipherText = cipher.encode(plainText,key);
        actualCipherText = actualCipherText.trim(); // Trim leading and trailing spaces

        assertEquals(expectedCipherText, actualCipherText);
    }


    @Test


    void testCipherDecodingReturnCorrectCipherText_True() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key = 23;

        CaesarCipher caesarCipher = new CaesarCipher();
        String output = caesarCipher.decode(cipherText, key);
        System.out.println("Test output: " + output);

        assertEquals(plainText, output);
    }

}