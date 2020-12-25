package exception_handeling;

class CustomExceptionMain{

    public void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid Age ");
        else
            System.out.println("welcome to vote");
    }


    public static void main(String args[]){
        try{
            CustomExceptionMain object=new CustomExceptionMain();
            object.validate(13);
        }catch(Exception m){System.out.println("Exception occurred: "+m);}

        System.out.println("rest of the code...");
    }
}
