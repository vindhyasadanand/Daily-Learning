#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
    cin>>n;
    int arr[n];
   for(int i=0;i<n;i++)
   {
      cin>>arr[i]; 
   }
   int res=0;
  int count=0;
   for(int i=0;i<n;i++)
   {
      for(int j=0;j<n;j++)
      {
           
           res = arr[i]^arr[j];
           while(res)
           {
              res = res&(res-1); 
             // cout<<res;
              count++;
           }
       
      }
   }
  cout<<count;
    return 0;
}
