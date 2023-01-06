1.
package com.xwork.textapp;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

         public static int getSecondLargest(int[]a,int total) {
				Arrays.sort(a);
				return a[total-2];
			}
			public static void main(String args[]) {
				int a[]= {1,2,5,6,3,2};
				int b[]= {44,66,99,77,33,22,55};
				System.out.println("Scond largest:"+getSecondLargest(a,6));
				System.out.println("Scond largest:"+getSecondLargest(b,7));
			}
}

=========================================================================================
2.
package com.xwork.taskapp;

import java.util.Scanner;


         public class EvenPetals {
	
            public static void main(String arg[]) {
			int x;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter an inter");
			x=sc.nextInt();
			if(x%10==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}

	


}
================================================================================
3.Genaralized is a class and parent class
  Specized class is a child class

=================================================================================
4.a)    Not use extends Keyword my class not inherted by the any other class
  b) class   Name{
	  private String name;
	  
 c)Delegation is alternative inhertaince
==================================================================================
5. Sorted Collection is the used in hava ad
CompareTo
  Comparetor 
 ===============================================================================
6.Arraylist
1.Its intranal use arry
2.Its  faster in read opration
3.Its  Slower in write opration

  linked list 
 1.Its is intranal use in nodeslist
2.Its faster in write opration
3.its  slower than read opration
================================================================================
7.ListItetor
1.Its a nodes will be forword
2.It is a add methods

Itetore
1.Its is used in forwprd and backword nodes
2.It is a use in all methods

================================================================================
8.Covariant method in overriding in java
It is child and return type is vary

================================================================================
9.memory leakages in java
Heap is object created in a memory



===============================================================================
10.Static polymerphim


*complie time polymerphim
*It is the overload in static and non static
*It is same name and differnt parameter is used


Dynamic polymerphim
*It is the Run time polymerphim
*It is overriide in static only
*it is parent class has same method in child class

================================================================================
11.Encapsulation
================================================================================