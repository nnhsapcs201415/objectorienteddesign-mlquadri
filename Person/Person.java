import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Supply a class Person that implements the Comparable interface. Compare persons
 * by their names. Ask the user to input ten names and generate ten Person objects.
 * Using the compareTo method, determine the first and last person among them and
 * print them.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;
    /**
     * Default constructor for objects of class Person
     */
    public Person(String fullName)
    {
        name=fullName;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(Object obj)
    {
        if(obj instanceof Person)
        {
            Person person = (Person) obj;
            return name.compareTo(person.getName());
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList name = new ArrayList<Person>();
        for(int count=0; count<10; count++)
        {
            System.out.print("Enter Name:");
            name.add(new Person(s.next()));
        }
        Collections.sort(name);
        System.out.println(name);
    }
}
