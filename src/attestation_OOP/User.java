package attestation_OOP;
public class User {
    public int id;
    public String name;
    public int age;
    public boolean isWorker;

    public User(int id, String name, int age, boolean isWorker) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isWorker = isWorker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isWorker=" + isWorker +
                '}';
    }
}