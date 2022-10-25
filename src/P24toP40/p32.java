package P24toP40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("for?(1~10)");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i = 1;i <=10;i++) {
            System.out.println("In " + i + " st");
            if(i == res)
                break;
        }
    }
}
