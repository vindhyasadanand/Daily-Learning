#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int n,flag=0;
    cin>>n;
   // Try out your code here
    for(int i=2;i*i<n;i++)
    {
       if(n%i==0)
       {
          flag=1;
          break;
       }
    }
  if(flag==1)
  {
    cout<<"Given number is not a prime number";
  }
  else
  {
    cout<<"Given number is a prime number";
  }
    return 0;
}
