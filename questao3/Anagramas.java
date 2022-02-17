package questao3;

import java.util.Arrays;

/**
 *
 * @author felipe ribeiro
 */
public class Anagramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1 ="ALEGRIA";
       String s2 ="ALERGIA";
       
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("---------------");
        
     
           
           char[] c1 = s1.toCharArray();
           char[] c2 = s2.toCharArray();
           
           Arrays.sort(c1);
           Arrays.sort(c2);
           
           if (Arrays.equals(c1, c2)){
               System.out.println("e um anagrama");
             }else
               System.out.println("nao e um anagrama");
       }
       
     }
    


