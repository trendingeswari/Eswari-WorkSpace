import java.util.*;
public class DiagonalMatrixLowerRightToUpperLeft {
    public static void main (String args[])
    {
    Scanner sc = new Scanner (System.in);
    int R=sc.nextInt(),C=sc.nextInt();
    int mat[][]=new int [R][C];
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    int col=C-1,row=R-1;
    boolean flag=true;
    sc.close();
    while(flag)
    {
        int r=row,c=col;
        for(int j=c;j<C && r>=0;j++)
        {
            System.out.print(mat[r--][j]+" ");
        }
        System.out.println();
        if(row==0)
        {
            flag=false;
        }
        if(col==0)
        {
            row--;
        }
        else{
            col--;
        }
    }
    /*for(int i=1;;i++)
    {
        int val=row;
        for(int j=col;j<C && val>=0;j++)
        {
            System.out.print(mat[val--][j]+" ");
        }
        System.out.println();
        if(col==0)
        {
            row--;
            break;
        }
        col--;
    }
    for(int i=1;;i++)
    {
        int va=row;
        for(int j=0;j<C && va>=0;j++)
        {
            System.out.print(mat[va--][j]+" ");
        }
        System.out.println();
        if(row==0)
        {
            break;
        }
        row--;
    }*/
}
}
