/*
 Replace - Four Direction

The program must accept an integer matrix of size RxC and an integer X as the input. The program
must replace the integers with asterisks (*) in the north-east, south-east, south-west and north-west
directions of X(including X) in the matrix. Then the program must print the modified matrix as the
output.
Note: The integer X has occurred only once in the RxC integer matrix.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first R lines contain the modified matrix.
Example Input/Output 1:
Input:
5 4
14 13 46 24
33 35 30 18
12 22 23 27
31 21 26 44
47 10 36 49
22
Output:
14 13 46 * 
* 35 * 18 
12 * 23 27 
* 21 * 44 
47 10 36 *
Explanation:
The integers in the north-east, south-east, south-west and north-west directions of 22 are highlighted
in the 5x4 matrix.
14 13 46 24
33 35 30 18
12 22 23 27
31 21 26 44
47 10 36 49
So those integers are replaced with asterisks (*) in the matrix.
Hence the output is
14 13 46 * 
* 35 * 18 
12 * 23 27 
* 21 * 44 
47 10 36 *
Example Input/Output 2:
Input:
4 4
31 73 29 87
77 44 66 46
90 9 10 43
3 1 39 34
10
Output:
* 73 29 87 
77 * 66 * 
90 9 * 43 
3 * 39 *

 */

 import java.util.Scanner;

 public class Day1 {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int array[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        array[i][j]=s.nextInt();
		    }
		}int e=s.nextInt();
		int i=0,j=0;
		k:{
		for( i=0;i<r;i++)
		{
		    for( j=0;j<c;j++)
		    {
		        if(array[i][j]==e)
		        {break k;
		            
		        }
		    }}
		}
		for(int p=0;p<r;p++)
		{
		    for(int q=0;q<c;q++)
		    {
		        if(p+q==i+j||(p-q)==(i-j))
		        System.out.print("* ");
		        else
		        System.out.print(array[p][q]+" ");
		    
		}System.out.print("\n");
        s.close();
    }
		

	}
     /*public static void main(String[] args) {
         //Your Code Here
         Scanner sc = new Scanner (System.in);
         int R=sc.nextInt(),C=sc.nextInt(),mat[][]=new int [R][C];
         for(int i=0;i<R;i++)
         {
             for(int j=0;j<C;j++)
             {
                 mat[i][j]=sc.nextInt();
             }
         }
         int X=sc.nextInt(),rowIndex=-1,colIndex=-1;
         for(int i=0;i<R;i++)
         {
             boolean flag=false;
             for(int j=0;j<C;j++)
             {
                 if(X==mat[i][j])
                 {
                     rowIndex=i;
                     colIndex=j;
                     flag=true;
                     break;
                 }
             }
             if(flag)
             {
                 break;
             }
         }
         sc.close();
         for(int k=0;k<R;k++)
         {
             int val2=0;
                 for(int i=k,j=0;i<R;i++,j++)
                 {
                     if(i==R||j==C)
                     {
                         if(i==rowIndex&& j==colIndex)
                         {
                             val2=i;
                         }
                         break;
                     }
                     else
                     {
                         if(i==rowIndex && j==colIndex)
                         {
                             val2=i;
                         }
                     }
                 }
                 if(val2==rowIndex)
                 {
                     for(int i=k,j=0;i<R;i++,j++)
                     {
                         if(i==R||j==C)
                         {
                             mat[i][j]=-1;
                             break;
                         }
                         else
                         {
                             mat[i][j]=-1;
                         }
                     }
                 }
             int val=-1;
                 for(int i=k,j=C-1;i<R;i++,j--)
                 {
                     if(i==R-1||j==0)
                     {
                         if(i==rowIndex && j==colIndex)
                         {
                             val=i;
                         }
                         break;
                     }
                     else
                     {
                         if(i==rowIndex && j==colIndex)
                         {
                             val=i;
                         }
                     }
                 }
                 if(val==rowIndex)
                 {
                     for(int i=k,j=C-1;i<R;i++,j--)
                     {
                         if(i==R-1||j==0)
                         {
                             mat[i][j]=-1;
                             break;
                         }
                         else
                         {
                             mat[i][j]=-1;
                         }
                     }
                 }
                 int val1=0,val3=0;
                 if(k>=1)
                 {
                     for(int i=0,j=k;j<C;i++,j++)
                     {
                         if(i==rowIndex && j==colIndex)
                         {
                             val1=i;
                         }
                     }
                     if(val1==rowIndex)
                     {
                         for(int i=0,j=k;j<C;i++,j++)
                         {
                             mat[i][j]=-1;
                         }
                     }
                     for(int i=0,j=(C-k)-1;j>=0;i++,j--)
                     {
                         if(i==rowIndex && j==colIndex)
                         {
                             val3=i;
                         }
                     }
                     if(val3==rowIndex)
                     {
                         for(int i=0,j=(C-k)-1;j>=0;i++,j--)
                         {
                             mat[i][j]=-1;
                         }
                     }
                 }
         }
         for(int i=0;i<R;i++)
         {
             for(int j=0;j<C;j++)
             {
                 if(mat[i][j]==-1)
                 {
                     System.out.print("* ");
                 }
                 else
                 {
                     System.out.print(mat[i][j]+" ");
                 }
             }
             System.out.println();
         }
     }*/
 }
 
