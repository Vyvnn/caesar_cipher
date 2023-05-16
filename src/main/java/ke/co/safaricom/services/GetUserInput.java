package ke.co.safaricom.services;

import ke.co.safaricom.models.UserInput;
import ke.co.safaricom.utility.Validator;

import java.util.Scanner;

public class GetUserInput {
    public static boolean getUserInput(){
        Scanner scanner =new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput=new UserInput();
        Validator validator =new Validator();


        System.out.println("Choose the operation (*encode* or *decode*");
        operation=scanner.nextLine();
        System.out.println("");

        System.out.print("Enter your message: ");
        message =scanner.nextLine();
        System.out.println("");

        System.out.print("Enter your secret key: ");
        key=scanner.nextInt();
        System.out.println("");


        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);
        scanner.close();




        return validator.isValid(userInput);



    }

}












