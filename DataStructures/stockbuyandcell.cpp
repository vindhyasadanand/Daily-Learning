#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int t,n;
  cin>>t;
  while(t--)
  {
     cin>>n;
    int min=0,max;
     int arr[n];
     for(int i=0;i<n;i++)
     {
        cin>>arr[i]; 
     }
    for(int i=0;i<n-1;)
    {
       while(arr[i]>=arr[i+1]&&(i<n-1))
         i++;
      if(i==n-1)
      {
         break;
      }
      min = i++;
      while(arr[i]>=arr[i-1]&&(i<n))
        i++;
      max = i-1;
      cout<<"("<<min<<" "<<max<<") ";
    }
    cout<<endl;
  }
    return 0;
}
