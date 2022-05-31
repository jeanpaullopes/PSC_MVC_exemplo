package br.edu.uniritter.psc;

import java.util.*;

public class FuncionarioDB {
    private List<Funcionario> funcionarios;
    private List<Aluno> alunos;
    //private List<Cargo> cargos;
    private Map<Integer, Cargo> mapCargos;
    FuncionarioFile funcFile;
    private Map<Integer, Departamento> departamentos;
    private int idAtual = 0;
    private static FuncionarioDB instancia;

    public static FuncionarioDB getInstance() {
        if (instancia == null) {
            instancia = new FuncionarioDB();
            instancia.funcFile = new FuncionarioFile();
            List<Funcionario> ret = instancia.funcFile.carregarFuncionarios();
            instancia.funcionarios.addAll(ret);
        }
        return instancia;
    }

    private FuncionarioDB() {
        this.funcionarios = new ArrayList<>();
        this.alunos = new ArrayList<>();
        //this.cargos = new ArrayList<>();
        this.mapCargos = new HashMap<>();

        this.departamentos = new HashMap<>();

        mapCargos.put(1, new Cargo(1, "Prof. Nv.1", 1200f));
        mapCargos.put(2, new Cargo(2, "Prof. Nv.2", 4200f));
        mapCargos.put(3, new Cargo(3, "Coordenador", 9200f));
        mapCargos.put(4, new Cargo(4, "Diretor", 12000f));

        departamentos.put(1, new Departamento(1, "Acadêmico"));
        departamentos.put(2, new Departamento(2, "Secretaria"));
        departamentos.put(3, new Departamento(3, "Financeiro"));




    }
    public void setIdAtual(int id) {
        this.idAtual = id;
    }

    public void incluir(Funcionario funcionario) {
        if (funcionario.getId() == 0) {
            this.idAtual++;
            funcionario.setId(this.idAtual);
        }
        if (this.funcionarios.contains(funcionario)) {
            System.out.println("funcionario já existe");
        } else {
            this.funcionarios.add(funcionario);
        }

        salvarNoBD();

    }
    public void salvarNoBD() {
        funcFile.salvaFuncionarios(this.funcionarios);
    }

    public List<Funcionario> getTodosFuncionarios() {
        return this.funcionarios;
    }

    public Collection<Cargo> getCargos() {
        return  mapCargos.values();
    }

    public Collection<Departamento> getDepartamentos() {
        return departamentos.values();
    }

    public Cargo getCargo(int codigo) {
        /*Cargo cargo = null;
        for (int i = 0; i < cargos.size(); i++) {
            if (cargos.get(i).getId() == codigo) {
                cargo = cargos.get(i);
            }
        }
        return cargo;
        */
        return mapCargos.get(codigo);
    }
    public Departamento getDepartamento(int codigo) {
        /*Departamento depto = null;
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == codigo) {
                depto = departamentos.get(i);
            }
        }
        return depto;

         */
        return departamentos.get(codigo);
    }
}
