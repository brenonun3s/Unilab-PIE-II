
import java.util.Objects;

public class Usuario {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    //@OneToOne(cascade = CascadeType.ALL)
    private String email;
    private String senha;

   

    public Usuario(String nome, String cpf, String telefone,  String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha; 
    }

    public Integer getIdCliente() {
        return id;
    }

    public void setIdCliente(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario cliente = (Usuario) obj;
        return 
                Objects.equals(id, cliente.id) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(nome, cliente.nome) &&
                Objects.equals(telefone, cliente.telefone) &&
                Objects.equals(email, cliente.email) &&
                Objects.equals(senha, cliente.senha);
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               ", senha='" + senha + '\'' +
               '}';
    }
}
