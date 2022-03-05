import com.example.addressBook.proto.Person;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");

        Person person = Person.newBuilder().
                setId(123).
                setEmail("double12gzh@gmail.com").
                addPhones(
                        Person.PhoneNumber.newBuilder().
                                setNumber("1234").
                                setType(Person.PhoneType.HOME)
                ).
                build();
    }
}