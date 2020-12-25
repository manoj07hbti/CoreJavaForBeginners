package collection;

import java.util.*;

public class CollectionExample {



    public static void main(String args[])
    {

        //Array list Syntax normal way
        ArrayList list=new ArrayList();
        list.add("Test");// 0th position
        list.add("Test1");// 1st position
        list.add("Test3");// 2nd position
        list.remove(1);

        ArrayList<Integer> generic_list=new ArrayList<Integer>();//creating new generic arraylist

        generic_list.add(2);
        generic_list.add(3);

        for (Object var: list){

         System.out.println("Value of element is ---"+var);

        }

        for (Integer var: generic_list){

            System.out.println("Generic list Value of element is ---"+var);

        }

//Creating HashSet and adding elements
        HashSet<String> set=new HashSet();

        set.add("Java");
        set.add("Spring");
        set.add("Spring Boot");
        set.add("Java");
        set.add("Spring");

        Iterator<String> i=set.iterator();// iterator

        while(i.hasNext())
        {
            System.out.println("Set Collection elements "+i.next());
        }



        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println("MAP elements "+ m.getKey()+" "+m.getValue());
        }



}


}
