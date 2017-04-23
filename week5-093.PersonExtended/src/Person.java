import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
        
    }
    
    public Person(String name){
        this.name = name;
        
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int day = Calendar.getInstance().get(Calendar.DATE);
        
        this.birthday = new MyDate(day,month,year);
    }
    
    
    public int age() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int day = Calendar.getInstance().get(Calendar.DATE);
        
        MyDate today = new MyDate(day,month,year);
        
        
        return (birthday.differenceInYears(today));
    }
    
    public boolean olderThan(Person compared) {
        
        return this.birthday.earlier(compared.birthday);
        
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
