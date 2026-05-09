import java.util.Scanner;
public class Retangulo{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double base, altura, area;

        System.out.println("Digite a base do retângulo: ");
        base = ler.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = ler.nextDouble();
        
        area = base * altura;
        System.out.printf("A área desse retângulo é: %.2f", area);

    }
}