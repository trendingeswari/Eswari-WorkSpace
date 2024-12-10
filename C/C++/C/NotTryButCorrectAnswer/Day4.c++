#include <bits/stdc++.h>
#include<string.h>
using namespace std;

int main(int argc, char** argv)
{
    int N,index=-1,max=-101,ind=0;
    cin>>N;
    char arr[N][1001],s[N][1001];
    for(int i=0;i<N;i++)
    {
        cin>>arr[i];
        char *tok=strtok(arr[i],",");
        int count=0,num=0;
        while(tok!=NULL)
        {
            count++;
            if(count==2)
            {
                sscanf(tok,"%d ",&num);
                if(max<num)
                {
                    max=num;
                    index=i;
                }
            }
            if(count==1)
            {
                sscanf(tok,"%s",s[ind++]);
            }
            tok=strtok(NULL,",");
        }
    }
    printf("%s",s[index]);
}