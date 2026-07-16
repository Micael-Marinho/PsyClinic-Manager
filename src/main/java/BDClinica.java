// Apache NetBeans 24
// Autor: Micael Marinho Souza

import java.util.ArrayList;
import java.util.List;

public class BDClinica {
    private static BDClinica bancoClinica;
    private final List<Paciente> pacientes;
    private final List<Familiar> familiares;
    private final List<Psicologo> psicologos;
    private final List<Consulta> consultas;

    private BDClinica() {
        this.pacientes = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.psicologos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    //MÉTODO SINGLETON
    public static BDClinica getInstance() {
        if (bancoClinica == null) {
            bancoClinica = new BDClinica();
        }
        return bancoClinica;
    }

    // CRUD DE PACIENTE
    public void inserirPaciente(Paciente paciente) throws EntradaInvalidaException {
        validarPaciente(paciente);
        if (consultarPaciente(paciente.getCpf()) != null) {
            throw new EntradaInvalidaException("Já existe paciente cadastrado com este CPF.");
        }
        pacientes.add(paciente);
    }

    public Paciente consultarPaciente(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equalsIgnoreCase(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    public Paciente consultarPacientePorNome(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }

    public Paciente consultarPacientePorCpfOuNome(String cpf, String nome) {
        Paciente paciente = null;
        if (cpf != null && !cpf.trim().isEmpty()) {
            paciente = consultarPaciente(cpf.trim());
        }
        if (paciente == null && nome != null && !nome.trim().isEmpty()) {
            paciente = consultarPacientePorNome(nome.trim());
        }
        return paciente;
    }

    public void alterarPaciente(Paciente paciente) throws EntradaInvalidaException {
        alterarPaciente(paciente.getCpf(), paciente);
    }

    public void alterarPaciente(String cpfOriginal, Paciente paciente) throws EntradaInvalidaException {
        validarPaciente(paciente);
        if (cpfOriginal == null || cpfOriginal.trim().isEmpty()) {
            throw new EntradaInvalidaException("Consulte ou cadastre o paciente antes de alterar");
        }
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equalsIgnoreCase(cpfOriginal.trim())) {
                Paciente pacienteMesmoCpf = consultarPaciente(paciente.getCpf());
                if (pacienteMesmoCpf != null && pacienteMesmoCpf != pacientes.get(i)) {
                    throw new EntradaInvalidaException("Já existe outro paciente cadastrado com este CPF");
                }
                pacientes.set(i, paciente);
                return;
            }
        }
        throw new EntradaInvalidaException("Paciente não encontrado para alteração. Consulte o paciente antes de alterar o CPF");
    }

    public boolean excluirPaciente(String cpf) {
        Paciente paciente = consultarPaciente(cpf);
        if (paciente != null) {
            pacientes.remove(paciente);
            return true;
        }
        return false;
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    // CRUD DE FAMILIAR
    public void inserirFamiliar(Familiar familiar) throws EntradaInvalidaException {
        validarFamiliar(familiar);
        if (consultarFamiliar(familiar.getCpf()) != null) {
            throw new EntradaInvalidaException("Já existe familiar cadastrado com este CPF");
        }
        familiares.add(familiar);
    }

    public Familiar consultarFamiliar(String cpf) {
        for (Familiar familiar : familiares) {
            if (familiar.getCpf().equalsIgnoreCase(cpf)) {
                return familiar;
            }
        }
        return null;
    }

    public Familiar consultarFamiliarPorNome(String nome) {
        for (Familiar familiar : familiares) {
            if (familiar.getNome().equalsIgnoreCase(nome)) {
                return familiar;
            }
        }
        return null;
    }

    public Familiar consultarFamiliarPorCpfOuNome(String cpf, String nome) {
        Familiar familiar = null;
        if (cpf != null && !cpf.trim().isEmpty()) {
            familiar = consultarFamiliar(cpf.trim());
        }
        if (familiar == null && nome != null && !nome.trim().isEmpty()) {
            familiar = consultarFamiliarPorNome(nome.trim());
        }
        return familiar;
    }

    public void alterarFamiliar(Familiar familiar) throws EntradaInvalidaException {
        alterarFamiliar(familiar.getCpf(), familiar);
    }

    public void alterarFamiliar(String cpfOriginal, Familiar familiar) throws EntradaInvalidaException {
        validarFamiliar(familiar);
        if (cpfOriginal == null || cpfOriginal.trim().isEmpty()) {
            throw new EntradaInvalidaException("Consulte ou cadastre o familiar antes de alterar");
        }
        for (int i = 0; i < familiares.size(); i++) {
            if (familiares.get(i).getCpf().equalsIgnoreCase(cpfOriginal.trim())) {
                Familiar familiarMesmoCpf = consultarFamiliar(familiar.getCpf());
                if (familiarMesmoCpf != null && familiarMesmoCpf != familiares.get(i)) {
                    throw new EntradaInvalidaException("Já existe outro familiar cadastrado com este CPF");
                }
                familiares.set(i, familiar);
                return;
            }
        }
        throw new EntradaInvalidaException("Familiar não encontrado para alteração. Consulte o familiar antes de alterar o CPF");
    }

    public boolean excluirFamiliar(String cpf) {
        Familiar familiar = consultarFamiliar(cpf);
        if (familiar != null) {
            familiares.remove(familiar);
            return true;
        }
        return false;
    }

    public List<Familiar> listarFamiliares() {
        return familiares;
    }

    // CRUD DE PSICÓLOGO
    public void inserirPsicologo(Psicologo psicologo) throws EntradaInvalidaException {
        validarPsicologo(psicologo);
        if (consultarPsicologo(psicologo.getCrp()) != null) {
            throw new EntradaInvalidaException("Já existe psicólogo cadastrado com este CRP");
        }
        psicologos.add(psicologo);
    }

    public Psicologo consultarPsicologo(String crp) {
        for (Psicologo psicologo : psicologos) {
            if (psicologo.getCrp().equalsIgnoreCase(crp)) {
                return psicologo;
            }
        }
        return null;
    }

    public Psicologo consultarPsicologoPorCpf(String cpf) {
        for (Psicologo psicologo : psicologos) {
            if (psicologo.getCpf().equalsIgnoreCase(cpf)) {
                return psicologo;
            }
        }
        return null;
    }

    public Psicologo consultarPsicologoPorNome(String nome) {
        for (Psicologo psicologo : psicologos) {
            if (psicologo.getNome().equalsIgnoreCase(nome)) {
                return psicologo;
            }
        }
        return null;
    }

    public Psicologo consultarPsicologoPorCrpCpfOuNome(String crp, String cpf, String nome) {
        Psicologo psicologo = null;
        if (crp != null && !crp.trim().isEmpty()) {
            psicologo = consultarPsicologo(crp.trim());
        }
        if (psicologo == null && cpf != null && !cpf.trim().isEmpty()) {
            psicologo = consultarPsicologoPorCpf(cpf.trim());
        }
        if (psicologo == null && nome != null && !nome.trim().isEmpty()) {
            psicologo = consultarPsicologoPorNome(nome.trim());
        }
        return psicologo;
    }

    public void alterarPsicologo(Psicologo psicologo) throws EntradaInvalidaException {
        alterarPsicologo(psicologo.getCrp(), psicologo);
    }

    public void alterarPsicologo(String crpOriginal, Psicologo psicologo) throws EntradaInvalidaException {
        validarPsicologo(psicologo);
        if (crpOriginal == null || crpOriginal.trim().isEmpty()) {
            throw new EntradaInvalidaException("Consulte ou cadastre o psicólogo antes de alterar");
        }
        for (int i = 0; i < psicologos.size(); i++) {
            if (psicologos.get(i).getCrp().equalsIgnoreCase(crpOriginal.trim())) {
                Psicologo psicologoMesmoCrp = consultarPsicologo(psicologo.getCrp());
                if (psicologoMesmoCrp != null && psicologoMesmoCrp != psicologos.get(i)) {
                    throw new EntradaInvalidaException("Já existe outro psicólogo cadastrado com este CRP");
                }
                psicologos.set(i, psicologo);
                return;
            }
        }
        throw new EntradaInvalidaException("Psicólogo não encontrado para alteração. Consulte o psicólogo antes de alterar o CRP");
    }

    public boolean excluirPsicologo(String crp) {
        Psicologo psicologo = consultarPsicologo(crp);
        if (psicologo != null) {
            psicologos.remove(psicologo);
            return true;
        }
        return false;
    }

    public List<Psicologo> listarPsicologos() {
        return psicologos;
    }

    // CRUD DE CONSULTA
    public void inserirConsulta(Consulta consulta) throws EntradaInvalidaException, HorarioIndisponivelException {
        validarConsulta(consulta);
        if (consultarConsulta(consulta.getCodigo()) != null) {
            throw new EntradaInvalidaException("Já existe consulta cadastrada com este código");
        }
        validarHorarioDisponivel(consulta, -1);
        consultas.add(consulta);
    }

    public Consulta consultarConsulta(int codigo) {
        for (Consulta consulta : consultas) {
            if (consulta.getCodigo() == codigo) {
                return consulta;
            }
        }
        return null;
    }

    public void alterarConsulta(Consulta consulta) throws EntradaInvalidaException, HorarioIndisponivelException {
        alterarConsulta(consulta.getCodigo(), consulta);
    }

    public void alterarConsulta(int codigoOriginal, Consulta consulta) throws EntradaInvalidaException, HorarioIndisponivelException {
        validarConsulta(consulta);
        if (codigoOriginal <= 0) {
            throw new EntradaInvalidaException("Consulte ou cadastre a consulta antes de alterar");
        }
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getCodigo() == codigoOriginal) {
                Consulta consultaMesmoCodigo = consultarConsulta(consulta.getCodigo());
                if (consultaMesmoCodigo != null && consultaMesmoCodigo != consultas.get(i)) {
                    throw new EntradaInvalidaException("Já existe outra consulta cadastrada com este código");
                }
                validarHorarioDisponivel(consulta, i);
                consultas.set(i, consulta);
                return;
            }
        }
        throw new EntradaInvalidaException("Consulta não encontrada para alteração. Consulte a consulta antes de alterar o código");
    }

    public boolean excluirConsulta(int codigo) {
        Consulta consulta = consultarConsulta(codigo);
        if (consulta != null) {
            consultas.remove(consulta);
            return true;
        }
        return false;
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

    // VALIDAÇÕES
    private void validarPaciente(Paciente paciente) throws EntradaInvalidaException {
        validarPessoa(paciente);
        if (paciente.getHistoricoClinico().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o histórico clínico do paciente");
        }
        if (paciente.getNivelUrgencia().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o nível de urgência do paciente");
        }
    }

    private void validarFamiliar(Familiar familiar) throws EntradaInvalidaException {
        validarPessoa(familiar);
        if (familiar.getParentesco().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o parentesco do familiar");
        }
        if (familiar.getResponsavelFinanceiro().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe se o familiar é responsável financeiro");
        }
    }

    private void validarPsicologo(Psicologo psicologo) throws EntradaInvalidaException {
        validarPessoa(psicologo);
        if (psicologo.getCrp().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o CRP do psicólogo");
        }
        if (psicologo.getAbordagem().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe a abordagem do psicólogo");
        }
    }

    private void validarPessoa(Pessoa pessoa) throws EntradaInvalidaException {
        if (pessoa == null) {
            throw new EntradaInvalidaException("Objeto não informado");
        }
        if (pessoa.getNome().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o nome");
        }
        if (pessoa.getCpf().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o CPF");
        }
        if (pessoa.getTelefone().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o telefone");
        }
        if (pessoa.getIdade() <= 0) {
            throw new EntradaInvalidaException("Informe uma idade válida");
        }
    }

    private void validarConsulta(Consulta consulta) throws EntradaInvalidaException {
        if (consulta == null) {
            throw new EntradaInvalidaException("Consulta não informada");
        }
        if (consulta.getCodigo() <= 0) {
            throw new EntradaInvalidaException("Informe um código de consulta válido");
        }
        if (consulta.getData().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe a data da consulta");
        }
        if (consulta.getHorario().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe o horário da consulta");
        }
        if (consulta.getPaciente() == null || consulta.getPaciente().getCpf().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe um paciente válido para a consulta");
        }
        if (consulta.getPsicologo() == null || consulta.getPsicologo().getCrp().trim().isEmpty()) {
            throw new EntradaInvalidaException("Informe um psicólogo válido para a consulta");
        }
    }

    private void validarHorarioDisponivel(Consulta novaConsulta, int indiceIgnorado) throws HorarioIndisponivelException {
        for (int i = 0; i < consultas.size(); i++) {
            Consulta consultaAtual = consultas.get(i);
            if (i != indiceIgnorado
                    && consultaAtual.getData().equalsIgnoreCase(novaConsulta.getData())
                    && consultaAtual.getHorario().equalsIgnoreCase(novaConsulta.getHorario())
                    && consultaAtual.getPsicologo().getCrp().equalsIgnoreCase(novaConsulta.getPsicologo().getCrp())
                    && !consultaAtual.getSituacaoAgendamento().equalsIgnoreCase("Cancelada")) {
                throw new HorarioIndisponivelException("Já existe consulta para este psicólogo na mesma data e horário");
            }
        }
    }
}
