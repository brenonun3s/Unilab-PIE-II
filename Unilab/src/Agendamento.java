
import java.util.Date;

public class Agendamento {

    private Usuario idUsuario;
    private Date data;
    private String descricao;

    // Construtor
    public Agendamento(Usuario idUsuario, Date data, String descricao) {
        this.idUsuario = idUsuario;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Usuario getCliente() {
        return idUsuario;
    }

    public void setCliente(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
