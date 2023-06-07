import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader reader=null;
        int total=0;


        try{
            reader =new BufferedReader(new FileReader("C:\\Users\\eren0\\OneDrive\\Masaüstü\\java soruları\\readingFileDemo\\src\\sayilar.txt"));
      String line=null;
      while ((line=reader.readLine()!=null)

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            }catch (Exception exception){

            }
        }

    }
}