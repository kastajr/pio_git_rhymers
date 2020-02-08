package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Class matches the factory design pattern
 * Creates instances of classes that are inheriting from DefaultCountingOutRhymer
 */
public class DefaultRhymersFactory implements RhymersFactory {
    /**
     * @return returns new instance of DefaultCountingOutRhymer class
     */
    // TODO implement Enum which describes types of Rhymers
    //  implement static method which takes Enum as argument and returns proper Rhymer
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return returns new instance of DefaultCountingOutRhymer class
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return returns new instance of FIFORhymer class
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * @return returns new instance of HanoiRhymer class
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
