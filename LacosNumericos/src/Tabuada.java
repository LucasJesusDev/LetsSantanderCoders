public class Tabuada {
    public static void main(String[] args) {

        //Variaável que inicia em 1 e vai até 10, um por um
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " X " +j + " = "+ j * i);
            }
            System.out.println(" ");
        }
    }
}