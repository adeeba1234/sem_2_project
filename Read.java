import java.awt.*;
import java.io.File;

public class Read {
    public static void main(String[] args) {
        String path="C:\\Users\\HP\\Documents\\mobileappdevelopment.txt";

        try{
            File file=new File(path);
            if(!Desktop.isDesktopSupported()){
                System.out.println("desktop not supported.");
                return;
            }
            Desktop desktop=Desktop.getDesktop();
            if(file.exists()){
                desktop.open(file);
            }
        }
        catch( Exception e){
            e.printStackTrace();
        }
    }
}
