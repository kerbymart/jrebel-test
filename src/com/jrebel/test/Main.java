package com.jrebel.test;

/**
 * Created by cristianmiranda on 2/19/14.
 */
public class Main {

	public static void main(String[] vargs) throws Exception {
		int counter = 0;
		while(true){
			System.out.println(counter + " - Something very cool :D");
			Thread.sleep(1000);
			counter++;
		}
	}

}
