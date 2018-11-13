package tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() {

        Person p = new Person("Mike", 31, 178, 77, "Brown", "MALE");
        Logger l = Logger.getLogger(Person.class.getName());

        l.info("Name: " + p.getName());
        l.info("Age: " + p.getAge());
        l.info("Height (cm): "+ p.getHeight());
        l.info("Weight (kg): " + p.getWeight());
        l.info("Eye Color: " + p.getEyeColor());
        l.info("Gender: " + p.getGender());

        assertEquals("Mike", p.getName());
        assertEquals(31, p.getAge());
        assertEquals(178, p.getHeight());
        assertEquals(77, p.getWeight());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("MALE", p.getGender());
    }


}