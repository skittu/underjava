import java.awt.desktop.QuitEvent;
import java.lang.reflect.Array;
import java.util.*;

class Pair{
    int fs,sc;
    Pair(int a,int b)
    {
        this.fs=a;
        this.sc=b;
    }
}
public class minimum_cost {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        while(t>0)
        {
            int n=scan.nextInt();
            ArrayList<Pair>[] edges= new ArrayList[n];
            int[] arr=new int[n+1];
            for(int i=0;i<n;i++)
                edges[i].clear();
            for(int i=1;i<=n;i++)
                arr[i] = scan.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(i+1<=n)
                    edges[i].add(new Pair(i+1,1));
                if(i-1>=1)
                    edges[i].add(new Pair(i-1,1));
                edges[i].add(new Pair(arr[i],0));
            }
            sol s = new sol();
            System.out.println(s.bfs(n,1,edges));
            t--;
        }

    }

}
class sol{
    Long bfs(int n,int src,ArrayList[] edges)
    {
        Long[] dist=new Long[n];
        for(int i = 0; i<=n+1; i++)
        {
            dist[i]= Long.valueOf(1000000000);
        }
        Queue<Integer> q=new LinkedList<>();
        dist[src]=Long.valueOf(0);
        q.add(src);
        while(!q.isEmpty())
        {
            Integer v= q.peek();
            q.remove();
            for(int i=0;i<edges[v].size();i++)
            {

            }
        }
        return dist[n];
    }
}
