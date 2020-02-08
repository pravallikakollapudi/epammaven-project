package com.demo.maven2;

import java.util.ArrayList;

public class Gifts {
	public static ArrayList<Integer> weight = new ArrayList<Integer>();
	public int getWeight(){
		int totalweight = 0;
		for(int i = 0;i<weight.size();i++){
			totalweight+=weight.get(i);
		}
		return totalweight;
	}

}
