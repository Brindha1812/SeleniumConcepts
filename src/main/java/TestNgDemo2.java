import org.testng.annotations.Test;

public interface TestNgDemo2
{
    @Test( description = " TestNg Demo 2 Method" , priority = 2 ,  groups = { "firstGen " } )
    public default void mjFamily()
    {
        System.out.println(" Grandpa Marimuthu , Grandma Jeyanthi  ");
    }
}
