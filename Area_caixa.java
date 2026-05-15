public class Area_caixa {
    public static void main(String[] args) {
        if (args.length < 3){
            System.out.println("Por favor digite o número de argumentos necessário!");
            return;
        }else{
            double comprimento, largura, altura, area;
            comprimento = Double.parseDouble(args[0]);
            largura = Double.parseDouble(args[1]);
            altura = Double.parseDouble(args[2]);
            area = 2 * ((comprimento * largura) + (comprimento * altura) + (altura * largura));
            System.out.printf("A área da caixa é: %.2f", area);
        }
    }
}
