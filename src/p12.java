import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("in");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1)
            System.out.println("in1");
        else if(num == 2)
            System.out.println("in2");
        else
        System.out.println("input 1 or 2");
    }
}