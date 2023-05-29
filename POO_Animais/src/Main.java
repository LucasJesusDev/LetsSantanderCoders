public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Laka", "Cinza", 25, 5.5, 5, "nada");
        Cachorro cachorro2 = new Cachorro();

        cachorro1.latir();
        cachorro1.comer();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir !"));
    }
}