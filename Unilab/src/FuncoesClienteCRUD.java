//Esse código tem como objetivos modelar as funções CRUD que o usuario pode fazer no sistema

public class FuncoesClienteCRUD {
    
    //@Override
    public void salvarCliente(Usuario cliente) {
        PersistenciaDAO.getInstance().salvar(cliente);
    }

     //@Override
    public void deletar(Usuario cliente) {
        PersistenciaDAO.getInstance().deletar(cliente);
    }

    public void salvarAgendamento(Agendamento agendamento) {
        PersistenciaDAO.getInstance().salvar(agendamento);
    }

    public void confirmarAgendamento(Agendamento agendamento) {
        PersistenciaDAO.getInstance().confirmar(agendamento);
    }
          

        
}
