import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Получить коллекцию пользователей и вывести на экран столбиком

        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("Абашкин", "Денис", 23));
        list.add(new User("Иванов", "Дмитрий", 25));
        list.add(new User("Аитова", "Алина", 26));

        list.forEach(System.out::println);
    }


    public static class User{
        public String SecondName;
        public String Name;
        public int age;

        public User(String SecondName, String Name, int age){
            this.SecondName = SecondName;
            this.Name = Name;
            this.age = age;
        }
    }
}
