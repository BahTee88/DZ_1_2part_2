final public class Son extends Father{

    private String sport;

    public Son(String name, int age, Body body, TypeOfHobby typeOfHobby, String sport) {
        super(name, age, body, typeOfHobby);
        this.sport = sport;
    }
    public String getInfo(){
        return "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nEyes: " + getBody().getEyes()+
                "\nHeight: " + getBody().getHeight()+
                "\nTypeOfHobby: " + getTypeOfHobby()+
                "\nSport: " + sport;
    }
}
