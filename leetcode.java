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
