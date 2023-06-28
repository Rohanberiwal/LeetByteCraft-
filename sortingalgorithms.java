//SELECTION SORT ALGORITHM 
import java.util.*;
class Main 
{
  static void selectionsort(int array[] , int size )
  {
    System.out.print("\n");
    for(int i = 0 ; i<size ; i++)
      {
        for(int j = i+1 ;j<size ;j++)
          {
            if(array[i]>array[j])
            {
              int temp = array[i] ;
              array[i] = array[j] ;
              array[j] = temp ;
            }
          }
      }
    System.out.print("\n");
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
       
          
      }
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int array[] = new int [size] ;
    for(int i = 0 ; i<size ; i++)
      {
        System.out.print("enter input ");
        array[i]= sc.nextInt() ;
          
      }
     for(int i = 0 ; i<size ; i++)
      {
        System.out.print("->"+array[i]);
       
          
      }
    selectionsort(array , size);
  }
}

// MERGE SORT ALGORITHM 
/// not able to find the left out elemets 

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in) ;
    int size = sc.nextInt() ;
    int arr_1[] = new int [size];
    int arr_2[] = new int [size] ;
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("enter input for arr1 : ");
        arr_1[i] = sc.nextInt() ;
        System.out.print("enter input for arr2 : ");
        arr_2[i] = sc.nextInt() ; 
      }
    int array_vac[] = new int [2*size] ;
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("-> "+arr_1[i]);
      }
    System.out.print("\n");
    for(int i= 0 ;  i<size ; i++)
      {
        System.out.print("-> "+arr_2[i]);
      }
    for(int i = 0 ;i<size ;i++)
      {
        for(int j = 0 ; j<size  ; j++)
          {
            while(i!=size || j!=size)
           { if(arr_1[i]>arr_2[j])
            {
              array_vac[j] = arr_2[j] ;
              //j++;
              
            }
            else if(arr_1[i]<arr_2[j])
            {
              array_vac[j] = arr_1[i];
              i++ ;
            }
            else if(arr_1[i]==arr_2[j])
            {
              array_vac[j] = arr_1[i] ;
            }
          }
            if(i==size)
            {
              array_vac[i]=arr_2[j];
              i++ ;
            }
            else if(j==size)
            {
              array_vac[i] = arr_1[j];
              i++ ;
            }
          }
      }
      for(int i = 0 ;i<2*size ;i++)
      {
        
        System.out.print("\n->"+array_vac[i]);
      }
  }
}