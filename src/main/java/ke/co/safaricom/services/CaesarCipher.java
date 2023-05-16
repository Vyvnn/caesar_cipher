package ke.co.safaricom.services;
public class CaesarCipher {
    private final String ALPHABETS ="ABCDEFHIJKLMNOPQRSTUVWXYZ";
    // encode ->newIndex=(oldIndex + key) %26; if newIndex>25 then subtract 26
    //decode-> newIndex =(oldIndex - key) %26;  if newIndex>25 then add 26

    public String encode(char c,int key){
        //takes plainText as input and return cipherText
        int oldIndex =ALPHABETS.indexOf(c);
        int newIndex =(oldIndex + key)% 26;


//        char cipherChar =ALPHABETS

        if(newIndex >25){
            newIndex =newIndex -26;
        }
        return"";

    }


    public String decode(){
        //takes cipherText as input and return plain Text
        return"";

    }
}
