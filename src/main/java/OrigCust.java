package src.main.java;

import java.util.*;

public class OrigCust
{
    private String name;
    private int age;
    private String area;
    public void setName( String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setArea( String area)
    {
        this.area = area;
    }
    public String getArea()
    {
        return area;
    }
    public static void main(String[] args)
    {
        OrigCust cust = new OrigCust();
        cust.setName("Thea");
        cust.setAge(16);
        cust.setArea("Toronto");
        System.out.println(cust.getName());
        System.out.println(cust.getAge());
        System.out.println(cust.getArea());
    }
}
