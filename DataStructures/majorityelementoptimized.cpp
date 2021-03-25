#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int t,n,temp,count,max,value;
    cin>>t;
  while(t--)
  {
     cin>>n;
    max=-100;
     int arr[100]={0};
     int count;
     for(int i=0;i<n;i++)
     {
         cin>>temp;
        arr[temp]++;
       if(arr[temp]>max)
       {
          max = arr[temp]; 
         value = temp;
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
