//Classe usada para atribuir Status do Agendamento


public enum StatusAgendamento {
    AGUARDANDO(1), AGENDADO(2), REALIZADO(3), CANCELADO(4);
    
    private final int valor;
    
    private StatusAgendamento(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }    
}
