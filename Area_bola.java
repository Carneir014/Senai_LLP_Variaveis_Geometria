public class Area_bola {
    public static void main (String [] args){
        if (args.length  == 0){
            System.out.println("Digte alguma coisa amigão por que você não digitou nada");
        }else{
            double raio, area_bola;
            raio = Double.parseDouble(args[0]);
            area_bola = 4 * Math.PI * (raio * raio);
            System.out.printf("A área da bola é: %.2f", area_bola);
        }
    }
}