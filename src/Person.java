public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String f, String l, int a){
        firstName = f;
        lastName = l;
        age = a;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String f){
        firstName = f;
    }

    public void setLastName(String l){
        lastName = l;
    }

    public void setAge(int a){
        age = a;
    }

    public String toString(){
        return firstName + lastName + ", age " + age;
    }
}
