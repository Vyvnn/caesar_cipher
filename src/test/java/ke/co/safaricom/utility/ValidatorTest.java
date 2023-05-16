package ke.co.safaricom.utility;

import ke.co.safaricom.models.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {


    @Test
    void testInvalidMessage_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput =new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));
    }

    @Test
    void testInvalidKey_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput =new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(26);
        assertFalse(validator.isValid(userInput));
    }
    @Test
    void testValidOnValidUserInput_validatorReturnTrue() {
        Validator validator = new Validator();
        UserInput userInput =new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));
    }

    @Test
    void testisValidMessage_validatorReturnTrue() {
        Validator validator = new Validator();
        UserInput userInput =new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(25);

        assertTrue(validator.isValid(userInput));
    }
}