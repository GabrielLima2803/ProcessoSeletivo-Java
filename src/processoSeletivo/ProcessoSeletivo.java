package processoSeletivo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidate> candidatos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n==== Sistema de Processo Seletivo ====");
            System.out.println("1 - Adicionar candidato");
            System.out.println("2 - Listar candidatos");
            System.out.println("3 - Filtrar candidatos aprovados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();

                    candidatos.add(new Candidate(nome, idade, nota));
                    System.out.println("Candidato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de candidatos:");
                    if (candidatos.isEmpty()) {
                        System.out.println("Nenhum candidato cadastrado.");
                    } else {
                        for (Candidate candidato : candidatos) {
                            System.out.println(candidato);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe a nota mínima para aprovação: ");
                    double notaMinima = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.println("\nCandidatos aprovados:");
                    boolean encontrouAprovado = false;
                    for (Candidate candidato : candidatos) {
                        if (candidato.getNota() >= notaMinima) {
                            System.out.println(candidato);
                            encontrouAprovado = true;
                        }
                    }
                    if (!encontrouAprovado) {
                        System.out.println("Nenhum candidato aprovado com essa nota mínima.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}