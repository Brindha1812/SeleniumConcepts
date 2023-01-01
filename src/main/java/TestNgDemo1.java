import org.testng.annotations.Test;

public class TestNgDemo1
{
    @Test( description = " Practice for TestNg Demo 1",  priority = 1 , groups = { "firstGen" }  )
    public void myFamily()
    {
        System.out.println("Grandpa Thangadurai , Grandma Packialakshmi ");
    }

}
