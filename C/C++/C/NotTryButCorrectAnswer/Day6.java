import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),S=sc.nextInt(),coin[]=new int[N];
        for(int i=0;i<N;i++)
        {
            coin[i]=sc.nextInt();
        }
        int mincoin[]=new int[S+1];
        Arrays.fill(mincoin,-1);
        mincoin[0]=0;
        for(int i=0;i<N;i++)
        {
            for(int j=coin[i];j<=S;j++)
            {
                int pre=j-coin[i];
                if(mincoin[pre]!=-1)
                {
                    if(mincoin[j]==-1)
                    {
                        mincoin[j]=mincoin[pre];
                    }
                    else
                    {
                        mincoin[j]=Math.min(mincoin[j],mincoin[pre]+1);
                    }
                }
            }
        }
        System.out.println(mincoin[S]);
        sc.close();
	}
}
