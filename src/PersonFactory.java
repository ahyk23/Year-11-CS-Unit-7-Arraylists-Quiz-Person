import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        for (int i = 0; i < allPersons.size(); i++) {
            if (person.getLastName().compareTo(allPersons.get(i).getLastName()) <= 0) {
                allPersons.add(i, person);
            }
        }
        if (person.getLastName().compareTo(allPersons.get(allPersons.size()-1).getLastName()) > 0){
            allPersons.add(person);
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> minors = new ArrayList<>();
        for (int i = 0; i < allPersons.size(); i++){
            if (allPersons.get(i).getAge() < 18){
                minors.add(allPersons.get(i));
            }
        }
        return minors;
    }

    public boolean checkLastName(String lastName) {
        for (int i = 0; i < allPersons.size(); i++){
            if (lastName.equals(allPersons.get(i).getLastName())){
                return true;
            }
        }
        return false;
    }
}
