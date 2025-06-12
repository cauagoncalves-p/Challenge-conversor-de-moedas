import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean c = true;

        while (c) {
            System.out.println("Bem-vindo ao conversor de moedas!");
            System.out.println();
            System.out.println("1) Dólar Americano → Real Brasileiro");
            System.out.println("2) Euro → Dólar Americano");
            System.out.println("3) Libra Esterlina → Iene Japonês");
            System.out.println("4) Iene Japonês → Real Brasileiro");
            System.out.println("5) Dólar Australiano → Euro");
            System.out.println("6) Dólar Canadense → Peso Argentino");
            System.out.println("7) Sair");
            System.out.println();

            System.out.print("Escolha uma opção válida: ");
            int escolha = scanner.nextInt();

            if (escolha == 7) {
                break;
            }

            System.out.print("Qual o valor da conversão?: ");
            double valor = scanner.nextDouble();

            String base = "";
            String target = "";

            switch (escolha) {
                case 1:
                    base = "USD";
                    target = "BRL";
                    break;
                case 2:
                    base = "EUR";
                    target = "USD";
                    break;
                case 3:
                    base = "GBP";
                    target = "JPY";
                    break;
                case 4:
                    base = "JPY";
                    target = "BRL";
                    break;
                case 5:
                    base = "AUD";
                    target = "EUR";
                    break;
                case 6:
                    base = "CAD";
                    target = "ARS";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }
            ApiConverteValor conver = new ApiConverteValor();
            try{
                System.out.println(conver.convertMoeda(base,target, valor).toString());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}