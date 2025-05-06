import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Person {
    private String name;
    private Date dob;

    // Constructor
    public Person(String name, String dobString) {
        this.name = name;
        try {
            this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dobString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Use DD-MM-YYYY.");
        }
    }

    // Method to display name
    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    // Method to display age
    public void displayAge() {
        if (dob == null) {
            System.out.println("Date of Birth not set correctly.");
            return;
        }
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);
        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dobCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("Age: " + age);
    }
}