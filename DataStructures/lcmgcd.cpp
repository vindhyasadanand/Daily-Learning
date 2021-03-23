#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
     int num1,num2;
    cin>>num1>>num2;
    int dividend,divisor,quotient;
    if(num1>=num2)
    {
       dividend = num1; 
       divisor = num2;
    }
    else
    {
       dividend=num2; 
      divisor = num1;
    }
   while(divisor!=0)
   {
      quotient = dividend%divisor;
      dividend = divisor;
      divisor = quotient;
      
   }
   cout<<dividend<<endl;
  cout<<(num1*num2)/dividend;
    return 0;
}
