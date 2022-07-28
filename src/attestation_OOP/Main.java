package attestation_OOP;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryFile("users.txt");
        List<User> users = usersRepository.findAll(); // Вывод всех из списка
        System.out.println("Вывод людей из списка");
        users.stream()
                .map(user -> user.getName() + " " + user.getAge() + " " + user.isWorker())
                .forEach(System.out::println);

        List<User> userAge = usersRepository.findByAge(33); // Вывод по возрасту
        System.out.println(" ");
        System.out.println("Вывод по возрасту");
        userAge.stream()
                .map(User::getName)
                .forEach(System.out::println);

        List<User> userIsWork = usersRepository.findByIsWorkerIsTrue(); // Проверка кто работает
        System.out.println(" ");
        System.out.println("Вывод кто работает");
        userIsWork.stream()
                .map(User::getName)
                .forEach(System.out::println);

        User user = usersRepository.findById(1); // Замена пользователя по индексу
        user.setName("Марсель");
        user.setAge(27);
        usersRepository.update(user);
    }
}