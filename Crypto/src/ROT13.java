import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {

    ROT13(Character cs, Character cf) {


    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                c += 13;
            } else if ((c > 'm' && c <= 'z') || (c > 'M' && c <= 'Z')) {
                c -= 13;
            }
            charArray[i] = c;
        }
        return new String(charArray);
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int diff = c-'A';
        String s1 = s.substring(diff)+s.substring(0,diff);



        return s1;
    }

}
