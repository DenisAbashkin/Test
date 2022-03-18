import java.util.ArrayList;

public class ArrayListUsers {
    public static void main(String[] args) {
        ArrayList<ArrayListUsers.User> list = new ArrayList<ArrayListUsers.User>();
        list.add(new ArrayListUsers.User("Абашкин", "Денис", 23));
        list.add(new ArrayListUsers.User("Иванов", "Дмитрий", 25));
        list.add(new ArrayListUsers.User("Аитова", "Алина", 26));

        //list.forEach(System.out::println);
        list.stream().forEach(user -> System.out.println(user.SecondName +" " +user.Name+ " "+ user.age));
    }


    public static class User{
        private String SecondName;
        private String Name;
        private int age;

        private User(String SecondName, String Name, int age){
            this.SecondName = SecondName;
            this.Name = Name;
            this.age = age;
        }
    }
}
