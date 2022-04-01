public class Calculadora {
    public static void main(String[] args) {
        //1- Soma
        //2- Subtração
        //3- Multiplicação
        //4- Divisão
        //5- Sair
        String menu = "1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair";
        int opcao;
        do{
            //pegar a opção do usuário
            System.out.println(menu);
            opcao = leitor.nextInt();
            //capturar os operandos a e b
            int a, b;
            //perguntar para o usuário quem são os operandos
            switch (opcao){
                case 1:
                    //soma
                    break;
                case 2:
                    //subtração
                    break;
                
                default:
                    System.out.println("Opção inválida");
            }

        }while(); //opção deve ser diferente 5 (!=)
    }
}
