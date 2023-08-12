import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String path="C:\\Users\\HP\\Documents\\mobileappdevelopment.txt";
        File file=new File(path);

        try{
            boolean flag=file.createNewFile();
            if(flag){
                System.out.println("File is created");
            }
            else{
                System.out.println("File is already present");
            }
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}
