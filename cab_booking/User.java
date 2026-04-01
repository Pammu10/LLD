// User.java

public class User{
    private String name;
    private int age;
    private Gender gender;
    Location location;
    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public Gender getGender(){return gender;}

    public void setLocation(int x, int y){
        this.location = new Location(x, y)
    }
}

public enum Gender {
    M, F
}