package br.edu.uniritter.psc;

public class Funcionario {
    private int id;
    private int matricula;
    private String nome;
    private float salario;
    private Cargo cargo;
    private Departamento departamento;


    public Funcionario(int id, int matricula, String nome, Cargo cargo, float salario) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        if (this.salario < this.cargo.getPisoSalarial()) {
            this.salario = cargo.getPisoSalarial();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Funcionario) {
            return this.id == ((Funcionario) obj).getId();
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }


    public String getNome() {
        return nome;
    }



    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
