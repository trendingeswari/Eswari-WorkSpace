#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector <int> v(5,100);
    vector <int>::iterator it = v.begin();
    it++;
    cout<<*it<<" ";
}