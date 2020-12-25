package exception_handeling;
/* todo what is difference between Exception and Error ?
        Error can not be handled but we can handle exception properly using try and catch block : OutOfMemory Error can not handle in code
        ******** Parent class of both Throwable
         try { code ..
           }
           catch() { code for handelling exception
           }
          one try block should have at least on catch , it may have many catch block
          https://www.w3schools.com/java/java_try_catch.asp
     Q:  what is final , finally and finalize :
     keyword : throw --> to use throw any exception : throw new Exception();
               throws --> method level
               https://www.javatpoint.com/exception-handling-in-java
     Q:Hierarchy of Exception : Child exception should catch first then parent exception

 */


public class Exception_example {

    public int math (int a, int b) throws ArithmeticException {
        int output=0;
        try {
             output = a / b;
            // throw new Exception();

        } catch (Exception ex) {

            System.out.println("Exception occurred " + ex.toString());
        }
        finally {
            System.out.println("Finally block will get executed every time .");
        }
        return output;
    }



    public static void main (String args []){
        Exception_example object=new Exception_example();
        int result=0;
        try {
             result = object.math(10, 0);
        }
        catch ( Exception ex){
            System.out.println(" outside Exception occurred " + ex.toString());
        }

        System.out.println("Result is --->" +result);

    }
}
