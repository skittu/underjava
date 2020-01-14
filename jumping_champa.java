import java.io.*;
import java.util.*;
import java.lang.Math;

public class jumping_champa {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int t=scan.nextInt();
        while(t>0)
        {
            int n=scan.nextInt();
            int q=scan.nextInt();
            int x;
            List<Integer> v = new ArrayList<>(n);
            for(int i=0;i<n;i++)
            {
                x=scan.nextInt();
                v.add(x);
            }

            int ans=0;
            for(int i=0;i<v.size()-1;i++)
            {
                ans+=q*Math.abs(v.get(i) - v.get(i+1));
            }
            System.out.println(ans);
            t--;
        }
    }
}
