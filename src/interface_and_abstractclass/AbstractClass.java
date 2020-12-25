package interface_and_abstractclass;

public abstract class AbstractClass {
/* todo abstract keyword : hidden
        if any method have abstract keyword it will become abstract method
        abstract method:  method without body, it will only have declarations
       SYNTAX: access_specifier   abstract return_type METHOD_NAME();
       ABSTRACT CLASS : class having AT LEAST ONE abstract method and it may have other methods
       ******* You can not create object of Abstract class *********
       it will not have implementation of abstract method so it is not allowed to create object of abstract class
 */

    // TODO when to use abstract class and interface

    public abstract void myMethod() ;// Abstract method

    //normal method
    public void display(){
        System.out.println("Display method");
    }




}