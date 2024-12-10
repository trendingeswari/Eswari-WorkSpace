/*
Navigation Matrix
The program must accept a character matrix of size RxC as the input. The program must navigate the matrix from the top-left cell based on the following conditions.
- If there is an alphabet below the current cell, then navigate to down.
- Else if there is a digit on the right side of the current cell, then navigate to right. - Else stop the navigation.
Finally, the program must print all the navigated characters as the output.
Boundary Condition(s):
2 <= R, C<= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space.
Output Format:
The first line contains the navigated characters in the matrix.

Example Input/Output 1:
Input: 
5 5
p6qt=
]z7h* 
t)iet 
--_t*
tetns
Output: 
p6z7i
Explanation:
The navigated characters are highlighted
below.
p6qt=
]z7h*
t)iet --_t *
tetns
So p6z7i is printed as the output.
Example Input/Output 2:
Input:
6 7
q98wrT7
1U06IZR
p*W7gfx 
mQ)i3dl 
jx1$e36 
k2)e!2y
Output: 
q9U0W7i3e36у
 */
import java.util.*;
public class Day5 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        char arr[][]=new char[R][C];
        sc.nextLine();
        for(int i=0;i<R;i++)
        {
            String s=sc.nextLine();
            int ind=0;
            for(int j=0;j<s.length();j+=2)
            {
                arr[i][ind++]=s.charAt(j);
            }
        }
        char str[]=sc.nextLine().toCharArray();
        sc.close();
        int topr=0,value=0,rightl=1,bottom=C-2,left=R-2;
        while(topr<C && value!=str.length)
        {
            arr[0][topr++]=str[value++];
        }
        while(rightl<R && value!=str.length)
        {
            arr[rightl++][C-1]=str[value++];
        }
        while(bottom>=0 && value!=str.length)
        {
            arr[R-1][bottom--]=str[value++];
        }
        while(left>0 && value!=str.length)
        {
            arr[left--][0]=str[value++];
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	} 

}
