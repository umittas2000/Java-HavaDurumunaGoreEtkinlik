import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik;

        System.out.println("|---------------------------------------|");
        System.out.println("| HAVA SICAKLIGINA GORE ETKINLIK ONER   |");
        System.out.println("|---------------------------------------|");
        System.out.print("Hava sicakligi kac derece?:");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Hava Cok soguk!");
        }else if(sicaklik<15){
            System.out.println("Hava biraz soguk...");
        }else if(sicaklik<25){
            System.out.println("Hava guzel!");
        }else{
            System.out.println("Hava sicak...");
        }

        if(sicaklik<5){
            System.out.println("Kayak yapmayi deneyebilirsin.");
        }else if(sicaklik<=25){
            if(sicaklik>= 10 && sicaklik<=25)
                System.out.println("Sinema daha iyi olabilir.");

            if(sicaklik>=5 && sicaklik<=25)
                System.out.println("Piknige de gidebilirsin.");

        }else{
            System.out.println("Yuzmeye ne dersin?");
        }
    }
}
