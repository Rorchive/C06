/**
 * @file: Turma.java
 * @exercise: Exercício Avaliativo II (Inatel Poo)
 * @author: Rodrigo Andrade
 * @date: 13 Apr 2026
 * @license: MIT
 * @language: Java
 * @github: https://github.com/Rorchive/C06
*/

package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos;

    // Cria a turma com uma capacidade padrão de alunos.
    public Turma() {
        this(10);
    }

    // Cria a turma com a capacidade informada.
    public Turma(int capacidadeMaximaAlunos) {
        this.alunos = new Aluno[capacidadeMaximaAlunos];
        this.quantidadeAlunos = 0;
    }

    // Adiciona um aluno na próxima posição livre do vetor.
    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos >= alunos.length) {
            System.out.println("Não foi possível adicionar o aluno, a turma está cheia.");
            return;
        }

        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    // Percorre o vetor preenchido e mostra os alunos cadastrados.
    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    // Retorna o aluno com a maior média da turma.
    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) {
            return null;
        }

        Aluno melhorAluno = alunos[0];
        double maiorMedia = melhorAluno.calculaMedia();

        for (int i = 1; i < quantidadeAlunos; i++) {
            Aluno alunoAtual = alunos[i];
            double mediaAtual = alunoAtual.calculaMedia();

            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                melhorAluno = alunoAtual;
            }
        }

        return melhorAluno;
    }
}
