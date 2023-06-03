/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package objeto.trabalhoordenacao;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class TrabalhoOrdenacao {

    public static void main(String[] args) {
        String escolha;
        Scanner ler = new Scanner(System.in);
        OrdenacaoPesquisa pesquisa = new OrdenacaoPesquisa();

        System.out.println("Vamos criar seu vetor de numeroos inteiros");
        pesquisa.criarVetor();
        for (int i = 0; i < 5; i++) {
            System.out.println("??????????????????????????????????????????");
            System.out.println("?                                        ?");
            System.out.println("?  Qual opção de ordenação voce deseja:  ?");
            System.out.println("?                                        ?");
            System.out.println("?  (1)Ordenação por inserção             ?");
            System.out.println("?  (2)Ordenação por seleção              ?");
            System.out.println("?  (3)Ordenação por bolha                ?");
            System.out.println("?         Pesquisa                       ?");
            System.out.println("?  (4)Pesquisa Binaria                   ?");
            System.out.println("?  (5)Pesquisa Linear                    ?");
            System.out.println("?  (6)Sair                               ?");
            System.out.println("?  (7) Novo Vetor de inteiros            ?");
            System.out.println("?                                        ?");
            System.out.println("??????????????????????????????????????????");
            escolha = ler.next();

            switch (escolha) {
                case "1":
                    System.out.println("Voce escolheu a odenação por inserção");
                    pesquisa.insercao();
                    break;
                case "2":
                    System.out.println("Voce escolheu a ordenação por seleção");
                    pesquisa.selecao();
                    break;
                case "3":
                    System.out.println("Voce escolheu a ordenação por bolha");
                    pesquisa.bolha();
                    break;
                case "4":
                    System.out.println("Voce escolheu Pesquisa Binaria");
                    pesquisa.binaria();
                    break;
                case "5":
                    System.out.println("Voce escolheu Pesquisa Linear");
                    pesquisa.linear();
                    break;
                case "6":
                    System.out.println("Voce escolheu Sair");
                    i=10;
                    break;
                case "7":
                    System.out.println("Voce escolheu mudar o vetor");
                    pesquisa.criarVetor();
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDADE, TENTE NOVAMENTE!");
                    i = 0;
                    break;
            }
        }
    }
}
