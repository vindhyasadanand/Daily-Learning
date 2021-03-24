#include <iostream>
#include<bits/stdc++.h>
using namespace std;
long int convert_num(int *arr,int n)
{
   long int sum =0;
   for(int i=0;i<n;i++)
   {
     sum = sum*10+arr[i]; 
   }
  return sum;
}
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
    sort(arr,arr+n);
    long int num;
    long int sum=0;
    do{
       num =  convert_num(arr,n);
       sum=sum+num;
    }while(next_permutation(arr,arr+n));
    cout<<sum;
    return 0;
}
