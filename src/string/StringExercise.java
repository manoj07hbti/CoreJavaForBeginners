package string;

//Strings are immutable, it can not be changed or modified
public class StringExercise {
  /* todo Memory areas in Java
           1-String constant Pool : All String Literal
           2-Heap Memory : object created with new operator - optimized to save memory
           3-Stack Memory (LIFO): method calls
           == always compares memory address
           //  equals method compares value inside object
           // Difference String , StringBuffer and StringBuilder : StringBuffer and StringBuilder can be changed so not immutable object
           // StringBuffer  is synchronized so used in multithreaded env
           // unary Operator : obj +=value -->  obj =obj+value
           //  rev+=ch[i];  -->> rev=rev+ch[i] ;
//TODO Write a program to reverse a String
//TODO Write a program to find occurrences of character
//TODO Write a program to count character in String
//TODO Write a program to find duplicate character in String
*/
    public static void main(String args[]) {
        String str = "welcome"; // String Literal
        String str2 = "welcome";
        if (str == str2) { // == compares memory addresses

            System.out.println("Both String are on same memory address");
        }

        if (str.equals(str2)) { // == compares values in Object

            System.out.println("Content of  String are  same ");
        }

        String str1 = new String("welcome"); // Object
        if (str1 == str2) { // == compares memory addresses

            System.out.println("Both String are on same memory address");
        } else {
            System.out.println("Both String are NOT on same memory address");
        }
        if (str1.equals(str2)) { // == compares values in Object

            System.out.println("Content of  String are  same ");
        }
    }

}
