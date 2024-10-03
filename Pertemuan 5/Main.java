public class Main {
    public static void main(String[] args) throws Exception {
        Spider laba2Imut = new Spider();
        laba2Imut.eat();

        Dog Hero = new Dog();
        Hero.setName("Hero");
        System.out.println("Saya adalah " + Hero.getName());
        Hero.play();
        Hero.eat();
        Hero.walk();

        Cat Emeng = new Cat("Emeng");
        System.out.println("Saya adalah " + Emeng.getName());
        Emeng.play();
        Emeng.eat();
        Emeng.walk();
    }
}