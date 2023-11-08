package at.ac.htl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void when_getSum_then_result_is_385() 
    {
        var app = new App();
        assertEquals(385, app.getSum());
    }

}
