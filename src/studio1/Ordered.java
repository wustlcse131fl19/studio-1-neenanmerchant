package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean isOrdered;
		isOrdered = x<y && y<z || z<y && y<x;
		System.out.println(isOrdered);

		//int x = 5;
		//int y = 2 + 4;
		//boolean hi = x < 5;

	}

}
