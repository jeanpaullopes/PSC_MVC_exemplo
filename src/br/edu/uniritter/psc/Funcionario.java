package br.edu.uniritter.psc;

public class Funcionario extends Pessoa{
    private float salario;
    private Cargo cargo;
    private Departamento departamento;


    public Funcionario(int id, int matricula, String nome, Cargo cargo, float salario) {
        super(id, matricula, nome);
        //this.setId(id);
        //this.matricula = matricula;
        //this.nome = nome;
        this.cargo = cargo;
        this.setSalario(salario);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Funcionario) {
            return getId() == ((Funcionario) obj).getId();
        } else {
            return false;
        }
    }



    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        if (this.salario < this.cargo.getPisoSalarial()) {
            this.salario = cargo.getPisoSalarial();
        }
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
