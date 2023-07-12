package Home;



public class sarath {
    public static void main(String[] args){
        int a=15,b=0;
       try{

           throw new CorrectException("this is throw exception");

       } catch ( CorrectException e) {
           System.out.println("please \t enter the value greater than 0");

       }


    }

    }
