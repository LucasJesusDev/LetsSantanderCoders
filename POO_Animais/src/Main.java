public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Laka", "Cinza", 25, 5.5, 5, "nada");

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Nuttela", "Cinza", 25, 5.5, 5, "nada");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

    }
}