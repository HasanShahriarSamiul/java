import java.lang.*;
public class Person
{
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("Empty Person");
	}
	public Person(String name, int age)
	{
		System.out.println("Parameterized Person");
		//this.name = name;
		//this.age = age;
		setName(name);
		setAge(age);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Inavlid value for age!");
		}
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	static
	{
		System.out.println("Today is a good day!");
	}
}