import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));
        //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Date birthdayDate;
        Person person;
        switch (args[0]) {
            case "-с":
                birthdayDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], birthdayDate);
                } else {
                    person = Person.createFemale(args[1], birthdayDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case"-r" :
                int a = Integer.parseInt(args[0]);
                person = allPeople.get(a);
                System.out.println(person.getName() + " " + person.getSex() + " " + person.getBirthDate());


            }

    }
    public static void maleOrFemale(String sex, String name, String date ) {
        if(sex.equals("м")) {
            Person person = Person.createMale(name,new Date(date) );
            allPeople.add(person);
        } else {
            Person person = Person.createFemale(name, new Date(date));
            allPeople.add(person);
        }
    }
}
