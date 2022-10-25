import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("in");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

       if(letter == 'Y'||letter == 'y')
       {
           System.out.println("you are male");
       }
       else if(letter == 'N' || letter == 'n')
       {
           System.out.println("you are female");
       }
       else
           System.out.println("input Y or N");
    }
}