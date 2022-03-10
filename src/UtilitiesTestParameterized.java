import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utils;
    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }
    @org.junit.Before
    public void setup(){
        utils = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF","ABCDEF"},
                {"ABBBEF", "ABEF"},
                {"A","A"},
                {"1222233344667","123467"},
                {null,null},
                {"",""}
        });
    }
    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals(output,utils.removePairs(input));
    }
}
