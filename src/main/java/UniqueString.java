/**
 * Created by sreekarryallapragada on 11/3/18.
 *
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures
 */
public class UniqueString {


    public static  boolean isUniqueChars(String str){

        //Approach 1
        /**
         * Assuming string has only ASCII characters
         */

        if(str.length() > 128){
            return false;
        }

        boolean[] char_set = new boolean[128];

        for(int i=0;i<str.length();i++){

            int value =  str.charAt(i);

            if(char_set[value]){
                return false;
            }else{
                char_set[value]= true;
            }
        }

        return true;
    }

    public static void main (String[] args){


      // System.out.println(UniqueString.isUniqueChars("sreekarr"));

        System.out.println(UniqueString.isUniqueChars("srika"));

    }
}
