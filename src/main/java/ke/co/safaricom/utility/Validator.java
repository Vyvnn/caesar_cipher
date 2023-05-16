package ke.co.safaricom.utility;

import ke.co.safaricom.models.UserInput;

public class Validator {

        public boolean isValid(UserInput userInput) {
            boolean oIsValid = operationValidator(userInput.getOperation());
            boolean mIsValid = messageValidator(userInput.getMessage());
            boolean kIsValid = keyValidator(userInput.getKey());

            return oIsValid && mIsValid && kIsValid;
        }



            private boolean operationValidator(String operation){

                //two operations ->encode,decode
                return operation.equalsIgnoreCase("encode") ||
                        operation.equalsIgnoreCase("decode");

            }


            private boolean messageValidator (String message){
                return !(message.isBlank() && message.isEmpty());
            }

            private boolean keyValidator ( int key){
                return (key >= 1) && (key <= 25);

            }

        }

