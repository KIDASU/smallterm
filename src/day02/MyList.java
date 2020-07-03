package day02;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 15:07
 **/

public class MyList {
    public static void main(String[] args) {

        String str = "a2a1d3a5d";

        Map<Character, Integer> mymap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!mymap.containsKey(str.charAt(i))){
                mymap.put(str.charAt(i),1);
            }
            else {
                mymap.put(str.charAt(i),mymap.get(str.charAt(i))+1);
            }

        }

        for(Character key : mymap.keySet()){
            System.out.println(key+"  "+mymap.get(key));
        }
    }

}
