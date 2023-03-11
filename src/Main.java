import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = scan.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc <= 18.5) {
            System.out.println("Magreza");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("NORMAL ");
        } else if (imc > 25 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc > 30 && imc <= 39.9) {
            System.out.println("OBESIDADE");
        } else {
            System.out.println("OBESIDADE GRAVE");
        }
    }
}