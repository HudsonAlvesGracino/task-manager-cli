import java.util.Scanner;

        public class ConsoleHelper {
            public static Prioridade lerPrioridade(Scanner scanner){
                while (true){
                    String entrada = scanner.nextLine().toUpperCase();
                    try{
                        return Prioridade.valueOf(entrada);
                    } catch (IllegalArgumentException e){
                        System.out.println("[Erro] Prioridade inválida! Use Alta, Media ou Baixa");
                    }
                }
            }
        }
