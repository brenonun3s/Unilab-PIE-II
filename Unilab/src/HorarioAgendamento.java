import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HorarioAgendamento {
    private List<LocalTime> horarios;

    public HorarioAgendamento() {
        horarios = new ArrayList<>();
        gerarHorarios();
    }

    private void gerarHorarios() {
        for (int dia = 1; dia <= 5; dia++) { // 5 dias por semana
            for (int hora = 8; hora < 18; hora++) { // Das 8h às 18h
                horarios.add(LocalTime.of(hora, 0));
            }
        }
    }

    public List<LocalTime> getHorarios() {
        return horarios;
    }

    public static void main(String[] args) {
        HorarioAgendamento agendamento = new HorarioAgendamento();
        agendamento.getHorarios().forEach(System.out::println);
    }
}
