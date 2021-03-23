#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
   cin>>n;
  int flag=1;
  for(int i=2;i<=n;i++)
  {
     flag=1;
     for(int j=2;j*j<=i;j++)
     {  
       
        if(i%j==0)
        {
           flag=0;
           break;
        }
     }
     if(flag==1)
     {
        cout<<i<<" ";
     }
  }
    return 0;
}
