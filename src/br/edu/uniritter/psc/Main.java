package br.edu.uniritter.psc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuController menuController = new MenuController();
        menuController.run();
        /*
        FuncionarioDB funcionarioDB = new FuncionarioDB();
        // troquei pelo FuncionarioDB
        //List<Funcionario> listaFuncionarios = new ArrayList<>();

        Cargo prof = new Cargo(1, "Professor N1", 1200f);
        Cargo profN2 = new Cargo(1, "Professor N2", 3200f);

        Departamento deptoAcademico = new Departamento(1, "Acadêmico");

        MenuView menu = new MenuView();
        menu.mostraMenu();

        Funcionario f1 = new Funcionario(0, 123, "Jean", prof, 200f);
        //f1.setCargo(prof);
        Funcionario f1b = f1;
        Funcionario f1a = new Funcionario(0, 123, "Jean", prof, 200f);

        f1.setDepartamento(deptoAcademico);
        Funcionario f2 = new Funcionario(0, 124, "Felipe", profN2, 1200f);
        //f2.setCargo(profN2);
        f2.setDepartamento(deptoAcademico);

        Funcionario f3 = new Funcionario(0, 125, "Vitor", prof,2000f);

        //f3.setCargo(prof);
        f3.setDepartamento(deptoAcademico);

        f1.equals("asdadad");

        funcionarioDB.incluir(f1);
        funcionarioDB.incluir(f1b);
        funcionarioDB.incluir(f1a);
        funcionarioDB.incluir(f2);
        funcionarioDB.incluir(f3);

        FuncionarioView funcView = new FuncionarioView();
        funcView.listarComSalario(funcionarioDB.getTodosFuncionarios());

        funcView.listarSemSalario(funcionarioDB.getTodosFuncionarios());

        funcView.displayFuncionario(f3);
        /* foi para a View
        for (int i =0; i < listaFuncionarios.size(); i++) {
            Funcionario f = listaFuncionarios.get(i);
            System.out.println(i+"-> "+f.getNome()+" - "+f.getCargo().getDescricao()+" R$ "+f.getSalario());
        }

         */
        //System.out.println(f1.getNome()+" - "+f1.getCargo().getDescricao()+" R$ "+f1.getSalario());
        //System.out.println(f2.getNome()+" - "+f2.getCargo().getDescricao()+" R$ "+f2.getSalario());
        //System.out.println(f3.getNome()+" - "+f3.getCargo().getDescricao()+" R$ "+f3.getSalario());

    }
}
