package questao3;

import java.util.HashMap;


public class Anagramas2 {
    public static void main(String[] args) {
       String s1 ="ALEGRIA";
       String s2 ="ALERGIA";
       
       HashMap<Character, Integer> map1 = creatMaps(s1);
       HashMap<Character, Integer> map2 = creatMaps(s2);
       
         System.out.println(map1);
         System.out.println(map2);
         
         System.out.println(map1.equals(map2)? "e um anagrama" : "nao e um anagrama");
  }
    
     private static HashMap<Character, Integer> creatMaps(String s1){
         HashMap<Character , Integer> map1 = new HashMap<>();
         
         for ( char c : s1.toCharArray()){
            System.out.print(c);
            if(!map1.containsKey(c)){
                map1.put(c,1);
            }else{
                Integer value = map1.get(c);
                map1.put(c, ++value);
            }
         }
         return map1;
     }

    
    }
