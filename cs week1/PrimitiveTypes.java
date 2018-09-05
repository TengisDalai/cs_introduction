
/**
 * My first Primitive types.
 *
 * @author (Tengis)
 * @version (Tuesday)
 */
public class PrimitiveTypes
{
    int myNumber = 1;
    double MyDoubleNumber = 2.0;
    float MyFloatNumber = 3.4f;
    boolean isItTrueorFalse = false;
    char myChar = 'a';
    String myString = "Hello World";
    long myLongNumber = 12345;
    short myShortNumber = 123;
    
    public int addTwoNumbers (int a, int b)
    {
        return a + b;
    }
    
    public float addTwoFloatNumbers (float c, float d)
    {
        return c + d;
    }
    public String giveMeString (int x)
    {
        if (x > 100)
        {
            return "too High";
        }
        else if ( 50 <= x && x <= 100)
        {
            return "in Between";
        }
        else 
        {
            return "too Low";
        }
       
    }
    public int sumOfNumber (int x)
    {
        int sum = 0;
        for (int i = 1; i <= x; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public int sumOfNumberWithWhile (int x)
    {
        int sum = 0;
        int i = 1;
        while (i < x)
        {
            sum = sum + i;
            i= i + 1;
        }
        return sum;
  
    }
    private void printMyNameOut (String yourName)
    {
        System.out.println ("My Name is : " + yourName);
    }
    protected void anotherPrint (String name)
    {
        printMyNameOut(name);
    }
}
