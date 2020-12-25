package important_concepts;

public class EqualAndHashcode {

    /*todo HASHCODE : Every object has a unique value
            obj1 and obj2----> unique value ( same hashcode )=5 objects can be equal if hashcode is same
            equals == method ---> memory address compare
          if obj1 and obj2  --> hashcode is same and equal method gives true then both objects are same
          object are equal -->
          -----------
          The contract between equals() and hashCode() is:
          1) If two objects are equal,then they must have the same hash code.
          2) If two objects have the same hash code,they may or may not be equal. ...
          -----------
          The default implementation of hashCode() in Object class returns distinct integers for different objects.
     */

    public static void main(String args[]){
        EqualAndHashcode obj1=new EqualAndHashcode();
        EqualAndHashcode obj2=new EqualAndHashcode();
        String s1= "Test";
        String s2=new String ("Test");

        System.out.println("Object 1 hashcode is ---"+obj1.hashCode());
        System.out.println("Object 2 hashcode is ---"+obj2.hashCode());
        System.out.println("String 1 hashcode is ---"+s1.hashCode());
        System.out.println("String 2 hashcode is ---"+s2.hashCode());
        System.out.println("Check Equality of s1 and s2 ---"+s1.equals(s2));


    }
}
