/**
 * Created by sreekarryallapragada on 11/3/18.
 * 
 * Check if two strings are permutation of each other
 */
public class Permutation {
    
    public static void main(String[] args){
        
        String str1 = "geeksforgeeks";
        String str2 = "orfskeeggeeks";

        System.out.println(Permutation.checkPermutation(str1,str2));
    }

    private static boolean checkPermutation(String str1, String str2) {

        if(str1.length() != str2.length())
            return false;

        int[] letters1 = new int[128]; //assumption only ASCII characters
        int[] letters2 = new int[128]; //assumption only ASCII characters

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        for(int i =0; i<charArray1.length;i++){
            letters1[charArray1[i]]++;
        }

        for(int i =0; i<charArray2.length;i++){
            letters2[charArray2[i]]++;
        }

        for(int i=0; i<letters1.length;i++){

            if(letters1[i]!=letters2[i])
                return false;
        }

        return true;
    }
}
