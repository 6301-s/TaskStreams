import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}

public class FreeStream {
    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
                new Person("Ram", 10),
                new Person("Sam", 30),
                new Person("Don", 20),
                new Person("Bob", 25)
        );

        long count=people.stream().count();
        System.out.println(count);
        
        System.out.println("Limit method");
        people.stream().limit(2).forEach(System.out::println);
                
        List<Person> olderThan20 = people.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println("People older than 20: " + olderThan20);
        
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names of people: " + names);
        
         
              
    }
}
