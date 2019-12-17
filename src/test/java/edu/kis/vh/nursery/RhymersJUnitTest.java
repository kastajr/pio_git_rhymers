package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	final public static final int TEST_VALUE = 4;
	final public static final int INT = 888;
	final public static final int STACK_CAPACITY = 12;
	final public static final int I = 0;
	final public static final int INT1 = 888;
	final public static final int EMPTY_STACK_VALUE = -1;
	final public static final int TEST_VALUE1 = 4;
	final public static final int EMPTY_STACK_VALUE1 = -1;
	final public static final int TEST_VALUE2 = 4;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final publicint testValue = TEST_VALUE;
		rhymer.countIn(testValue);

		final publicint result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(INT);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = RhymersJUnitTest.STACK_CAPACITY;
		for (int i = I; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(INT1);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int emptyStackValue = RhymersJUnitTest.EMPTY_STACK_VALUE;

		int result = rhymer.peekaboo();
		Assert.assertEquals(emptyStackValue, result);

		final publicint testValue = TEST_VALUE1;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int emptyStackValue1 = EMPTY_STACK_VALUE1;

		int result = rhymer.countOut();
		Assert.assertEquals(emptyStackValue1, result);

		final publicint testValue = TEST_VALUE2;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(emptyStackValue1, result);
	}

}
