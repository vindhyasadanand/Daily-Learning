#include <iostream>
using namespace std;
//checks given number is prime
float euler(int n)
{
    if(n==1)
    {
       return 1;
    }
  for(int i=2;i*i<=n;i++)
  {
       if(n%i==0)
       {
          return 1; 
       }
  }
  return (float)(n-1)/n;
}
int main() 
{
   // Try out your code here
    int n,i;
    cin>>n;
    int p=n;
  //phi(n) we are calculating
    for(i=1;i*i<=n;i++)
    {
       if(n%i==0)
       {
          p=p*euler(i); 
          p=p*euler(n/i);
       }
    }
   cout<<(int)(p*n)/2;
    return 0;
}
