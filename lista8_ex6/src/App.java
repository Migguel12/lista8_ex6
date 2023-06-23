import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual canal deseja assistir: ");
        int canal = scanner.nextInt();
        System.out.println("");

        System.out.print("Defina o volume (max 30 e min 0): ");
        int volume = scanner.nextInt();
        System.out.println("");

        scanner.close();


        Tv tv1 = new Tv();
        tv1.alterarCanal(canal);
        tv1.alterarVolume(volume);

        System.out.printf("Canal: %d",tv1.mostrarCanal());
        System.out.println("");
        System.out.printf("Volume: %d",tv1.mostrarVolume());
    }
}
