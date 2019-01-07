package checkString;

import java.util.*;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        
        String str1 = "apple";
        String str2 = "leapp";
        
        if(str1.length() == str2.length()){
            
            for(int i = 0; i < str1.length(); i++){
               
                char c = str1.charAt(i);
                char d = str2.charAt(i);
                
                if(map1.containsKey(c)){
                    map1.put(c, map1.get(c) + 1);
                }else{
                    map1.put(c,1);
                }
                
                if(map2.containsKey(d)){
                    map2.put(d, map2.get(d) + 1);
                }else{
                    map2.put(d,1);
                }
            }
            
           // System.out.println(Arrays.asList(map1));
           // System.out.println(Arrays.asList(map2));
            
            int check = 0;
            
            for(int i = 0; i < str1.length(); i++){
                
                char c = str1.charAt(i);
                
                if(map1.get(c) == map2.get(c)){
                    check++;
                }else{
                    check--;
                }
                
            }
            
            if(check == str1.length()){
                System.out.println(str1 + " é permutação de " + str2);
                
            }else{
                System.out.println(str1 + " não é permutação " + str2);            
            }
            
            
            
        }else{
            System.out.println(str1 + " não é permutação " + str2);
        }
        

	}

}
