#include <iostream>
using namespace std;
int gcd(int a,int b)
{
   if(b==0)
     return a;
  return gcd(b,a%b);
  
}
int main() 
{
   // Try out your code here
     int n,sum=1;
    cin>>n;
   for(int i=2;i<n;i++)
   {
       if(gcd(i,n)==1)
       {
          sum = sum+i;
       }
        
   }
   cout<<sum;
    return 0;
}
