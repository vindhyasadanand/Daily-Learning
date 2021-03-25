#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int t,n,value;
  cin>>t;
  while(t--)
  {
    int max=-100;
      cin>>n;
      int arr[n];
      for(int i=0;i<n;i++)
      {
         cin>>arr[i]; 
      }
    for(int i=0;i<n;i++)
    {
        int count = 0;
        for(int j=0;j<n;j++)
        {
           if(arr[i]==arr[j])
           {
               count++;  
           }
        }
      if(count>max)
      {
         max = count;
         value = arr[i];
      }
    } 
      if(max>n/2)
      {
        cout<<value<<endl; 
      }
      else
      {
         cout<<-1<<endl;
      }
    }
   return 0;
  }
   
