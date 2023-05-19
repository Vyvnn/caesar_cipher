package ke.co.safaricom.services;
public class CaesarCipher {
    private final String ALPHABETS ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // encode ->newIndex=(oldIndex + key) %26; if newIndex>25 then subtract 26
    //decode-> newIndex =(oldIndex - key) %26;  if newIndex>25 then add 26

    public String encode(String message,int key) {
        //takes plainText as input and return cipherText
        char[] messageArray = message.toUpperCase().toCharArray();


        StringBuilder output= new StringBuilder();

        for(char item: messageArray) {
            char temp = shiftChar(item,key,'e');
            output.append(temp);




        }
        return output.toString();


    };
    public String decode(String message,int key){
        //takes cipherText as input and return plain Text
        char[] messageArray = message.toUpperCase().toCharArray();


        StringBuilder output= new StringBuilder();

        for(char item: messageArray) {
            char temp = shiftChar(item, key,'d');
            output.append(temp);




        }
        return output.toString();




    }
    private char shiftChar(char c ,int key , char ops ){
        int oldIndex =ALPHABETS.indexOf(c);

        if(oldIndex == -1) {

            return c;
        };
        int newIndex = 0;



        if (ops == 'e') {
            newIndex = (oldIndex + key) % 26;
        } else {
            newIndex = (oldIndex - key) % 26;
            if (newIndex < 0) {
                newIndex += 26;
            }
        }



            int pos;
            char cipherChar;


            if(newIndex >25) {
                pos = newIndex - 26;
                cipherChar = ALPHABETS.charAt(pos);

            } else if (newIndex < 0) {
                pos =newIndex + 26;
                cipherChar= ALPHABETS.charAt(pos);

            } else{
                pos=newIndex;
                cipherChar= ALPHABETS.charAt(pos);
            }
            return cipherChar;

        }
        }


