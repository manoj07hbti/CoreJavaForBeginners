package intheritance;

//TODO extends is a keyword to establish parent chil relation between class

public class Childclass extends ParentClass {

    public void Display(){

        System.out.println(" I am in Child Class ");
    }


    public static void main(String[] args) {

       Childclass obj_child= new Childclass();
       ParentClass obj_parent=new ParentClass();
      // obj_parent.Display();

       // object is a Refference variable = new Class
        ParentClass object =new Childclass();
        //TODO Always check  created Object and tell that same Class method will be called .

       // Childclass obj_child1= new ParentClass();

        object.Display(); // This is called Run time Polymosrphism

      // obj_child.Display();
       // obj_child.Displaysecond();
      // obj_child.DisplayA();

    }

}
