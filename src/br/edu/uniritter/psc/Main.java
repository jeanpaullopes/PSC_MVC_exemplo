package br.edu.uniritter.psc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuController menuController = new MenuController();
        menuController.run();
        /*
        Cargo c = new Cargo(1, "Prof. Nv.1", 1200f);
        Cargo c2 = new Cargo(2, "Prof. Nv.2", 1200f);
        Funcionario f =  new Funcionario(1,123, "func", c, 500f);
        System.out.println("antes do aumento: " +f.getNome()+" "+f.getSalario());
        c.setPisoSalarial(400);
        f.setSalario(f.getSalario());
        Pessoa p = new Aluno(1,1,"o jean", "ADS");
        Pessoa p1 = f;
        System.out.println("Depois do aumento: " +f.getNome()+" "+f.getSalario());

        List<Cargo> cargos = new ArrayList<>();
        Map<Integer, Cargo> mapaCargos = new HashMap<>();

        cargos.add(c);
        cargos.add(c2);
        if (! cargos.contains(c)) {
            cargos.add(c);
        }
        cargos.add(c);
        cargos.add(c2);
        cargos.add(c);
        cargos.add(c2);

        mapaCargos.put(c.getId(), c);
        mapaCargos.put(c2.getId(), c2);
        //if (!mapaCargos.containsValue(c)) {
            mapaCargos.put(666, c);
        //}
        mapaCargos.put(666, c2);
        System.out.println(mapaCargos);
        for (int i = 0; i < cargos.size(); i++) {
            System.out.println(cargos.get(i).getId()+"  -> "+cargos.get(i).getDescricao());
            cargos.get(0).setDescricao(cargos.get(i).getDescricao()+"a");

        }
        System.out.println("======");
        for (int i = 0; i < cargos.size(); i++) {
            System.out.println(cargos.get(i).getDescricao());
        }


         */

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
