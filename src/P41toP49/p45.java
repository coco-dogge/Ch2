package P41toP49;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 5 people number");
        int test[] = new int[5];

        for(int i = 0;i<test.length;i++){
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }


        for(int s = 0;s<test.length;s++){
            for(int j = s+1;j<test.length;j++)
            {
                if(test[j]>test[s]){
                    int tmp = test[j];
                    test[j] = test[s];
                    test[s] = tmp;
                }
            }
        }

        for(int i = 0;i<3;i++)
        {
            System.out.println("第" + (i+1) + "名的分數是" + test[i]);
        }


    }
}
