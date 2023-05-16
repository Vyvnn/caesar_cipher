import ke.co.safaricom.models.UserInput;
import ke.co.safaricom.services.GetUserInput;
import ke.co.safaricom.utility.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean userInputIsValid=GetUserInput.getUserInput();


       if (userInputIsValid){
           System.out.println("Proceed");
       }else {
           System.out.println("Do not proceed");
       }





    }
}
