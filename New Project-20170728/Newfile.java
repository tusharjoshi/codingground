

public class Person {

    private String name;
    private int age;
    
}

  List<Person> personList
  Create a list of all ages of Person
  
  List<Integer> intList = new ArrayList<>();
  for( Person p : personList ) {
     intList.add( p.getAge());
  }
  
  List<Integer> myIntList = personList
       .stream()
       .map(p -> p.getAge() )
       .collect();
       
// Avegare

int avegage;
int sum = 0;
List<Integer> intList = new ArrayList<>();
  for( Person p : personList ) {
     sum += p.getAge();
  }
  average = sum / personList.size();
  
  int avg = personList
       .stream()
       .filter(p -> p.getAge() > 29 )
       .map(p -> p.getAge() )
       .average();
