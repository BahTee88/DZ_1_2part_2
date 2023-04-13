public class Father  extends GrandFather {

    private String name;
    private int age;

    public Father(String name ,int age, Body body, TypeOfHobby typeOfHobby){
        this.age = age;
        this.name = name;
        super.setBody(body);
        super.setTypeOfHobby(typeOfHobby);
    }
    public String getInfo(){
        return "\nage: " + getAge() +
                "\nName: " + getName() +
                "\nEyes: " + getBody().getEyes()+
                "\nHeight: " + getBody().getHeight()+
                "\nTypeOfHobby: " + getTypeOfHobby();
    }
    public void eyes(){
        System.out.println("Blood type; B-positive");
    }
    public int eyes(String eyes){
        System.out.println("hair men: "+ eyes);
        return 0;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
