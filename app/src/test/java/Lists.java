import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Lists {
    public static void main(String[] args){
        //Arrays
        String[] myStringArray=new String[3];
        myStringArray[0]="Farah";
        myStringArray[1]="Omar";
        myStringArray[2]="Zeynep";
        System.out.println(myStringArray[0]);

        int[] myIntegerArray=new int[3];
        myIntegerArray[0]=50;
        myIntegerArray[1]=20;
        myIntegerArray[2]=30;
        System.out.println(myIntegerArray[0]);

        int[] myNumberArray= {1, 2, 3, 4,5,6,7};
        System.out.println(myNumberArray[3]);
        //Lists
        ArrayList<String> myMusicians= new ArrayList<>();
        myMusicians.add("Farah");
        myMusicians.add("Omar");
        myMusicians.add("Zeyneb");
        myMusicians.add(1,"James");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        //Sets
        HashSet<String>mySet=new HashSet<String>();
        mySet.add("Farah");
        mySet.add("Farah");
        System.out.println(mySet.size());
        //HashMap
        HashMap<String,Integer>myHashMap=new HashMap<>();
        myHashMap.put("weight",100);
        myHashMap.put("run",300);
        System.out.println(myHashMap.get("weight"));
    }
}
