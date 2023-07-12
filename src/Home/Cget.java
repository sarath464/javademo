package Home;

import java.io.File;

public class Cget extends Get {
    public static void main(String[] args){
        File file =new File("C:\\Users\\91934\\Desktop\\filehandling\\handling\\payilgam.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("folder is created");
            }
            else{
                System.out.println("folder is already exists");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}
