import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p7 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("in");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1)
        {
            System.out.println("in1");
            System.out.println("choose1");
        }
        System.out.println("end");
    }
}