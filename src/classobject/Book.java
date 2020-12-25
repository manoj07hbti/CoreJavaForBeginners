package classobject;

public class Book {

    //TODO Member variable
    String name;
    int pages;
    String writerName;
/* todo    Member function or method -- capabilites
    // Syntax : access_specifier return_type  function_name (parameter) {}
    //access_specifier -> public , private , protected, default   THEORY PART
    //return_type   -> output of function
    //function_name -> can be anything
    // parameter ->  input
*/
  //TODO Member function or Method
   public void read(){

        System.out.println("This is read function ");
   }

   public void write(){
       System.out.println("This is write function ");

   }

public String displayName (){
       String Name="classobject.Book Name is Test classobject.Book";

       return Name ;
   }

   public String displayWriterName ( String writerName){
               return writerName ;
    }

    public static void main (String args[]){
        //TODO Object are instance of class
        //TODO Syntax : classname objectname = new classname();

        Book object_book= new Book();// dependency of creating object using new keyword
        object_book.read();// TODO calling function -> object.functionName
        object_book.write();
        String Name =object_book.displayName();//TODO this function returns String value so we should store this value to String variable
        System.out.println("This is displayName function "  + Name);

        String WriterName =object_book.displayWriterName("James Gosling");
        System.out.println("This is displayWriterName function "  + WriterName);

    }


}
