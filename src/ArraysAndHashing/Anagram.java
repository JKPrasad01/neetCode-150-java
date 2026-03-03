package ArraysAndHashing;

import java.util.Arrays;

public class Anagram {




//    Input: s = "racecar", t = "carrace"
//
//    Output: true
    public boolean isAnagram(String s, String t) {

        int [] ar1=new int[26];

        for (int i=0;i<s.length();i++){
             ar1[s.charAt(i) - 'a']++;
        }

        int [] ar2=new int[26];

        for (int i=0;i<t.length();i++){
            ar2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(ar1,ar2);
    }


    public boolean isAnagram2(String s, String t) {

        int[] count =new int[26];

        if(s.length()!=t.length())return false;
        for (int i=0;i<s.length();i++){

            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for (int j : count) {

            if (j != 0) return false;
        }
        return true;
    }
}
