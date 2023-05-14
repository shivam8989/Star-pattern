package training;
import java.lang.reflect.Array;
import java.util.*;
public class Inpu {
    static String  Name(String name){
      //
        ArrayList<String> ans = new ArrayList<>();
        String a = "";

    int len = name.length();
    name = name.trim();
    String str1 = "";
                for (int i = 0; i < len; i++) {
        char ch = name.charAt(i);
        if (ch != ' ') {
            str1 = str1 + ch;
        } else {
            a=Character.toUpperCase(str1.charAt(0)) + ".";
            str1 = "";
        }
    }
    String str2 = "";
                for (int j = 0; j < str1.length(); j++) {
        if (j == 0)
            str2 = str2 + Character.toUpperCase(str1.charAt(0));
        else
            str2 = str2 + Character.toLowerCase(str1.charAt(j));
    }
                a+=str2;
                return a;
}

            public static void main(String[] args) {
                String name [] = {"Shivam Singh", "Syed Aman Hasan","Suraj Dubey","Ruzul Sharam"};
                ArrayList<String> al = new ArrayList<>();
String a = "";

                for(int i = 0; i<name.length; i++){
                    a = Name(name[i]);
                    al.add(a);
                }
                System.out.println(al);
         //
        }
}
