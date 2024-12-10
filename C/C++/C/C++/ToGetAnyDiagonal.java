
import java.util.Scanner;
public class ToGetAnyDiagonal {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int k=0;k<R;k++)
        {
            //left bottom
            for(int i=k,j=0;i<R;i++,j++)
            {
                if(i==R-1||j==C-1)
                {
                    System.out.print(mat[i][j]+" ");
                    break;
                }
                /*
                 or
                 if(i==R||j==C)
                 {
                    break;
                 }
                 */
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            //right bottom
            for(int i=k,j=C-1;i<R;i++,j--)
            {
                if(i==R-1||j==C-1)
                {
                    System.out.print(mat[i][j]+" ");
                    break;
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            if(k>=1)
            {
                //right top
                for(int i=0,j=k;j<C;i++,j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
                //left top
                for(int i=0,j=(C-k)-1;j>=0;i++,j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
