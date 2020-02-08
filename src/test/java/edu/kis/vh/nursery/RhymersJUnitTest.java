package edu.kis.vh.nursery;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

@RunWith(Parameterized.class)
public class RhymersJUnitTest {

    @Parameter(1)
    public Class typeOfRhymer;
    @Parameter(0)
    public String nameOfClass;

    @Parameters( name = "{0}" )
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { DefaultCountingOutRhymer.class.getSimpleName(), DefaultCountingOutRhymer.class },
                { HanoiRhymer.class.getSimpleName(), HanoiRhymer.class },
                { FIFORhymer.class.getSimpleName() , FIFORhymer.class}
        };
        return Arrays.asList(data);
    }

    private DefaultCountingOutRhymer rhymer;

    private final int TEST_VALUE = 4;
    private final int EMPTY_STACK_VALUE = -1;
    final int STACK_CAPACITY = 12;

    @Before
    public void setUp() throws IllegalAccessException, InstantiationException {
        rhymer = (DefaultCountingOutRhymer)typeOfRhymer.newInstance();
    }

    @Test
    public void testCountIn() {
        rhymer.countIn(TEST_VALUE);
        assertEquals(TEST_VALUE, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        assertTrue(rhymer.callCheck());
        rhymer.countIn(888);
        assertFalse(rhymer.callCheck());
    }

    @Test
    public void testIsFull() {
        IntStream.range(0, STACK_CAPACITY).forEach(i -> {
            assertFalse(rhymer.isFull());
            rhymer.countIn(888);
        });
        assertTrue(rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

        rhymer.countIn(TEST_VALUE);

        assertEquals(TEST_VALUE, rhymer.peekaboo());
        assertEquals(TEST_VALUE, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

        rhymer.countIn(TEST_VALUE);

        assertEquals(TEST_VALUE, rhymer.countOut());
        assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

}
