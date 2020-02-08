package com.demo.maven2;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App extends Gifts
{
    public static void main( String[] args )
    {
    	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter number of chocolates: ");
    	int no_of_chocolates = s.nextInt();
    	for(int i = 0 ;i<no_of_chocolates;i++){
    		System.out.println("Enter chocolate type 0/1: ");
    		int chocolate_type = s.nextInt();
    		System.out.println("Enter chocolate weight: ");
    		int chocolate_weight = s.nextInt();
    		System.out.println("Enter chocolate price: ");
    		int chocolate_price = s.nextInt();
    		String candyname = null;
    		if(chocolate_type == 1){
    			System.out.println("Enter candy name: ");
    			candyname = s.next();
    			tm.put(chocolate_weight, candyname);
    			weight.add(chocolate_weight);
    		}
    	}
    	Sweets s1 = new Sweets(10,20);
    	Sweets s2 = new Sweets(20,30);
    	Sweets s3 = new Sweets(30,40);
    	Gifts g = new Gifts();
    	System.out.println("Total Weight = "+g.getWeight());
    	System.out.println("Sorting Chocolates based on weight: ");
    	Chocolates ch = new Chocolates();
    	ch.sortChocolates(tm);
    	System.out.println("Enter lower and upper limits  : ");
    	int ll = s.nextInt();
    	int ul = s.nextInt();
    	ch.getChocolatesInRange(ll, ul, tm);
    }
}
