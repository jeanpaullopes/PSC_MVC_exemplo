package br.edu.uniritter.psc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioFile {
    private static final String NOME_ARQ = "funcionarios.csv";
    private static final String DIR_ARQ = "e:/psc-2022-1";

    public FuncionarioFile() {
        File dir = new File(DIR_ARQ);
        if (! dir.exists() ) {
            dir.mkdir();
        }
    }
    private String converteFuncionarioCSV(Funcionario funcionario) {
        return  funcionario.getId()+";"+
                funcionario.getMatricula()+";"+
                funcionario.getNome()+";"+
                funcionario.getSalario()+";"+
                funcionario.getCargo().getId()+";"+
                (funcionario.getDepartamento() != null ? funcionario.getDepartamento().getId() : 0)+";"+
                "\n";
    }
    public void salvaFuncionarios(List<Funcionario> lista) {
        File arquivo = new File(DIR_ARQ+"/"+NOME_ARQ);
        if (arquivo.exists()) {
            arquivo.delete();
        }
        try {
            boolean newFile = arquivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(arquivo);
            for (int i = 0; i < lista.size(); i++) {
                fos.write( converteFuncionarioCSV(lista.get(i)).getBytes());
            }
            fos.flush();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> carregarFuncionarios(FuncionarioDB db) {
        File arquivo = new File(DIR_ARQ+"/"+NOME_ARQ);

        if (!arquivo.exists()) {
            return null;
        }
        List<Funcionario> retorno = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(arquivo);
            while (fileScanner.hasNextLine()) {
                String linha = fileScanner.nextLine();
                String[] campos = linha.split(";");
                Funcionario f = new Funcionario(
                                        Integer.parseInt(campos[0]),
                        Integer.parseInt(campos[1]),
                        campos[2],
                        db.getCargos().get( Integer.parseInt(campos[4]) - 1),
                        Float.parseFloat(campos[3])
                        );
                retorno.add(f);
            }
        fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return retorno;

    }
}
