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

        switch(letter)
        {
            case 'a':
            {
                System.out.println("in a");
                break;
            }
            case 'b':
            {
                System.out.println("in b");
                break;
            }
            default:
            {
                System.out.println("input a or b");
                break;
            }
        }

    }
}