import java.util.Scanner;

public class A1 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        String nome = leia.nextLine();

        System.out.println("Informe o seu peso atual em KG(Quilos): ");
        float peso = leia.nextFloat();

        System.out.println("Informe a quantidade de água ingeria até o presente momento em Litros(l): ");
        float aguaingerida = leia.nextFloat();

        leia.close();
        double aguaideal = (peso * 0.035);

        double aguaingerir = (aguaideal - aguaingerida);

        if (aguaingerir < 0) {
            System.out.printf(
                    "O(A) funcionário(a) [%s], de peso [%.2f], já bebeu [%.2f] de água, a quantidade ideal para ele(a) é de [%.2f] e tá de parabéns pois já atingiu a meta diária de hidratação.",
                    nome, peso, aguaingerida, aguaideal);
        } else {
            System.out.printf(
                    "O(A) funcionário(a) [%s], de peso [%.2f] , já bebeu [%.2f] de água e ainda deve continuar focado(a) para concluir a meta [%.2f] diária de hidratação.",
                    nome, peso, aguaingerida, aguaideal);
        }

    }

}
