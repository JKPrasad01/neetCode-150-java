package ArraysAndHashing;

import java.util.Arrays;

public class Anagram {




//    Input: s = "racecar", t = "carrace"
//
//    Output: true
    public boolean isAnagram(String s, String t) {

        int [] ar1=new int[26];

        for (int i=0;i<s.length();i++){

            int i1 = ar1[s.charAt(i) - 'a'];
            i1 =i1 +1;

        }

        int [] ar2=new int[26];

        for (int i=0;i<t.length();i++){

            int i1 = ar2[t.charAt(i) - 'a'];
            i1 =i1 +1;
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
