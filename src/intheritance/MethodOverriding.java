package intheritance;

/* todo  Method overriding : same method Signature with different code in child class and
         it can happen in child class only
         *****  also called as RUN time polymorphism
 */

public class MethodOverriding extends MethodOverloading_Overriding{

    //TODO Method overriding : same method Signature with different code in child class and it can happen in child class only
    public void Display(){
        int a=9;
        int b=10;
        System.out.println(a+b);

    }

    public static void main(String[] args){
        MethodOverriding object= new MethodOverriding();
        object.Display();

    }

}
