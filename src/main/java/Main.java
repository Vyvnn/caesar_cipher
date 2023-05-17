import ke.co.safaricom.models.UserInput;
import ke.co.safaricom.services.CaesarCipher;
import ke.co.safaricom.services.GetUserInput;
import ke.co.safaricom.utility.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean userInputIsValid=GetUserInput.getUserInput();


       if (userInputIsValid){
           UserInput userInput= GetUserInput.input;
           CaesarCipher caesarCipher =new CaesarCipher()
           if (userInput.getOperation().equalsIgnoreCase("encode")) {
               String cipherText = caesarCipher.encode(userInput.getMessage(), userInput.getKey());

               System.out.println("Your cipher text is: +cipherText");
           } else if (userInput.getOperation().equalsIgnoreCase("decode")) {

               String cipherText = caesarCipher.encode(userInput.getMessage(), userInput.getKey());

               System.out.println("Your plain text is: +plainText");

       }else {
           System.out.println("Do not proceed");
       }





    }
}
