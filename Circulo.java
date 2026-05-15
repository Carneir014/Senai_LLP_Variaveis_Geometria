public class Circulo{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Digite algo por favor, você não digitou nada!");
            return;
        }
        double raio, area;
        raio = Double.parseDouble(args[0]);
        area = Math.PI * (raio * raio);
        System.out.printf("A área do circulo é: %.2f", area);
    }
}