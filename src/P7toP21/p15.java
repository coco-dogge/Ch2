package P7toP21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("in");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        switch(num)
        {
            case 1:
                System.out.println("in1");
            case 2:
                System.out.println("in2");
            default:
                System.out.println("input 1 or 2");
        }

    }
}