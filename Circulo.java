public class Circulo{
    public static void main(String[] args) {
        double raio, area;
        raio = Double.parseDouble(args[0]);
        if(args.length == 0){
            System.out.println("Digite algo por favor, você não digitou nada!");
            return;
        }
        
        area = Math.PI * (raio * raio);
        System.out.printf("A área do circulo é: %.2f", area);
    }
}