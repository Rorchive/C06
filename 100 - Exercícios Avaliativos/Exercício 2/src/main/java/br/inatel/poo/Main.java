/**
 * @file: Turma.java
 * @exercise: Exercício Avaliativo II (Inatel Poo)
 * @author: Rodrigo Andrade
 * @date: 13 Apr 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
*/

package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        // Define a turma com capacidade máxima para 40 alunos.
        Turma turma = new Turma(40);

        // Cada aluno recebe suas notas já no construtor.
        Aluno aluno1 = new Aluno("Ana", "1001", new double[]{8.5, 7.0, 9.0});

        Aluno aluno2 = new Aluno("Bruno", "9874", new double[]{6.0, 7.5, 8.0});

        Aluno aluno3 = new Aluno("Carla", "2303", new double[]{9.0, 9.5, 10.0});

        // Insere os alunos na turma.
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Exibe todos os alunos cadastrados.
        turma.listarAlunos();

        // Busca e mostra o aluno com maior média.
        Aluno melhorAluno = turma.buscarMelhorAluno();
        if (melhorAluno != null) {
            System.out.println("\nMelhor aluno da turma:");
            melhorAluno.mostraInfo();
        }
    }
}