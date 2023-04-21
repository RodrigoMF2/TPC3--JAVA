import java.time.LocalDate;

    public class Tarefa {
        private String descricao;
        private LocalDate data;

        public Tarefa(String descricao, LocalDate data) {
            this.descricao = descricao;
            this.data = data;
        }

        public boolean ocorreEm(int year, int month, int day) {
            return data.getYear() == year && data.getMonthValue() == month && data.getDayOfMonth() == day;
        }

        public String getDescricao() {
            return descricao;
        }

        public LocalDate getData() {
            return data;
        }
    }

