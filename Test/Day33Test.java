import org.junit.Test;
import sample.Day33Runner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by RdDvls on 9/22/16.
 */
public class Day33Test {


        Day33Runner myDay33Runner = new Day33Runner();

        @org.junit.Before
        public void setUp() throws Exception {

        }

        @org.junit.After
        public void tearDown() throws Exception {

        }


        @Test
        public void noClose() throws Exception {
            assertFalse(myDay33Runner.closeFar(1, 3, 5));
        }

        @Test
        public void allCloseNoFar() throws Exception {
            assertFalse(myDay33Runner.closeFar(1, 2, 3));
        }

        @Test
        public void aCloseBFarC() throws Exception {
            assertTrue(myDay33Runner.closeFar(4, 5, 10));
        }

        @Test
        public void aFarBCloseC() throws Exception {
            assertTrue(myDay33Runner.closeFar(3, 7, 2));
        }

        @Test
        public void aSameBfarC() throws Exception {
            assertTrue(myDay33Runner.closeFar(3, 3, 6));
        }


        @Test
        public void luckySumA13() throws Exception {
            assertEquals(0, myDay33Runner.luckySum(13, 1, 1));
        }

        @Test
        public void luckySumAokB13() throws Exception {
            assertEquals(7, myDay33Runner.luckySum(7, 13, 2));
        }

        @Test
        public void luckySumAokBokC13() throws Exception {
            assertEquals(20, myDay33Runner.luckySum(15, 5, 13));
        }

        @Test
        public void luckySumAokBokCok() throws Exception {
            assertEquals(14, myDay33Runner.luckySum(7, 3, 4));
        }

}

