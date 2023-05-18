package ke.co.safaricom.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void testCipherEncodingReturnCorrectPlainText_True() {
        String plainText =" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText ="QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key =23;

        CaesarCipher caesarCipher =new CaesarCipher();
        String output =caesarCipher.decode(plainText ,key);
        System.out.println("Test output: "  +output);

        assertEquals(plainText,output);

    }

    @Test
    void testCipherDecodingReturnCorrectCipherText_True() {
        String plainText =" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText ="QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key =23;

        CaesarCipher caesarCipher =new CaesarCipher();
        String output =caesarCipher.encode(cipherText ,key);
        System.out.println("Test output: "  +output);

        assertEquals(cipherText,output);
    }
}