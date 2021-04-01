#include <bits/stdc++.h>
using namespace std;
void permute(string str,int l,int r)
{
   if(l==r)
   {
      cout<<str<<endl; 
   }
  else
  {
     for(int i=l;i<=r;i++)
     {
        swap(str[l],str[i]);
       permute(str,l+r,r);
       swap(str[l],str[i]);
     }
  }
}
int main() 
{
   // Try out your code here
   string str;
   cin>>str;
  int len = str.length();
  sort(str.begin(),str.end());
  permute(str,0,len-1);
    return 0;
}
