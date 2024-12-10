/*
City - Number of Markets

The program must accept an integer matrix of size RxC representing the blueprint of a city as the input. 
The matrix always contains 1s and 0s, where each 1 represents a shop and each 0 represents an empty place. 
A group of shops in the city is called a market, where the shops are connected vertically and horizontally. 
The program must print the number of markets in the city as the output. Note: At least one shop is always present in the city. 
Boundary Condition(s): 2 <= R, C <= 50 
Input Format: The first line contains R and C separated by a space. 
The next R lines, each containing C integers separated by a space. 
Output Format: The first line contains the number of markets in the city. 
Example Input/Output 1: 
Input: 
5 5 
0 0 0 1 0 
0 0 0 1 1 
0 0 0 0 0 
0 0 0 1 0 
0 0 0 1 1 
Output: 
2 
Explanation: The markets in the city are highlighted below. 
0 0 0 1 0 
0 0 0 1 1 
0 0 0 0 0 
0 0 0 1 0 
0 0 0 1 1 
Here the number of markets in the city is 2, which is printed as the output. 
Example Input/Output 2: 
Input: 
6 4 
0 0 0 1 
0 0 0 0 
0 0 1 1 
1 0 1 0 
1 0 0 1 
1 1 1 1 
Output: 
3
 */

import java.util.Scanner;

public class Day3 {
    public static void fun(int a[][],int i,int j,int r,int c){
        if(i>=r || i<0 || j<0 || j>=c)return ;
       if(a[i][j]==0){
           return ;
       }
       a[i][j]=0;
       fun(a,i-1,j,r,c);
       fun(a,i,j-1,r,c);
       fun(a,i+1,j,r,c);
       fun(a,i,j+1,r,c);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		int f=0;
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        if(a[i][j]==1){
	            f++;
	            fun(a,i,j,r,c);
	        }
	    }
	}
    sc.close();
	System.out.print(f);

	}
}
