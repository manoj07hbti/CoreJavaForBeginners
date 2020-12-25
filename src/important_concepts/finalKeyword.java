package important_concepts;

/* todo final keyword : it can not be changed
     final variable : it can not be changed
     final class  :  it can not be inherit
     final method : final method can not be overridden
 */
public  final class finalKeyword {

     final int constant=5;
     public final void method(){
         final int a=5;

     }

     public static void main (String args[]){
         finalKeyword obj= new finalKeyword();
         System.out.println("Value of constant --> "+obj.constant);


     }


}
