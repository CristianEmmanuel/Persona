import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*  Medico medico = new Medico("Luis", 29, "M" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor decime tu altura :");
        float altura = scanner.nextFloat();
        System.out.println("Por favor decime tu peso :");
        float peso = scanner.nextFloat();
        System.out.println("Por favor decime tu sexo :");
        String sexo = scanner.next();

        float imc = medico.calcularIMC(altura,peso);
        System.out.println(imc);
        */

    Medico m = new Medico("manuela", 29, "f");

    Paciente p = new Paciente("Cris",86, (float) 1.87);

    float IMCP=m.calcularIMC(p);
        System.out.println(IMCP);


    }
}
