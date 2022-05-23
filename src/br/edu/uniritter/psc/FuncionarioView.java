package br.edu.uniritter.psc;

import java.util.List;
import java.util.Scanner;

public class FuncionarioView {
    Scanner scanner = new Scanner(System.in);

    public void listarComSalario(List<Funcionario> lista) {
        for (int i =0; i < lista.size(); i++) {
            Funcionario f = lista.get(i);
            System.out.println(i+"-> ("+f.getId()+") "+f.getNome()+" - "+f.getCargo().getDescricao()+" R$ "+f.getSalario());
        }
    }
    public void listarSemSalario(List<Funcionario> lista) {
        for (int i =0; i < lista.size(); i++) {
            Funcionario f = lista.get(i);
            System.out.println(i+"-> "+f.getNome()+" - "+f.getCargo().getDescricao());
        }
    }
    public void displayFuncionario(Funcionario funcionario) {
        System.out.println("--------------------------------");
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Depto.: "+funcionario.getDepartamento().getDescricao());
        System.out.println("Cargo: "+funcionario.getCargo().getDescricao());
        System.out.println("Matrícula: "+funcionario.getMatricula());
        System.out.println("--------------------------------");
    }

    public Funcionario displayFormularioFuncionario(List<Cargo> cargos){//(Funcionario funcionario) {

        System.out.println("Informe o Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe a Matrícula: ");
        int matricula = scanner.nextInt();
        System.out.println("Informe o Salário: ");
        float sal = scanner.nextFloat();
        System.out.println("informe o Depto.: ");
        System.out.println("informe o Cargo: ");
//        Cargo prof = new Cargo(1, "Professor N1", 1200f);
//troquei pelo metodo selecionaCargo()
        Cargo cargo = selecionaCargo(cargos);
        Funcionario f = new Funcionario(0, matricula, nome, cargo, sal);
        return f;
    }

    public Cargo selecionaCargo(List<Cargo> cargos) {
        for (int i = 0; i < cargos.size(); i++) {
            System.out.println(i+" -> "+cargos.get(i).getDescricao());
        }
        System.out.println("Selecione o cargo:");
        int c = scanner.nextInt();

        return cargos.get(c);
    }
}
