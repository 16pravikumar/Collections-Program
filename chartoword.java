// Find the character count frequency in the word
import java.util.*;
public class chartoword{
    public static void main(String args[]){
       String str="122233455";
       char[] ch=str.toCharArray();
       int len=ch.length;
       HashSet<Character> list=new HashSet<Character>();
       for(int i=0;i<len;i++){
        list.add(ch[i]);
       }
       Object[] ostr=list.toArray();
       for(int i=0;i<ostr.length;i++)
       System.out.print(ostr[i]+" ");      
    }
}
//Outpt
//1 2 3 4 5
