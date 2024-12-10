#include<stdio.h>
int push(int,int,int []);
int pop(int,int,int[] );
void peak(int,int,int []);
int main()
{
    int N;
    printf("Enter the Stack array size : ");
    scanf("%d",&N);
    int arr[N],run=1,top=-1;
    while(run)
    {
        printf("press 1 -> Push\nPress 2 -> Pop\nPress 3 -> Peak\nPress 4 -> Exit\n");
        int ch;
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                top=push(N,top,arr);
                break;
            case 2:
                top=pop(N,top,arr);
                break;
            case 3:
                peak(N,top,arr);
                break;
            case 4:
                run=0;
                break;
        }
    }
}
int push(int N,int top,int arr[])
{
    int number;
    if(top==N-1)
    {
        printf("Stack Overflow :(\n");
    }
    else
    {
        printf("Enter the number : ");
        scanf("%d",&number);
        arr[++top]=number;
    }
    return top;
}
int pop(int N,int top,int arr[])
{
    int number;
    if(top==-1)
    {
        printf("Stack Underflow :(\n");
    }
    else 
    {
        printf("%d\n",arr[top--]);
    }
    return top;
}
void peak(int N,int top,int arr[])
{
    if(top==-1)
    {
        printf("Stack Underflow :(\n");
    }
    else{
        printf("%d\n",arr[top]);
    }
}