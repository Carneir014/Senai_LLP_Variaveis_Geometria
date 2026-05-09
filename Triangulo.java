import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double altura, base, area;

        System.out.println("Digite a base do triângulo: ");
        base = ler.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        altura = ler.nextDouble();

        area = (base * altura) / 2;
        System.out.printf("A area do triângulo é: %.2f", area);
    }

}