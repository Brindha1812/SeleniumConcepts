import org.testng.annotations.Test;


public class TestNgDemo3 extends TestNgDemo1 implements TestNgDemo2
{
    @Test( description = " Practice for TestNg Demo 3 Method " , groups = { " secondGen" }  )
    public void bharath()
    {
        System.out.println("Father Bharath");
    }
    @Test( description = " TestNg Demo 3 Method" , priority = 2 ,
            groups = { "secondGen" } /* ,dependsOnMethods = { " myFamily " }*/ )
    public void brindha()
    {
        System.out.println(" Mother Brindha");
    }

    @Test( description = " TestNg 3 Demo Method ",
            dependsOnMethods = { "bharath" , "brindha" } , groups = { "thirdGen" } , invocationCount = 3 )
    public void theaAathini()
    {
        System.out.println(" Baby Princess Thea Aathini ");
    }
}
