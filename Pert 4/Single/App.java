public class App {
    public static void main(String[] args){
        // implementasi single inheritance
        Mobil m1 = new Mobil("Hino");
        Sedan vios = new Sedan("Vios");

        m1.klakson();
        vios.klakson();
    }
}
