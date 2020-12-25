package exception_handeling;

public class Exception_1 {


    public int divide (int a, int b){

        int result=0;
      try {
           result = a / b;
      }
      catch (Exception e) {
         System.out.println("Exception details----"+e.toString() +"-getCause----" +e.getCause() + e.getMessage());

      }
        return result;
    }

    public static void main(String args[]){
        Exception_1 obj=new Exception_1();

        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));
        System.out.println( obj.divide(10,0));

    }
}
