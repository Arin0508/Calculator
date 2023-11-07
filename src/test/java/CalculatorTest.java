import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest 
{
    private Main calculator;

    @Before
    public void setup()
    { 
        calculator = new Main(); 
    }

    @Test
    public void testAdd_pos()
    {
        double a = 2, b = 2;
        double expec_res = 4;
        double res = calculator.Addition(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void testAdd_neg()
    {
        double a = 2, b = 2;
        double expec_res = 0;
        double res = calculator.Addition(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void testSub_pos()
    {
        double a = 3, b = 1;
        double expec_res = 2;
        double res = calculator.Subtraction(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void testSub_neg()
    {
        double a = 2, b = 2;
        double expec_res = 2;
        double res = calculator.Subtraction(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void testMult_pos()
    {
        double a = 2, b = 4;
        double expec_res = 8;
        double res = calculator.Multiplication(a, b);
        Assert.assertEquals(expec_res, res, 0.000001);
    }

    @Test
    public void testMult_neg() 
    {
        double a = 2, b = 4;
        double expec_res = 3;
        double res = calculator.Multiplication(a, b);
        Assert.assertNotEquals(expec_res, res);
    }

    @Test
    public void testDiv_pos() 
    {
        double a = 4, b = 4;
        double expec_res = 1;
        double res = calculator.Division(a, b);
        Assert.assertEquals(res, expec_res, 0.000001);
    }

    @Test
    public void testDiv_neg()
    {
        double a = 3, b = 2;
        double expec_res = 0;
        double res = calculator.Division(a, b);
        Assert.assertNotEquals(res, expec_res);
    }
}