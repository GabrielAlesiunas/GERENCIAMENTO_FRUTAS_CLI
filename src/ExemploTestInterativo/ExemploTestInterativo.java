package ExemploTestInterativo;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

// Classe publica ExemploTestInterativo
public class ExemploTestInterativo {
    public static void main(String[] args) { 
        // Cria um objeto Scanner que lê o que o usuário digitar
        Scanner scanner = new Scanner(System.in);
        
        // Cria um conjunto (Set) para armazenar as frutas.
        Set<String> frutas = new HashSet<>();
        
        // Loop do programa, ele ele aparece as opções disponiveis para o usuario escolher
        while (true) { 
            try {
            	
                // Exibe o menu de opções para o usuário
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Remover uma fruta");
                System.out.println("4. Verificar se uma fruta está presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");
                
                // Lê a opção escolhida pelo usuário
                int opcao = scanner.nextInt();
                
                // Limpa o buffer do scanner
                scanner.nextLine();

                // Verifica qual opção o usuário escolheu e executa a ação correspondente
                switch (opcao) {
                    case 1:
                    	
                        // Adiciona uma fruta
                        System.out.print("Digite o nome da fruta para adicionar: "); 
                        String novaFruta = scanner.nextLine();
                        
                        // Tenta adicionar a fruta ao conjunto. Se já existir, avisa o usuário
                        if (frutas.add(novaFruta)) {
                            System.out.println(novaFruta + " foi adicionada.");
                        } else {
                            System.out.println(novaFruta + " já está presente no conjunto.");
                        }
                        break; 
                    case 2:
                    	
                        // Lista todas as frutas no conjunto
                        System.out.println("Frutas: " + frutas);
                        break;
                    case 3:
                    	
                        // Remove uma fruta
                        System.out.print("Digite o nome da fruta que deseja remover: "); 
                        String frutaRemover = scanner.nextLine();
                        
                        // Tenta remover a fruta. Se não encontrar, informa ao usuário
                        if (frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada.");
                        }
                        break;
                    case 4:
                    	
                        // Verifica se uma fruta está no conjunto
                        System.out.print("Digite o nome da fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine();
                        
                        // Informa ao usuário se a fruta está ou não no conjunto
                        if (frutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " está presente no conjunto.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
                        }
                        break;
                    case 5:
                    	
                        // Opção para sair do programa
                        System.out.println("Saindo...");
                        
                        // Fecha o scanner e encerra o programa
                        scanner.close();
                        return;
                    default:
                    	
                        // Caso o usuário escolha uma opção inválida, exibe uma mensagem de erro
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
            	
                // Caso o usuário insira algo que não é um número, exibe mensagem de erro
                System.out.println("Entrada inválida. Por favor, digite um número.");
                
                // Limpa a entrada inválida do scanner para evitar um loop infinito
                scanner.nextLine();
            }
        }
    }
}
