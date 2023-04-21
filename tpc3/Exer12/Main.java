public class Main {
    public static void main(String[] args) {
        TarefaUnica tarefaUnica = new TarefaUnica("Comprar leite", LocalDate.of(2023, 4, 21));
        TarefaDiaria tarefaDiaria = new TarefaDiaria("Fazer exercícios", LocalDate.of(2023, 4, 21));
        TarefaMensal tarefaMensal = new TarefaMensal("Pagar contas", LocalDate.of(2023, 4, 1), 15);

        // Adicionando as tarefas à coleção
        Collection colecao = new Collection();
        colecao.adicionarTarefa(tarefaUnica);
        colecao.adicionarTarefa(tarefaDiaria);
        colecao.adicionarTarefa(tarefaMensal);

    }
}