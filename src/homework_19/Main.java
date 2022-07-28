package homework_19;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryFile("users.txt");
        List<User> users = usersRepository.findAll();
        System.out.println("Вывод людей из списка");
        users.stream()
                .map(user -> user.getName() + " " + user.getAge() + " " + user.isWorker())
                .forEach(System.out::println);

        List<User> userAge = usersRepository.findByAge(26); // Вывод по возрасту
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
    }
}