#include<bits/stdc++.h>
using namespace std;
int main()
{
    //two variable
    pair<int,int>p={1,2};
    cout<<p.first<<" "<<p.second;
    //Three variable
    pair<int,pair<int,int>> pe={1,{2,3}};
    cout<<p.first<<" "<<pe.second.first<<" "<<pe.second.second;
    //Array
    pair<int,int> arr[]={{1,2},{2,3},{4,5},{5,6}};
    cout<<arr[0].first<<" "<<arr[0].second<<" "<<arr[2].second<<" "<<arr[3].first;
}