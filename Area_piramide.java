public class Area_piramide {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Por favor digite o número de argumentos necessário!");
            return;
        }else{
            double lado, apotema, base, perimetro, total, area_lateral;
            lado = Double.parseDouble(args[0]);
            apotema = Double.parseDouble(args[1]);
            base = lado * lado;
            perimetro = 4 * lado;
            area_lateral = (perimetro * apotema)/2;
            total = base + area_lateral;
            System.out.printf("A área total da pirâmide é: %.2f", total);
        }
    }
}
