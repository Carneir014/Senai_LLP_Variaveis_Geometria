public class Area_Tubo {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Por favor digite o número de argumentos necessário!");
            return;
        }else{
            double raio, altura, area_lateral, area_bases, area_total;
            raio = Double.parseDouble(args[0]);
            altura = Double.parseDouble(args[1]);
            area_lateral = 2 * Math.PI * raio * altura;
            area_bases = 2 * Math.PI * (raio * raio);
            area_total = 2 * Math.PI * raio * (altura + raio);
            System.out.printf("A área lateral do tubo é: %.2f\n", area_lateral);
            System.out.printf("A área das base do tubo é: %.2f\n", area_bases);
            System.out.printf("A área total do tubo é: %.2f\n", area_total);

        }
    }
}
