package intheritance;

/* todo Method overloading : same method signature but different parameter
        it can happen only in same class
        ******* also called compile time polymorphism
 */
public class MethodOverloading_Overriding {

    //TODO Syntax : access_specifier return_type  function_name (parameter) {}

    public void Display(){
        System.out.println(" Display method called");

    }
    //TODO Method overloading : Same method name but different  parameters, overloading can happen in same class only
    // Method overloading : overloaded with String parameter
    public void Display(String message){
        System.out.println(" Display method called with Message " +message);

    }
    // Method overloading : overloaded with String parameter
    public void Display(String message,int count){
        System.out.println(" Display method called with Message " +message + " and count is " +count);

    }



    public static void main(String[] args){

        MethodOverloading_Overriding obj= new MethodOverloading_Overriding();
        obj.Display("Java classes");
        obj.Display("Monday",33);

    }



}
