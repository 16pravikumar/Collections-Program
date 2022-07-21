import java.util.*;
public class Coll1 {
    public static void main(String[] args) {
      ArrayList<String> cars= new ArrayList<String>();
      LinkedList<String> color= new LinkedList<String>();
      HashSet<String> day= new HashSet<String>();
      HashMap<String,String> emp= new HashMap<String,String>();

      cars.add("BMW");
      cars.add("Swift Desire");

      System.out.println(cars);
      System.out.println(cars.get(0));
    }
  }