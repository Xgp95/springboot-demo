package springbootdemo.bean;

/**
 * @author: Xugp
 * @date: 2022/5/16 15:32
 * @description:
 */
public class User {
    private String userName;
    private Integer age;
    private Pet pet;

    public User() {
    }

    public User(String userName, Integer age, Pet pet) {
        this.userName = userName;
        this.age = age;
        this.pet = pet;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
