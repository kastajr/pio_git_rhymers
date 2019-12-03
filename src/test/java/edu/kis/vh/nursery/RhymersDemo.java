package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static final int I = 1;
	public static final int INT = 15;
	public static final int J = 0;
	public static final int INT1 = 3;
	public static final int I1 = 1;
	public static final int INT2 = 15;
	public static final int INT3 = 3;
	public static final int INT4 = 20;
	public static final int I2 = 0;
	public static final int INT5 = 3;

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
		
		for (int i = I; i < INT; i++)
			for (int j = J; j < INT1; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = I1; i < INT2; i++)
			rhymers[INT3].countIn(rn.nextInt(INT4));
		
		for (int i = I2; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[INT5]).reportRejected());
		
	}
	
}