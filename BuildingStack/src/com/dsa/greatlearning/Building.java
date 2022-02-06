package com.dsa.greatlearning;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Building {
	public static void checkFloorStatus(int floor[],int noOfFloor) {
		
		System.out.println("The order of construction is as follows");
		
		
		Stack<Integer> stack = new Stack<Integer>();

		int[] tempArray = new int[noOfFloor];

		int max = noOfFloor;

		System.out.println();
		for (int i = 0; i < noOfFloor; i++) {

			System.out.println("Day: "+(i+1));
			
			
			tempArray[i] = floor[i];

			stack.add(tempArray[i]);


			while (!stack.isEmpty() && stack.peek() == max) {

				System.out.print(stack.pop() + " ");

				max--;

			}

			System.out.println();

		}

	  }
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int totalFloors = sc.nextInt();
		int[] floors = new int[totalFloors];
		for(int i=0; i<totalFloors; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		} 
		checkFloorStatus(floors, totalFloors);
	}
}
