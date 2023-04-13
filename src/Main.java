public class Main {
    public static void main(String[] args) {
        Body body = new Body("BLACK","High");
        Father father = new Father("Alex",66,body,TypeOfHobby.BOX);
        System.out.println(father.getInfo());
        father.eyes();
        father.eyes("Black");
        System.out.println();

        Body body1 = new Body("Blue","168");
        Son son = new Son("Troy",25,body1,TypeOfHobby.WRESTLING, "Wrestling");
        System.out.println(son.getInfo());
        son.eyes();
        son.eyes("Brown");
        System.out.println();

        Body body2 = new Body("Brown","170");
        Son son1 = new Son("Max",17,body2,TypeOfHobby.FOOTBALL,"Football");
        System.out.println(son1.getInfo());
        son1.eyes();
        son1.eyes("Brown");
        System.out.println();

    }
}