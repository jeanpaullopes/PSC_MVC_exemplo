package br.edu.uniritter.psc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuncionarioDB {
    private List<Funcionario> bancoDados;
    private List<Cargo> cargos;
    private Map<Integer, Cargo> mapCargos;

    private List<Departamento> departamentos;
    private int idAtual = 0;
    private static FuncionarioDB instancia;

    public static FuncionarioDB getInstance() {
        if (instancia == null) {
            instancia = new FuncionarioDB();
            FuncionarioFile funcFile = new FuncionarioFile();
            List<Funcionario> ret = funcFile.carregarFuncionarios();
            instancia.bancoDados.addAll(ret);
        }
        return instancia;
    }

    private FuncionarioDB() {
        this.bancoDados = new ArrayList<>();
        this.cargos = new ArrayList<>();
        this.mapCargos = new HashMap<>();

        this.departamentos = new ArrayList<>();

        cargos.add(new Cargo(1, "Prof. Nv.1", 1200f));
        cargos.add(new Cargo(2, "Prof. Nv.2", 4200f));
        cargos.add(new Cargo(3, "Coordenador", 9200f));
        cargos.add(new Cargo(4, "Diretor", 12000f));
        for (int i = 0; i< cargos.size(); i++) {
            mapCargos.put(cargos.get(i).getId(), cargos.get(i));
        }

        departamentos.add(new Departamento(1, "Acadêmico"));
        departamentos.add(new Departamento(2, "Secretaria"));
        departamentos.add(new Departamento(3, "Financeiro"));




    }
    public void setIdAtual(int id) {
        this.idAtual = id;
    }

    public void incluir(Funcionario funcionario) {
        if (funcionario.getId() == 0) {
            this.idAtual++;
            funcionario.setId(this.idAtual);
        }
        if (this.bancoDados.contains(funcionario)) {
            System.out.println("funcionario já existe");
        } else {
            this.bancoDados.add(funcionario);
        }

        FuncionarioFile ff = new FuncionarioFile();
        ff.salvaFuncionarios(this.bancoDados);

    }
    public List<Funcionario> getTodosFuncionarios() {
        return this.bancoDados;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public Cargo getCargo(int codigo) {
        Cargo cargo = null;
        for (int i = 0; i < cargos.size(); i++) {
            if (cargos.get(i).getId() == codigo) {
                cargo = cargos.get(i);
            }
        }
        return cargo;
        //return mapCargos.get(codigo);
    }
    public Departamento getDepartamento(int codigo) {
        Departamento depto = null;
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == codigo) {
                depto = departamentos.get(i);
            }
        }
        return depto;
    }
}
