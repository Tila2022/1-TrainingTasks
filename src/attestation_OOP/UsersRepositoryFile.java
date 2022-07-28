package attestation_OOP;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFile implements UsersRepository {
    private final String fileName;

    public UsersRepositoryFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        //объявили переменные для доступа
        try (Reader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            // создали читалку на основе файла
            // создали буферизированную читалку,
            // прочитали строку
            String line = bufferedReader.readLine();
            // пока к нам не пришла пустая строка
            while (line != null) {
                //Разбираем ее по |
                String[] parts = line.split("\\|");
                // берем имя
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                // берем возраст
                int age = Integer.parseInt(parts[2]);
                // берем статус о работе
                boolean isWorker = Boolean.parseBoolean(parts[3]);
                //создаем нового работника
                User newUser = new User(id, name, age, isWorker);
                // добавляем его в массив
                users.add(newUser);
                // считываем новую строку
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        // этот блок выполняется точное
        // пытаемся закрыть ресурсы
        return users;
    }

    @Override
    public void save(User user) {
        try (Writer writer = new FileWriter(fileName, true); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            bufferedWriter.write(user.getName() + "|" + user.getAge() + "|" + user.isWorker());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<User> findByAge(int age) {
        List<User> users = new ArrayList<>();
        try (Reader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String userName = parts[1];
                int userAge = Integer.parseInt(parts[2]);
                boolean userIsWork = Boolean.parseBoolean(parts[3]);
                if (age == userAge) {
                    User user = new User(id, userName, userAge, userIsWork);
                    users.add(user);
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        // этот блок выполняется точное
        // пытаемся закрыть ресурсы
        return users;
    }

    @Override
    public List<User> findByIsWorkerIsTrue() {
        List<User> users = new ArrayList<>();
        try (Reader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String userName = parts[1];
                int userAge = Integer.parseInt(parts[2]);
                boolean userIsWork = Boolean.parseBoolean(parts[3]);
                if (userIsWork) {
                    User user = new User(id, userName, userAge, true);
                    users.add(user);
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        // этот блок выполняется точное
        // пытаемся закрыть ресурсы
        return users;
    }

    @Override
    public User findById(int id) {

        Reader reader = null;
        BufferedReader bufferedReader = null;
        User user = null;
        try {
            reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                int idUser = Integer.parseInt(parts[0]);
                String userName = parts[1];
                int userAge = Integer.parseInt(parts[2]);
                boolean userIsWork = Boolean.parseBoolean(parts[3]);
                if (id == idUser) {
                    user = new User(idUser, userName, userAge, userIsWork);
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            // этот блок выполняется точное
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignore) {
                }
            }
            if (bufferedReader != null) {
                try {
                    // пытаемся закрыть ресурсы
                    bufferedReader.close();
                } catch (IOException ignore) {
                }
            }
        }
        return user;
    }

    @Override
    public void update(User upUser) {
        List<User> oldUsers = findAll();
        oldUsers.remove(upUser.getId() - 1);
        oldUsers.add(upUser.getId() - 1, upUser);
        try (Writer writer = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (User oldUser : oldUsers) {
                bufferedWriter.write(oldUser.getId() + "|" + oldUser.getName() + "|" + oldUser.getAge() + "|" + oldUser.isWorker());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}