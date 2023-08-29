// leetcode 217
import java.util.*;
class Main 
{
  static void duplicateremover(int array[] , int size)
  {
    int counter = 0;
    int array_2[]  = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        counter = 0 ;
        for(int j = i+1 ; j<size ; j++)
          {
            if(array[i]==array[j])
            {
              counter ++ ;
              
            }  
          }

        array[i]=counter ;
      }
    boolean flag = true ;
    for(int i = 0 ; i<size ; i++)
      {
        if(array[i]>0)
        {
          System.out.print("True");
          break ;
        }java 
        else 
        {
        flag = false ;
        }
      }
    if(flag == false)
    {
       System.out.print("False");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size];
    for(int i= 0 ; i<size ; i++)
      {
       // System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    duplicateremover(array,size);
  }
}

// leetcode 53 

import java.util.*;
class Main 
{
  static void duplicateremover(int array[] , int size)
  {
      {
    System.out.print("\n");
    for(int i=0;i<size;i++)
      {
        
        for(int j=i+1;j<size;j++)
          {
            if(array[i]==array[j])
            {
              for(int k=j;k<size-1;k++)
                {
                  array[k]=array[k+1];
                }
              size--;
              j--;
              
            }
            
          }
        
        
        
      }
    System.out.print("\n");
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
      }
        
  }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[] = new int[size];
    for(int i= 0 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
      }
    duplicateremover(array,size);
  }
}
//CHOCOLATE PROBLEM DISTRIBUTION 

import java.util.*;
class Main
{
  static void chocolatecheck(int array[] , int size , int num)
  {
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++)
          {
            if(array[i] > array[j])
            {
              int temp = array[i] ;
              array[i] = array[j] ;
              array[j] = temp  ;
            }
          }
      }
     for(int i = 0 ; i<size ; i++)
      {
        
            System.out.print(" "+array[i]);
          
      }
     System.out.print("\n");
    int array_2[] = new int [num];
    while(num<size)
      {
    //int array_2[] = new int [num];
    for(int k = 0 ; k<num ; k++ )
      {
       array_2[k] = array[k];
      }
    for(int k = 0 ; k<num ; k++ )
      {
        System.out.print(" "+array_2[k]);
      }
        break ;
      }
    if(num>size)
    {
      System.out.print("ERROR");
      
    }
    System.out.print("\n");
    int z = array_2[0] ;
    int s = array_2[num-1];
    int xv= s-z ;
    System.out.print("min : "+xv);
    
    
  }
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size]  ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter : ");
        array[i] = sc.nextInt();
        
      }
    System.out.print("enter the 'm' value ") ;
    int num = sc.nextInt() ;
    chocolatecheck(array,size ,num) ;
    
  }
}

// leetcode 33 // incomplte 
import java.util.*;
class Main
  {
    static void rotate(int array[] , int size)
    {
      Scanner kc = new Scanner(System.in);
       System.out.print("\n") ;
      System.out.print("enter the pivot : ") ;
      int pivot = kc.nextInt() ;
      for(int i = 0  ; i<pivot ; i++)
        {
          for(int j =pivot   ; j<size ; j++ )
            {
             int temp = array[i] ;
              array[i]=array[j];
              array[j] =temp ;
              
            }
        }
        System.out.print("\n") ;
        System.out.print("\n") ;
      for(int i = 0  ; i<pivot ; i++)
        {
          System.out.print(" "+array[i]);
        }
    }
    static void selectionsort(int array[] , int size)
    {
      for(int i =0 ; i<size ; i++)
        {
          for(int j = i+1  ;j<size ; j++)
            {
              if (array[i]>array[j])
              {
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp ;
              }
          
              }
          }
       for(int i =0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]);
        }
      rotate(array , size);
      
    }
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      int size = sc.nextInt() ;
      int array[] = new int [size];
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print("enter ");
          array[i] = sc.nextInt();
        }
      selectionsort(array , size);
      
    }
  }
  // leetcode 33 kadane algo // search in a rotated array is bascially kadnae algo 

int max=Integer.MIN_VALUE;

        int cs=0;

        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            if(cs>max)
            {
                max=cs;
            }
            if(cs<0)
            {
                cs=0;
            }
        }
        return max;
    
// palindrome leetcode 
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}


// reverse a number

class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}

// string elements into the array 
package com.journaldev.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToArrayExample {

    public static void main(String[] args) {
        String line = "My name";
       
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
      
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(line);
        System.out.println(Arrays.toString(words));
    }
}

//leetcode -3 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
// leetcode problem number 31 NEXT PERMUYTATION // error !!

import java.util.*;
  class Main
    {
      static void permutation(int array[] , int size)
      {
        int storage[][] = new int [size][size];
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size  ; j++)
              {
                int temp = array[i] ;
                array[i] = array[j] ;
                array[j]= temp ;
                
              }
          }
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size ; j++)
              {
                storage[i][j] = array[i];
              }
          }
        for(int i = 0 ; i<size ; i++)
          {
            for(int j = 0 ; j<size ; j++)
              {
               System.out.print(" "+storage[i][j]);
              }
          }
       
      }
      static int factorial(int size)
      {
        int product =1  ;
        
        for(int i = 1 ; i<=size ; i++)
          {
            product = product*i ; 
          }
        return product ;
      }
      public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() ;
        int array[]  = new int [size];
        for(int i = 0 ; i<size ; i++)
          {
            System.out.print("enter : ");
            array[i]  = sc.nextInt() ;
            
          }
        for(int i = 0 ; i<size ; i++)
          {
            System.out.print(" "+array[i]);  
          }
          System.out.print("\n");
        System.out.print("total permuataiton are : "+factorial(size));
          System.out.print("\n");
        permutation(array , size);
      }
    }

// Problem with the below approach works for some test cases 
import  java.util.*;
class Main 
{
  static void stock(int price[] , int day)
  {
    int min = price[1];
    int fix = 0;
    for(int i = 2 ; i<=day  ; i++)
      {
        if(price[i]<min)
        {
          min = price[i] ;
          fix = i;
        }
      }
    System.out.print(" min :  "+min) ;
    System.out.print("\n") ;
    System.out.print(" at  :  "+fix) ;
    int max =0;
    int date = 0 ;
    for(int i = fix ; i<day ; i++)
      {
        if(price[i]>max)
        {
          max = price[i] ;
          date = i ;
        }
      }
     System.out.print("\n") ;
    System.out.print(" max  :  "+max) ;
    System.out.print("\n") ;
    System.out.print(" at  :  "+date) ;
    System.out.print("\n") ;
    System.out.print(" the max stock differecne is  : "+(max-min));
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt() ;
    int price[] = new int [day+1];
    for(int i = 1 ; i<=day ; i++ )
      {
        System.out.print("enter ");
        price[i] =sc.nextInt();
      }
    stock(price , day);
  }
}
// MAX PROFIT LEET CODE 121 
import java.util.*;
class Main 
{

  static void stock(int array[] , int size)
  {
    int min = array[0] ;
    int buy =0 ;
   for(int i = 1 ; i<size  ; i++)
     {
      if(array[i]<min)
      {
        min = array[i] ;
        buy = i ;
      }
     }
   // System.out.print(" min   value  : "+min) ;
    System.out.print("\n") ;
  //  System.out.print("min index  :  "+buy) ;
  int max = 0;
    int sell = 0;
    for(int i = buy ; i<size ; i++)
      {
        if(array[i]>max)
        {
          max = array[i] ;
          sell = i ;
        }
      }
     // System.out.print(" max  value  : "+max) ;
    System.out.print("\n") ;
   // System.out.print("max index  :  "+sell) ;
    System.out.print("max_profit  :"+(max-min));
    
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt() ;
    int array[] = new int [size];
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter  : ");
        array[i]  = sc.nextInt() ;
      }
    stock(array , size);
  }
}
// miss and repeat 

import java.util.*;
class Main
{
  static void function(int array[] , int size)
  {
    // mising number is upwards 
    int repeat = 0;
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ; j<size ; j++ )
          {
            if(array[i] == array[j])
            {
              repeat = array[i] ;
            }
          }
      }
    System.out.print("\n");
    System.out.print(" repeated element is : "+repeat);
    System.out.print("\n");
    int counter[] =new int[size+1];
      System.out.print("\n");
    for(int i = 1 ; i<size+1 ; i++)
      {
        counter[i] = i ;
      }
    for(int i = 1 ; i<size+1 ; i++)
      {
       System.out.print(" "+counter[i]);
      }

   int s = 1 ; 
    int e = 1 ;
      System.out.print("\n");
    while(e!=(size))
      {
        if(array[s]!=array[e])
        {
          System.out.print(" " +array[s]);
          
        }
        s++ ;
        e++ ;
      }
  }
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size+1];
    for(int i =1 ; i<size ; i++)
      {
        System.out.print("enter ");
        array[i]= sc.nextInt();
        
      }
    for(int i =1 ; i<size+1 ; i++)
      {
       System.out.print(" "+array[i]);
      }
    function(array , size+1);
    
  }
}
// PROBLEM 215 KTH TERM IN THE ARRAY
import java.util.*;
class Main
{
  static void selectionsort(int array[] , int size ,int  k)
  {
    for(int i = 0 ; i<size  ; i++)
      {
        for(int j = i+1  ; j<size ; j++)
          {
            if(array[i]<array[j])
            {
              int temp = array[i];
              array[i] = array[j] ;
              array[j] = temp ;
            }
          }
      }
    for(int i =0 ; i<size  ; i++)
      {
        System.out.print(" "+array[i]);
      }
    System.out.print("\n");
    System.out.print(" kth index is : "+array[k-1]);
  }
  public static void main(String[] args)
  {
    Scanner sc  = new Scanner(System.in);
    int size  = sc.nextInt() ;
    System.out.print("index~");
    int k = sc.nextInt() ;
    
    int array[]  = new int [size];
    for(int  i= 0; i<size ; i++)
      {
        System.out.print("enter ");
        array[i] = sc.nextInt() ;
        
      }
    selectionsort(array , size,k);
    }
}
// Leetcode 42 doubt TRAPPING WATER 
// doubt 
// leetcode 238 error 
import java.util.*;
class Main 
{
  static void productarray(int array[]  , int size)
  {
    int product =1 ;
    int fix = 0;
    for(int i = 0 ; i<size ; i++)
      {
        product = 1 ;
        fix = i ;
        for(int j = 0 ; j<fix ; j++)
          {
            product = product*array[j] ;
          }
        for(int j = fix+1 ; j<size ; j++)
          {
            product = product*array[j];  
          }
        array[fix] = product;
      }
    System.out.print("\n");
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("  "+array[i]);
      }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() ;
    int array[]  = new int[size];
    for(int j = 0 ; j<size ; j++)
      {
        System.out.print("enter ");
        array[j] = sc.nextInt();
        
      }
    productarray(array , size);
  }
}

// leetcode problem from miscellanous website 
// 238 product of n terms 

 int[] ans = new int[nums.length];
        int temp = 1;
        for(int i = 0; i< nums.length; i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }
// leet code 153 // min  elemtn in the array 
import java.util.*;
class Main
{
  static void selectionsort(int array[]  , int size)
      {
      for(int i = 0 ; i<size ; i++)
        {
          for(int j=i+1 ;j<size ; j++)
            {
              if(array[i]>array[j])
              {
                int temp = array[i] ;
                array[i] = array[j];
                array[j]= temp;
              }
            }
        }
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]);
        }
        System.out.print("\n");
        System.out.println("min element  "+array[0]);
      
}

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int [size];
    for(int j =0 ; j<size ; j++)
      {
        System.out.print(" enter ");
        array[j] = sc.nextInt();
        
      }
    selectionsort(array , size);
  }
}

// lettcode 15 3sum 
import java.util.*;
class Main
{
  static void sum(int array[] , int size)
  {
    
    for(int i = 0 ; i<size ; i++)
      {for(int j =i+1 ; j<size ; j++)
        {
          for(int k = j+1 ; k<size ; k++)
            {
              if(i!=j && j!=k && k!=i && (array[i]+array[j]+array[k])==0)
              {
                System.out.println(" "+array[i]) ;
                System.out.println(" "+array[j]) ;
                System.out.println(" "+array[k]) ;
                System.out.println("next set ");
             
              }
            }
        }
      }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] =new int [size];
    for(int j = 0 ; j<size ; j++){
      System.out.print("enter ");
      array[j] = sc.nextInt();   
    }
    sum(array , size);
  }
}
// leetcode 31 next permuation 
class Solution {
    public void nextPermutation(int[] arr) {
        int temp=0,i,min=Integer.MAX_VALUE,pivot=0,pos=0;
        for ( i=arr.length-1;i>=1;i--)
            if (arr[i]>arr[i-1])
            {
                pivot=i;break;
            }
        if (pivot>0)
        {
            for (i=pivot;i<arr.length;i++)
            {
                if (arr[i]>arr[pivot-1])
                    min=Math.min(min,arr[i]);
                if (min==arr[i])
                    pos=i;
            }
           
            swap(arr,pos,pivot-1);
        }

        int high=arr.length-1;
        while(pivot<=high){
            swap(arr,pivot,high);
            high--;pivot++;
        }
    }
    private void swap(int[] arr,int low,int high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
    }
}
// leetcode 169 Majoprity elemtns
import java.util.*;
class Main
{
  public static void counter(int array[], int size)
  {
    int count = 0 ;
    int arraynew[] = new int [size];
    for(int i = 0 ; i<size ; i++)
    {
      count = 0 ; 
      for(int k = 0  ; k<size ; k++)
      {
        if(array[i]== array[k])
        {
          count++ ;

        }
        
      }
      arraynew[i]= count ;
    }
    
    System.out.print("\n");
    for(int l = 0 ; l<size ; l++)
    {
      for(int k = l+1 ; k<size ; k++)
      {
        if(array[k]>array[l])
        {
        int temp = arraynew[l];
        arraynew[l] = arraynew[k] ;
        arraynew[k]= temp ;
        }
      }
     
    }
     System.out.println(" "+arraynew[0]) ;
    
  }
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt() ;
      int array[]= new int[size] ;
      for(int k = 0 ; k<size ; k++)
      {
        System.out.print("enter ");
        array[k]= sc.nextInt() ;

      }
     
      counter(array  , size);
  }
}
// short cut 169 using the inbuilt functions 
class Solution {
    public int majorityElement(int[] nums) {
       int size = nums.length ;
       int newarray[] = new int[size] ;
       int count = 0 ;
       int index = 0 ;
       for(int i =0; i<size ; i++)
       {
           count = 0 ;
           index = 0 ;
           for(int k = 0 ; k<size ; k++)
           {
               if(nums[i]==nums[k])
               {
                    count ++ ;
                    index = i ;
                    
               }
           }
           newarray[i] = count++ ;
       }
      Arrays.sort(newarray);
       return newarray[size-1];
    }
}
// leetcode q20 valid parenthesis 
Stack <Character> st=new Stack<Character>();
        
        char ar[]=s.toCharArray();
        for(char c:ar)
        {
            if(c=='(')
            {
                st.push(')');
            }
            else if(c=='{')
            {
                st.push('}');
            }
            else if(c=='[')
            {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c)
            {
                return false;
            }

        }

        return st.isEmpty();
// k time rotation of a array 
import java.util.*;

public class krotate
{

   static void rotateone(int arr[],int n)
   {

      int t=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=t;
   }
   public static void main(String args[])
   {

      int n;

      System.out.println("Enter how many values ");
      Scanner sc=new Scanner(System.in);

      n=sc.nextInt();

      int ar[]=new int[n];

      for(int i=0;i<n;i++)
      {
         ar[i]=sc.nextInt();
      }
      System.out.println("How many times to shift ");
      int k=sc.nextInt();

      for(int i=0;i<k;i++)
      {
         rotateone(ar,n);
      }

      System.out.println("After k rotation ");
      for(int i=0;i<n;i++)
      {
         System.out.println(ar[i]+" ");
      }


   }
} 

// leetcode question 21 merger two sorted list used selection sort in this .
import java.util.*;
class Main 
{
    public static void selectionsort(int newarray[] , int s )
    {
        int min_index  =0 ;
        for(int i = 0 ;i<s; i++)
        {
             min_index = i ; 
            {
                for(int j = min_index+1 ; j<s ; j++ )
                {
                    min_index = j  ;
                    if(newarray[i]>newarray[j])
                    {
                        int temp = newarray[i] ;
                        newarray[i] = newarray[j] ;
                        newarray[j] = temp ;
                    }
                }
            }
        }
        System.out.print("\n");
        for (int u = 0 ; u<s  ; u++)
        {
            System.out.print(" "+newarray[u]);
        }
    }
   
    public static void main(String  args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int nums = sc.nextInt() ;
        int array[] = new int[size];
        int narray[] = new int[nums];
        for(int i = 0 ; i<size  ; i++)
        {
            System.out.println("enter ") ;
            array[i] = sc.nextInt() ;

        }
        for(int i = 0 ; i<nums  ; i++)
        {
            System.out.println("enter for the second array  ") ;
            narray[i] = sc.nextInt() ;
            
        }
        int s = size +nums ;
        int newarray[] = new int[s] ;
        int j = 0 ;
        while(j!=size)
        {
            newarray[j] = array[j] ;
            j++ ;
        }
        int k = 0 ;
        
            while(k!=nums)
            {
                newarray[j+k] = narray[k];
                k++; 
            }
        for(int i = 0 ; i<s ; i++)
        {
            System.out.print(" "+newarray[i]) ;
        }
        selectionsort(newarray ,s );
    } 
}
// leetcode 997 square and then sorting 
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[]  = new int [size];
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print("enter ") ;
            array[i] = sc.nextInt() ;
        }
        Arrays.sort(array) ;
        for(int i = 0 ; i<size ; i++)
        {
            array[i] = (int)Math.pow(array[i],2) ;
            System.out.print(" "+array[i]) ;
        }
        
    }
}
 // using inbuilt functions 997 
 import java .util.* ;
class Solution {
    public int[] sortedSquares(int[] nums) {
       int size = nums.length ;
       for(int j = 0 ; j<size ; j++)
        {
            nums[j] = (int)Math.pow(nums[j],2) ;
        }
        Arrays.sort(nums);
    return nums ;
    }
      
}

// question 28 leetcode // error in the output .
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String haystack = sc.nextLine() ;
        String needle  = sc.nextLine() ;
        char array[] = haystack.toCharArray() ;
        char arr[] = needle.toCharArray() ;
        int leng  = array.length ;
        int leg = arr.length ;
        char ch[ ] = new char[leng] ;
        for(int i= 0 ; i<leng ; i++)
        {
            System.out.print(" "+array[i]);
        }
        for(int k = 0 ; k<leg ; k++)
        {
            System.out.print(" "+arr[k]) ;
        }
        for(int i = 0 ; i<leng ; i++)
        {
            for(int k =0 ; k<leg ; k++)
            {
                if(array[i]==array[k])
                {
                        ch[i] = array[i] ;
                }
        }
         for(int s = 0 ; s<leng ; s++)
         {
            if(ch[s]==arr[s])
            {
                System.out.println( " yes ") ;
            }
         }
     }
}
}

// USE THE NAVE' BAYER'S ALGORITHM IN THIS 
int count = 0 ;
        int n = haystack.length();
        int m = needle.length();
        if(n == 1 && m==1){
            return 0;
        }else{
            for(int i = 0 ; i<= n-m  ; i++){
            for(int j = 0; j<m ; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    //System.out.println(i);
                    break;
                }

                //System.out.println(i);
                    
                //System.out.println()   

                if(j == m - 1){
                    return i;
                }
              
            }

          
        }
        }


        return -1;
      }
    }
  }
}

// leetocode q35 solution 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length ;
        int index = 0 ;
        for(int i = 0 ; i<size ; i++)
        {
            if(nums[i]==target)
            {
                //System.out.println(""+i) ;
                index = i ;
            
                break ;
            }
            else 
            {
                if(nums[i]<target &&  i == size -1 )
                {
                    //System.out.println(""+i+1) ;
                    index = i+1 ;
                    break ;
                }
                else if(nums[i]>target)
                {
                   // System.out.print(""+(i-1)) ;
                   if(i!=0)
                   { 
                    index = i-1 ;
                    break ;
                    }
                    else if(i==0 & nums[i]>target)
                    {
                        index = 0 ;
                        break ;
                    }
                  
                }
                else if(i !=size-1 && nums[i]<target && nums[i+1]>target)
                {
                    //System.out.println(""+(i+1)) ;
                    index = i+1 ;
                    break ;
                }
                
            }
    }
    return index ;

    }
} 
// leetcode 34 logic of -1 is wrong 
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int target  = sc.nextInt() ;
        int array[]= new int[size] ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" enter ");
            array[i] = sc.nextInt()  ;
        }
        Arrays.sort(array) ;
        int ind = 0 ;
        int index[]= new int[size];
        for(int i = 0 ; i<size ; i++)
        {
            if(array[i]==target)
            {
                
               index[i] = i  ;
            }
            else 
            {
                ind = i ;
                index[i] = -1 ;
            }
            
        }
        for(int i = 0 ; i<size ; i++)
        {
            if(index[i]!=-1)
            {
                System.out.println("index is "+i) ;
            }

            
        }
        
        
    }
}

// leetcode question on nlinkedklist deletion java  // error on the code 19
// use the linked class simply . 

if(head==null){
            return null;
        }
        if(head.next ==null && n==1){
            return null;
        }
        
        ListNode curr = head;
        int p=0;
        while(curr!=null){
            curr = curr.next;
            p++;
        }
        if(n==p){
            head = head.next;    
            return head;
        }
        ListNode a = head;
        int t=0;
        while(t<(p-n-1)){
          a= a.next ;
          t++;
        }
        a.next = a.next.next;
  return head;

// leetcode 136 
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[] = new int[size] ;
        int extra[] = new int[size] ;
        int count = 0;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print("enter ");
            array[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i<size ; i++)
        {   
            count = 0;
            for(int k = 0 ; k<size ; k++)
            {
                if(array[i]==array[k])
                {
                    count ++ ;
                }
            }
            extra[i] = count ;
        }
        int numindex = 0;
        for(int i = 0 ; i<size ; i++)
        {
            if(extra[i]!=2)
            {
                    numindex = i ;
                    System.out.print(" number is  "+array[numindex]) ;
                    break ;
            }
        }
        
    }
}
// leetcode question 268 missing number // using the flaging concept in java 
int arr[] = new int[nums.length + 1];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]] = 1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                return i;
            }
        }
        return 0;
// leetcode q 58 length of last word 
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String sent = sc.nextLine() ;
        String[] array = sent.split(" ");
        int num = array.length ;
       // System.out.print(array[0]) ;
        char newarray[] = array[num-1].toCharArray() ;
        int size = newarray.length ;
        System.out.print(" length is "+size) ;
    }
}
// linkedlist removal of duplicates
 ListNode temp = head;
        while(temp!=null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
// leetcode 66 
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[] = new int[size] ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print("enter ") ;
            array[i] = sc.nextInt() ;
        }
        array[size-1]= array[size-1]+1 ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" "+array[i]);
        }
    }
}
// leetcode question  66 fastest 
class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}
// leetcode question 34 // error in this the index are not getting uopdated . 

import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt()  ;
        int array[] = new int [size] ;
        int index[] = new int[2] ;
        for(int i= 0 ; i<size ; i++)
        {
            System.out.print(" enter ") ;
            array[i] = sc.nextInt() ;
        }
        int target  = sc.nextInt() ;

        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1  ; j <size  ; j++  )
            {
            if(array[i] ==target)
            {
                index[0] = i  ;
            }
            if(array[i] == target && array[j]!=target && j == i+1)
            {
                index[1]  = i  ; 
                break ;
            }
            else 
            {
                    index[1]=  -1 ;
                    index[0] = -1  ;
            }
        }
        }
        for(int k = 0 ; k<2 ; k++)
        {
            System.out.print("  "+index[k]) ;
        }
    }
}
// leetcode question problem 100
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true ;
        }
        else if(p==null || q==null)
        {
            return false ;

        }
        else if(p!=null && q!=null)
        {
            return (p.val==q.val) && isSameTree(p.left , q.left) && isSameTree(p.right, q.right);


        }
        return false ;
    }
}
// 3 sum question 15 
import java.util.* ;
class Main 
{
    public static void threesum(int array[] , int size)
    {
        int sum =0 ;
        for(int  i = 0 ; i<size  ; i++)
        {
            for(int j = i+1  ; j<size  ; j++)
            {
                sum  = 0 ;
                for(int k = j+1  ;k<size ;k++)
                {
                    sum  = array[i]+array[j]+array[k] ;
                    if(i!=j&&j!=k&&k!=i && sum ==0)
                    {
                        System.out.println(" "+i+" "+j+" "+k) ;
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[] = new int[size] ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" enter ");
            array[i] = sc.nextInt() ;

        }
        threesum(array , size) ;
    }
}
//LEETCODE QUESTION 16 3SUM CLOSET 
 import java.util.*;
 class Main 
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size  = sc.nextInt() ; 
        int array[] = new int[size] ;
        int target =  sc.nextInt() ;
        int sum = 0 ;
        for(int y = 0 ; y<size ; y++)
        {
            System.out.print("enter") ;
            array[y] = sc.nextInt() ;
        }
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size  ; j++)
            {
                sum  =0  ;
                for(int  k =  j+1  ; k<size  ; k++)
                {
                    sum = array[i]+array[j]+array[k] ;
                    if(sum == target)
                    {
                        System.out.print(" "+i) ;
                        System.out.print(" "+j) ;
                        System.out.print(" "+k) ;
                        System.out.println(" sum "+sum)  ;
                       
                    
                    }
                    if(sum==0)
                    {
                        System.out.print(" "+0) ;
                        break ;
                    }
                   
                }
            }
        }
    }
 }
// leetcode question 18 4 sum index 
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt()  ;
        int array[] = new int[size] ;
        int sum = 0 ;
        int target = sc.nextInt() ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" enter ") ;
            array[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size ; j++)
            {
                for(int k = j+1  ; k<size ; k++)
                {
                    sum = 0 ;
                    for(int q = k+1 ; q<size ; q++)
                    {
                        sum = array[i] + array[j]+ array[k]+ array[q]  ;
                        if(sum==target)
                        {
                            System.out.println("\n") ;
                            System.out.print(" "+i) ;
                            System.out.print(" "+j) ;
                            System.out.print(" "+k) ;
                            System.out.print(" "+q) ;
                            System.out.println("\n") ;

                        }
                    }
                }
            }
        }
    }
}

// leetcode 18 values
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt()  ;
        int array[] = new int[size] ;
        int sum = 0 ;
        int target = sc.nextInt() ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" enter ") ;
            array[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size ; j++)
            {
                for(int k = j+1  ; k<size ; k++)
                {
                    sum = 0 ;
                    for(int q = k+1 ; q<size ; q++)
                    {
                        sum = array[i] + array[j]+ array[k]+ array[q]  ;
                        if(sum==target)
                        {
                            System.out.println("\n") ;
                            System.out.print(" "+array[i]) ;
                            System.out.print(" "+array[j]) ;
                            System.out.print(" "+array[k]) ;
                            System.out.print(" "+array[q]) ;
                            System.out.println("\n") ;

                        }
                    }
                }
            }
        }
    }
}

// return the answer in the form of array using <list> formats . 
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        
        if(nums.length<4){
            return res;
        }
        
        for(int i=0;i<=nums.length-4;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int val=nums[i];
            List<List<Integer>> subList=threeSum(nums,i+1,target-val);
            
            for(List<Integer> ls:subList){
                ls.add(val);
                res.add(ls);
            }
        }
        
        return res;
    }
    
    public List<List<Integer>> threeSum(int []nums, int si, int target){
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=si;i<=nums.length-3;i++){
            if(i!=si && nums[i]==nums[i-1]){
                continue;
            }
            
            long val=(long)target-(long)nums[i];
            int s=i+1;
            int e=nums.length-1;
            
            while(s<e){
                if(s!=i+1 && nums[s]==nums[s-1]){
                    s++;
                    continue;
                }
                
                if(e!=nums.length-1 && nums[e]==nums[e+1]){
                    e--;
                    continue;
                }
                
                if(((long)nums[s]+(long)nums[e])==(long)val){
                    List<Integer> subList=new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[s]);
                    subList.add(nums[e]);
                    
                    res.add(subList);
                    s++;
                    e--;
                }else if(((long)nums[s]+(long)nums[e])<(long)val){
                    s++;
                }else{
                    e--;
                }
            }
        }
        
        return res;
    }
}
// leetcode 33 
class Solution {
    public int search(int[] nums, int target) {
    int num = -1 ;
    int size = nums.length ;
    for(int i = 0 ; i<size ; i++)
    {
        if(nums[i]==target)
        {
            num = i ;
        }
        
    }
    if(num!=(-1))
    {
        return num ; 
    }
    else
    {
        return -1 ;
    }
    }
}
// swap leetcode 24 implemetartion of linked list using array 

import java.util.*;
class Main
{
    public static void swap(int array[] , int size)
    {
        if(size %2==0)
        {
            for(int i = 0 ; i<size ; i=i+2)
            {
                if(i!=size-2 && i<size )
                {
                    int temp = array[i] ;
                    array[i]= array[i+1] ;
                    array[i+1] = temp  ;
                }
                else 
                {
                    continue ;
                }
            }
        }
        else 
        {
            for(int i = 0 ; i<size ; i = i+2)
            {
                  if(i<size-2)
                {
                    int temp = array[i] ;
                    array[i]= array[i+1] ;
                    array[i+1] = temp  ;
                }
                else 
                {
                    continue ;
                }

            }
        }
        for(int i = 0   ; i<size ; i++)
        {
            System.out.print(" "+array[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[] = new int[size] ;
        for(int i = 0 ; i<size ; i++)
        {
            System.out.print(" enter ") ;
            array[i] = sc.nextInt() ;
        }
        swap(array , size) ;
    }
}
// 121 leetocde final solution 

int min=prices[0];

      int maxp=0;

      for(int i=0;i<prices.length;i++)
      {

        if(prices[i]<min)
        {
            min=prices[i];
        }
        if(prices[i]-min >maxp)
        {
          maxp=prices[i]-min;
        }

      }
      return maxp;

// leetcode 2 d matrix q74
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[][]=  new int[size][size] ;
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                System.out.print("emter the input ") ;
                array[i][j] = sc.nextInt() ;

            }

        }
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                System.out.print(" "+array[i][j]) ;
            }
            System.out.print("\n") ;
        }
        int target = sc.nextInt() ;
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                if(array[i][j]==target)
                {
                    System.out.println("element found at "+i+" "+j) ;
                }
            }
        }
    }

// leetcode240 search int the matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int sum = 0 ;
        boolean flag = false ;
        int m  = matrix.length ;
        int n  = matrix[0].length ;
        for(int i = 0 ; i<m  ; i++)
        {
            sum = 0 ;
            for(int j = 0 ; j<n  ; j++)
            {
                sum = sum + matrix[i][j]  ;
                if(sum==target)
                {
                    flag = true  ;
                }
            }
        }
        return flag ;

    }
}
// binary search appiorach 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int left, right, mid;
        for (int i = 0; i < matrix.length; i++) {
            left = 0;
            right = matrix[i].length - 1;

            if (matrix[i][right] >= target) {

                while (left <= right) {
                    mid = left + (right - left) / 2;

                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }

        return false;

    }
}
// leetcode 852 lon(array.klenght)time 

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0 ;
       int size = arr.length  ;
       int array[] = new int [size] ;
       for(int i = 0 ; i<size  ; i++)
       {
           array[i] = arr[i] ;
       }
       Arrays.sort(array) ;
       int peak = array[size-1] ;
       for(int i = 0 ; i<size ; i++)
       {
           if(arr[i]==peak)
           {
               index = i ;
           }
       }
       return index ;


    }

}

// leetcode 162
class Solution {
    public int findPeakElement(int[] nums) {
         int index = 0 ;
       int size = nums.length  ;
       int array[] = new int [size] ;
       for(int i = 0 ; i<size  ; i++)
       {
           array[i] = nums[i] ;
       }
       Arrays.sort(array) ;
       int peak = array[size-1] ;
       for(int i = 0 ; i<size ; i++)
       {
           if(nums[i]==peak)
           {
               index = i ;
           }
       }
       return index ;


    }
}
// 189 leetcode 37/38 time limit excedded 
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length  ;
        int z= 0 ;
       while(z!=k)
        {
        int t=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            nums[i+1]=nums[i];
        }
        nums[0]=t;
        z++ ;
        }
    }
}
// leetcode 128
class Solution {
    public int longestConsecutive(int[] nums) {
      
        if(nums.length < 2)
            return nums.length;
        
        Arrays.sort(nums);
        
        int max = 1;
        int tempMax = 1;
        for(int i = 1; i < nums.length; i ++)
        {
            if(nums[i] == nums[i-1] + 1)
            {
                tempMax ++;
            }
            else if(nums[i - 1] != nums[i])
            {
                max = Math.max(max, tempMax);
                tempMax = 1;
            }
        }
        return max = Math.max(max, tempMax);
    }
}

// unique path II doubt dynamic programming 

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length ;
        int n = obstacleGrid[0].length;
        int dp[][] = new int [m+1][n+1];
        if(obstacleGrid[0][0] != 1)
        dp[1][1] = 1;
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (obstacleGrid[i - 1][j - 1] != 1)
                    dp[i][j] += dp[i - 1][j] + dp[i][j - 1];
        return dp[m][n];
    }
}
// leetcode 283 
class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length  ;
        int k = 0 ;
        int count=0 ;
        for(int i = 0 ; i<size  ; i++)
        {
            if(nums[i]!=0)
            {
                nums[k] = nums[i] ;
                k++ ;
                count ++ ;
            }
        }
        for(int s = k ; s<size ; s++)
        {
            nums[s]=0 ;

        }
  
    }
}
// binary search 
class Solution {
    public int search(int[] nums, int target) {
         int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            if (nums[m] == target)
                return m;
 
           
            if (nums[m] < target)
                l = m + 1;

            else
                r = m - 1;
        }
        return -1;
    }
}
// leetcode 2529
class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0 ;
        int neg = 0 ;
        int size = nums.length ;
        for(int i = 0 ; i<size ; i++)
        {
            if(nums[i]<0)
            {
                neg ++ ;
            }
            else if(nums[i]>0)
            {
                    pos ++ ;
            }
            else if(nums[i]==0)
            {
                continue ;
            }
        }
        if(pos>neg)
        {
            return pos  ;
        }
        else
        {
            return neg ;
        }
    }
}
// 1351 leetcode 
class Solution {
    public int countNegatives(int[][] grid) {
        int  m = grid.length ;
        int n = grid[0].length ;
        int count = 0 ;
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(grid[i][j]<0)
                {
                    count ++ ;
                }
            }
        }
        return count ;
    }
}
// leetcode 167 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int array[] = new int[2] ;
        array[0] = -1  ;
        array[1] =-1 ;
        int size = numbers.length ;
        int sum = 0 ;
        if(size == 0)
        {
            return array ;
        }
        for(int i = 0 ; i<size ; i++)
        {
            sum = 0 ;
            for(int j = i+1 ; j<size  ; j++)
            {
                sum = numbers[i]+numbers[j] ;
                if(sum==target)
                {
                    array[0] = i +1  ;
                    array[1] = j +1 ;
                    break  ;
                }
            }
        }
        return array ;
    }
}

// leetcode 2733 
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int size = nums.length  ;
        Arrays.sort(nums) ;
        if(size ==1 )
        {
            return -1 ;
        }
        else if (size ==2)
        {
            return -1  ;
        }
        else 
        {
            return nums[1] ;
        }

        
    }
}
// leetcode 509
class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n ;
        }
        else 
        {
            return fib(n-1)+fib(n-2) ;
        }
    }
}
// leetcode 1137 using the deep learning 

class Solution {
    int[] dp = new int[38];
    public int tribonacci(int n) {
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }   
}
// leetcode 220 41/44 passed

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        boolean flag = false  ;
        int size  = nums.length  ;
        for(int i = 0 ; i<size  ; i++)
        {
            for(int j = i+1 ; j<size  ; j++)
            {
                if(i!=j && Math.abs(i-j)<=indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff )
                {
                    flag = true  ;
                }
                else 
                {
                    continue ;
                }
            }
        }
        return flag  ;
    }
}

// leetcode 287 
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums) ;
        int size = nums.length ;
        int count = 0 ;
        for(int i = 0 ; i<size-1 ; i++)
        {
            if(nums[i]==nums[i+1])
            {
                count = nums[i] ;
                break  ;
            }
        }
        return count  ;
    }
        
}
// leetcode 2798
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int size = hours.length ;
        int res =  0   ;
        for(int i = 0 ; i<size ; i++)
        {
            if(hours[i]>=target)
            {
                res = res +1  ;

            }
        }
        return res ;
    }
}
// leetcode 391
class Solution {
    public int getSum(int a, int b) {
        return a+b ;
    }
}
// leetcode 2413
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
            return n  ;
        }
        else 
        {
            return 2*n  ;
        }
        
    }
}
// leetcode 912
class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums ;
    }
}

// leetcode 628 
class Solution {
    public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
        int len = nums.length;
        
        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1] * nums[len-2] * nums[len-3]);
    }
}
// leetcode 747 error 
class Solution {
    public int dominantIndex(int[] nums) {
        int size = nums.length ; 
        boolean flag = false ;
        int count = -1 ;
        int array[] = new int[size] ;
        for(int i = 0 ; i<size ; i++)
        { 
            array[i] = nums[i] ;
        }
        Arrays.sort(nums) ;
        int max = nums[size-1] ;
        for(int i = 0 ; i<size ; i++)
        {
            nums[i] = nums[i]*2 ;

        }
        for(int i = 0 ; i<size ;i++)
        {
            if(nums[i]>=max)
            {
                flag = true ;
            }
            else 
            {
                flag = false ;
            }
        }
        if(flag == true)
        {
            for(int i = 0 ; i<size ; i++)
            {
                if(array[i]==max)
                {
                    count = i ;
                }
            }
        }
        return count  ;
    }
}

// leetcode bucket sort algorithm 
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;
        List<Integer> ff[] = new List[n+1];

        for(int i=0;i<=n;i++){
            ff[i] = new ArrayList<>();
        }

        int ans[] = new int[k];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int key: map.keySet()){
            int val = map.get(key);
            ff[val].add(key);
        }

        int idx = 0;

        for(int i=n;i>=0 && idx<k;i--){

            if(!ff[i].isEmpty()){
                
                for(int e: ff[i]){
                    ans[idx++] = e;
                    if(idx>=k){
                        break;
                    }
                }
            }

        }

        return ans;

    }
}
// leetcode prime count used standard algorithm seive of 
if(n==0) return 0;
        int[] arr=new int[n+1];
        int count=0;
        Arrays.fill(arr,1);
        arr[0]=arr[1]=0;
        for(int i=2;i<n;i++)
        {
            if(arr[i]==1){
                count++;
                for(int j=2*i;j<n;j=j+i){
                    arr[j]=0;
                }
            }
        }
        return count;
// leetcodee question ton invert a binary search tree 
  if (root == null) return null;
        TreeNode tempRight = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tempRight);
        return root;
// leetcode 2169 
class Solution {
    public int countOperations(int num1, int num2) {
        int count =0 ;
         if(num1==0 || num2 == 0)
        {
            return 0 ;
        }
        else 
        {
        while(num1!=0 || num2!=0)
        {
            if(num1 <num2)
            {
                num2 = num2 - num1 ;
                count ++ ;
            }
            else if(num1==num2)
            {
                count ++ ; 
                break ;
                
            }
            else
            {
                num1 = num1 -num2 ;
                count ++ ;
            }
           
        }
        }
       
         return count  ;

    }

}
// leetcode 1342 
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num-=1;
                count++;
            }
        }
        return count;

    }
}
// leetcode duplicate contianer II time limit excedded error on 46/57


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false ;
        Arrays.sort(nums)
        for(int i = 0 ; i<nums.length ; i++)
        {
                for(int j =  i+1  ; j<nums.length ; j++)
                {
                    if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                    {
                        flag = true ;
                        break ;
                    }
                }
        }
        return flag  ;
    }
}
//leetcode 50 
import java.util.*;
class Main
  {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in) ;
      int num = sc.nextInt() ;
      int power = sc.nextInt() ;
      double z  = (double)Math.pow(num , power);
      System.out.print(z) ;
        
    }
  }
// leetcode squareroot 
class Solution {
    public int mySqrt(int x) {
        
        int z = (int)Math.pow(x,0.5) ;
        return z ;
    }
}
// LOVE BABBER SHEET SOLUTIONS 
// QUESWTION 1 
import java.util.*;
class Main 
  {
    static void reverse(char array[] , int size)
    {
      System.out.print("\n");
      for(int i = size-1 ; i>=0 ; i--)
        {
          System.out.print(""+array[i]) ;
          
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int size = sc.nextInt() ;
      char array[]= sc.next().toCharArray() ;
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(""+array[i]) ;
        }
      reverse(array , size) ;
      
    }
    
  }
// QUESTION 2 // longest substring in a array leetcode 6 

import java.util.*;
class Main 
{
  static void substring(char array[] , int size)
  {
    int counter = 0 ;
    for(int i= 0  ; i<size ; i++)
      {
        for(int j = size -1 ; j>=0 ; j--)
          {
            if(array[i]==array[j])
            {
              counter ++ ;
            }
            else 
            {
              break ;
            }
          }
      }
    char tnew[] = new char[counter] ;
    for(int i= 0  ; i<size ; i++)
      {
        for(int j = size -1 ; j>=0 ; j--)
          {
            if(array[i]==array[j])
            {
              tnew[i] = array[i] ;
            }
          }
      }
    for(int i = 0 ; i<counter ; i++)
      {
        System.out.print(" "+tnew[i]);
      }
    
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    int  size = sc.nextInt() ;
    char array[] = sc.next().toCharArray() ;
   for(int i = 0 ; i<size ; i++)
     {
       System.out.print(" "+array[i]);
     }
    substring(array , size) ;
    
  }
}

// Question 3 maximum and minimum elements
import java.util.*;
class Main
  {
    static void selectionsort(int array[] , int size)

    {
      
      for(int i = 0 ; i<size ; i++)
        {
          int min = i ;
          for(int j = i+1 ; j<size ;j++)
            {
              if(array[i]>array[j])
              {
                int temp =array[i] ;
                array[i] = array[j] ;
                array[j] = temp  ;
                
              }
            }
        }
      for(int k= 0 ; k<size ; k++)
        {
            System.out.print(" "+array[k]) ;
          
        }
    }
    public static void main(String args[])

    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)

        {
          System.out.print("enter the number") ;
          array[i] = sc.nextInt();
      }
      selectionsort(array , size) ;
    }
  }
  // 1,2,0 sorting algorithm 
  import java.util.*;
class Main
  {
    static void selectionsort(int array[] , int size)

    {
      
      for(int i = 0 ; i<size ; i++)
        {
          int min = i ;
          for(int j = i+1 ; j<size ;j++)
            {
              if(array[i]>array[j])
              {
                int temp =array[i] ;
                array[i] = array[j] ;
                array[j] = temp  ;
                
              }
            }
        }
      for(int k= 0 ; k<size ; k++)
        {
           System.out.print(" "+array[k]) ;
        }
    }
    public static void main(String args[])

    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)

        {
          System.out.print("enter the number") ;
          array[i] = sc.nextInt();
      }
      selectionsort(array , size) ;
    }
  }
// negative on one side of the array 
import java.util.*;
class Main
  {
    static void negative(int array[] , int size)
    {
      for(int k = 0 ; k<size ; k++)
        {
          
          for(int u = k+1 ; u<size ; u++)
            {
              if(array[k]>array[u])
              {
                int temp = array[k] ;
                array[k]= array[u] ;
                array[u] = temp  ;
               }
            }
        }
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print(" "+array[i]) ;
        }
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)
        {
          array[i] =sc.nextInt() ;
        }
    
      negative(array , size) ;
      
    }
  }
// union wihtout any inbuilt operation 

  import java.util.*;
  class Main
    {
      
      static void union(int array[] , int narray[] , int size, int num)
      {
        int min  ;
        if(size<num)
        {
          min = size ;
        }
        else 
        {
          min = num  ;
        }
        int g = 0 ;
        int union[] = new int [min] ;
        for(int i =0 ; i<size ; i++)
          {
            for(int j = 0 ; j<num  ; j++)
              {
                if(array[i] == narray[j])
                {
                  union[g] = narray[j] ;
                  g++ ;
                }
              }
          }
        for(int s=0 ; s<min  ; s++)
          {
            if(union[s]!=0)
  
            {
                System.out.print(" "+union[s]);
            }
          }
      }
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int num = sc.nextInt() ;
        int array[] = new int[size] ;
        int narray[] = new int[num] ;
        for(int i = 0 ;i<size ; i++)
          {
            System.out.print("enter the input ") ;
            array[i] = sc.nextInt() ;
          }
        for(int l= 0 ; l<num ; l++)
  
          {
            System.out.print("input for the next array") ;
            narray[l] = sc.nextInt() ; 
          }
        union(array , narray , size , num) ;
       
      }
    }
// intersection question 

import java.util.*;
class Main 
  {
    static void intersect(int array[]  , int size , int you[] ,int num)
    {
      int total = size+num ;
      int narray[] = new int[total] ;
      for(int i = 0 ; i<size ; i++)
        {
          narray[i] = array[i] ;
          
        }
      for(int j =0  ; j<num  ; j++)
        {
          narray[size+j+1] =you[j] ;
          
        }
      int duplicate[] = new int[total] ;
      
      for(int j = 0 ; j<total ; j++)
        {
          for(int k =  j+1; k<total ; k++)
            {
              if(narray[k]!=narray[j])
              {
              duplicate[j] = narray[j] ;
              }
            }
        }
      for(int o = 0 ; o<total ; o++)
        {
          System.out.print(" "+duplicate[o]) ;
        
        }
        
    }
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int l = 0 ;l<size ; l++) ;
      {
        System.out.print("enter the number ") ;
        array[l] = sc.nextInt() ;
      }
      int num = sc.nextInt() ;
      int you[] = new int[num] ;
      for(int i = 0 ; i<num  ; i++)
        {
          System.out.print("enter  :");
          you[i] = sc.nextInt() ;
          
        }
      intersect(array , size , you , num) ;
      
    }
  }
  // reverse the array wihtout the for/while loop 
  import java.util.*;
class Main
  {
    static void cyclic(int array[] , int size , int cycle)
    {
      int i = 0 ;
      while(i!=cycle)
        {
          int temp = array[i] ;
          array[i]=  array[size-1-i] ;
          array[size-1-i] = temp ;
          i++ ;
          
        }
      for(int p= 0 ; p<size ; p++)
        {
          System.out.print(" "+array[p]);
        }
    }
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int cycle = sc.nextInt() ;
      int array[] = new int [size] ;
      for(int i = 0 ; i<size ; i++)
        {
          System.out.print("enter ") ;
          array[i]=sc.nextInt() ;
        }
      cyclic(array , size , cycle);
      
    }

    
  } 
// maxium subarray sum error 

import java.util.*;
class Main
  {
    static void subarray(int array[] , int size , int sum)
    {
      
      int newsum= 0;
      for(int i = 1 ; i<=size ; i++)
        {
          
          for(int k = i +1 ; k<= size ; k++)
            {
               newsum  = array[i]+array[k] ;
              
             while(newsum<sum)
               
                  k++ ;
                 newsum = newsum+array[k] ;
               }
          
            }
      System.out.println(newsum);
        }
  
    
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt() ;
      int array[]= new int [size+1 ] ;
      int sum = sc.nextInt() ;
      for(int i = 1 ; i<=size ; i++)
        {
          System.out.print(" enter ");
          array[i] = sc.nextInt() ;
          
        }
      subarray(array , size , sum) ;
      
    }
  }
// missing number in the array // one liner
class Solution {
  int missingNumber(int array[], int n) {
    return (n*(n+1))/2-Arrays.stream(array).sum();
  }
}
// long ALGORITHM 
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int[size] ;
  for(int k =0  ; k<size; k++)
    {
      System.out.print(" enter ") ;
      array[k] = sc.nextInt() ;
    }
    for(int i = 0 ; i<size ; i++)
      {
        for(int k= i+1 ; k<size ; k++)
          {
            if(array[i]>array[k])
            {
              int temp  = array[i] ;
            array[i] = array[k] ;
            array[k] =temp;
            }
            
            
          }
      }
    for(int i = 0 ; i<size  ; i++)
      {
        System.out.print(" "+array[i]) ;
      }
    int min = array[0] ;
    int max = array[size-1] ;
    int fnew = max-min ;
    int posarray[] = new int[max-min] ;
    for(int i= 0 ; i<fnew ; i++)
      {
        array[i] = posarray[i] ;
      }
    for(int i = min ; i<max ; i++)
      {
        if(posarray[i]!=i && posarray[i]!=0)
        {
            System.out.print(" "+posarray[i]) ;
        }
      }
  }
}

// minimum ju8mpws needed 
import java.util.*;
class Main 
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in) ;
      int size = sc.nextInt() ;
      int array[] = new int[size];
      for(int i = 0 ; i<size  ;i++)
        {
          System.out.print("enter ") ;
          array[i] = sc.nextInt() ;
          
        }
      int counter = 0;
      for(int i = 0  ; i<size ; i++)
        {
          if(array[0]==0)
          {
            counter = 0 ;
            System.out.print(counter) ;
          }
          else 
          {
            i = i+array[i] ;
            counter ++ ;
            if(i>size)
            {
              System.out.print("the max values that are needed is"+counter ) ;
            }
            
          }
        }
    }
  }
  // leetcode 1342 
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num-=1;
                count++;
            }
        }
        return count;

    }
}
// leetcode duplicate contianer II time limit excedded error on 46/57


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false ;
        Arrays.sort(nums)
        for(int i = 0 ; i<nums.length ; i++)
        {
                for(int j =  i+1  ; j<nums.length ; j++)
                {
                    if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                    {
                        flag = true ;
                        break ;
                    }
                }
        }
        return flag  ;
    }
}
// leetcode question player that is winner 
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1  = 0 ;
        int player2 = 0 ;
        int size  = nums.length ;
        int maxmin =  nums[0] ;
        int minmax = nums[size-1] ;
        if(maxmin>minmax)
        {
            for(int i = 0 ; i<size ; i=i+2)
            {
                player1 =  player1+ nums[i] ;
            }
            for(int i =1  ; i<size  ; i= i+2)
            {
                player2 = player2 + nums[i] ;
            }
        }
        else 
        {
            for(int j = size-1  ; j>=0 ;  j = j-2)
            {
                player1 = player1 + nums [j] ;
            }
            for(int j = size-2  ; j>=0  ; j= j-2)
            {
                player2= player2 +nums[j] ;
            }
        }
        if(player1>player2)
        {
            return true  ;
        }
        else 
        {
            return false  ;
        }
        
    }
}
// leetcode 2616
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size =  sc.nextInt() ;
        int array[]= new int[size] ;
        for(int i = 0 ; i<size  ; i++)
        {
            System.out.print("enter") ;
            array[i] = sc.nextInt() ;
        }
        Arrays.sort(array);
        int matrix[][] = new int[size][size] ;
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size ; j++)
            {
               int  diff = array[i] -array[j] ;
               matrix[i][j]  = diff  ;

            }
        }
        int min = matrix[0][0] ;
        for(int i = 0 ; i<size  ; i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j] ;

                }
            }
        }
        System.out.println("the smallest elemtn is "+min) ;
    }
}
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size =  sc.nextInt() ;
        int array[]= new int[size] ;
        for(int i = 0 ; i<size  ; i++)
        {
            System.out.print("enter") ;
            array[i] = sc.nextInt() ;
        }
        Arrays.sort(array);
        int matrix[][] = new int[size][size] ;
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size ; j++)
            {
               int  diff = array[i] -array[j] ;
               matrix[i][j]  = diff  ;

            }
        }
        int min = matrix[0][0] ;
        for(int i = 0 ; i<size  ; i++)
        {
            for(int j = 0 ; j<size ; j++)
            {
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j] ;

                }
            }
        }
        System.out.println("the smallest elemtn is "+min) ;
    }
}
// leetcode for first word occure twice 

class Solution {
    public char repeatedCharacter(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            chars[index]++;
            if (chars[index] == 2) return c;
        }
        return 'a';
    }
    
}
// leetcode 387 large stringn pe tle 

class Solution {
    public int firstUniqChar(String s) {
        char array[] = s.toCharArray()  ;
        int size  = array.length ; 
        int index[] = new int[size]  ;
        for(int i = 0 ; i<size ; i++)
        {
            index[i] = 1  ;
        }
        for(int i = 0 ; i<size  ; i++)
        {
            for(int j = i+1 ; j<size  ; j++)
            {
                if(array[i]==array[j])
                {
                    index[i]=0 ;
                    index[j]=0 ;

                }
            }

        }
        int nums = -1;
        for(int i = 0 ; i<size  ; i++)
        {
            if(index[i]!=0)
            {
                nums = i ;
                break ;
            }
        }
        return nums ;
       
    }
}
// leetcode 2367 

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int array[] = new int [size] ;
        for(int i = 0 ; i<size ;  i++)
        {
            System.out.print("enter the inputs") ;
               array[i]=  sc.nextInt() ;
        }
        Arrays.sort(array) ;
        System.out.println("enter the diff ") ;
        int diff = sc.nextInt() ;
        for(int i = 0 ; i<size  ; i++)
        {
            for(int j = i+1  ; j<size ;  j++)
            {
                for(int k= j+1  ; k<size  ; k++)
                {
                    if(i<j && j<k && array[j]-array[i]==diff && array[k]-array[j] == diff )
                    {
                        System.out.println(" "+array[i]);
                         System.out.println(" "+array[j]);
                          System.out.println(" "+array[k]);
                    }
               
                }
               


        }
        System.out.print("\n") ;
    }
}
}
// leetcode 825  erro in the count value 

class Solution {
    public int numFriendRequests(int[] ages) {
        int size = ages.length ;
        int count = 0 ;
        for (int i = 0 ; i <size  ; i++)
        {
            for(int j = i+1 ; j<size  ; j++)
            {
                if(i==j || ages[i]==ages[j] && ages[i]<100 || ages[j]<100)
                {
                  count ++  ;
                }
                else 
                {
                    continue  ;
                }
            }
        }
        return count ;
    }
}
// leetcode 387 <hashmap> used in this 

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        
        for(int i = 0; i < s.length(); i++)
            if(hm.get(s.charAt(i)) == 1) return i;
        
        return -1;
    }
}
// predcit the winner leetcode 

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1  = 0 ;
        int player2 = 0 ;
        int size  = nums.length ;
        int maxmin =  nums[0] ;
        int minmax = nums[size-1] ;
        if(maxmin>minmax)
        {
            for(int i = 0 ; i<size ; i=i+2)
            {
                player1 =  player1+ nums[i] ;
            }
            for(int i =1  ; i<size  ; i= i+2)
            {
                player2 = player2 + nums[i] ;
            }
        }
        else 
        {
            for(int j = size-1  ; j>=0 ;  j = j-2)
            {
                player1 = player1 + nums [j] ;
            }
            for(int j = size-2  ; j>=0  ; j= j-2)
            {
                player2= player2 +nums[j] ;
            }
        }
        if(player1>player2)
        {
            return true  ;
        }
        else 
        {
            return false  ;
        }
        
    }
}
// leetcode 2616 copied form the submission 

class Solution {
        public int minimizeMax(int[] nums, int p){
        Arrays.sort(nums);
        int n=nums.length,l=0,r=nums[n-1]-nums[0];
        while(l<r){
            int mid=(l+ r)/2,k=0;
            for(int i=1;i<n && k<p;i++){
                if(nums[i]-nums[i-1]<=mid){
                    k++;
                    i++;
                }
            }
            if(k>=p) r=mid;
            else l=mid + 1;
        }
        return l;
    }
}
// my actual code with 772/1548 passed for 2616

class Solution {
    public int minimizeMax(int[] nums, int p) {
        int size = nums.length  ;
        int index[] = new int[size] ;
        int min  = -1 ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i<size ;  i++)
        {
            for(int j = 0 ; j<size  ; j++)
            {
                if(min>nums[j]-nums[i])
                {
                    min   = nums[i]-nums[j];
                }
            }
            index[i] = min ; 
        }
        int max = 0;
        for(int i = 0 ; i<p  ; i++)
        {
            if(index[i]>max)
            {
                max = index[i] ;
            }
        }
        return max ;
    }
}
/ leetcode 2616 copied form the submission 

class Solution {
        public int minimizeMax(int[] nums, int p){
        Arrays.sort(nums);
        int n=nums.length,l=0,r=nums[n-1]-nums[0];
        while(l<r){
            int mid=(l+ r)/2,k=0;
            for(int i=1;i<n && k<p;i++){
                if(nums[i]-nums[i-1]<=mid){
                    k++;
                    i++;
                }
            }
            if(k>=p) r=mid;
            else l=mid + 1;
        }
        return l;
    }
}
// my actual code with 772/1548 passed for 2616

class Solution {
    public int minimizeMax(int[] nums, int p) {
        int size = nums.length  ;
        int index[] = new int[size] ;
        int min  = -1 ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i<size ;  i++)
        {
            for(int j = 0 ; j<size  ; j++)
            {
                if(min>nums[j]-nums[i])
                {
                    min   = nums[i]-nums[j];
                }
            }
            index[i] = min ; 
        }
        int max = 0;
        for(int i = 0 ; i<p  ; i++)
        {
            if(index[i]>max)
            {
                max = index[i] ;
            }
        }
        return max ;
    }
}
// leetcode house robber 198
class Solution {
    public int rob(int[] nums) {
        int size  = nums.length ;
        int oddsum = 0;
        int  sum =  0 ;
        int evensum  = 0 ;
        for(int i = 0 ; i<size ;  i= i+2)
        {
                sum  = sum + nums[i];
        }
        int sum2= 0;
        for(int j = 1 ; j<size  ; j = j+2)
        {
            sum2  = sum2+ nums[j] ;
        }
        int amd  = 0 ;
        if(sum>sum2)
        {
            amd = sum  ;

        }
        else if(sum2>sum)
        {
            amd = sum2 ;
        }
        else if(sum==sum2)
        {
            amd  = nums[0]+nums[size-1];                 
        }
        return amd ;
    }
}

// dynamic programming in the house robbery 
class Solution {
    public int rob(int[] nums) {
	    int last = nums[0];
        int lastx = 0;
        int size  = nums.length ;
        for(int i=1;i<size;i++){
            int pick = nums[i];
            if(i > 1) pick += lastx ;
            
            int nonpick = last;
            int cur = Math.max(pick,nonpick);
            lastx = last;
            last = cur;
        }
        return last;
    }
}
// leetcode 152 
class Solution {
    public int maxProduct(int[] nums) {
        int size  = nums.length  ;
        int array[]  = new int[size-1] ;
        int i = 0 ;
        int product = 1 ;
        while(i!=size-1)
        {
            int j  = i+1  ;
            product = 1 ;
            product =  nums[i]*nums[j] ;
            array[i]  = product ;
            i++ ;


        }
        Arrays.sort(array) ;
        return array[size-2] ;

    }
}

//leetcode reverse linked list 

class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode n=head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        head=prev;
        return head;
    }
}
