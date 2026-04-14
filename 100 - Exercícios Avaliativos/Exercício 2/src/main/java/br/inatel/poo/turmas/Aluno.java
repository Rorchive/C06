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

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    // Recebe os dados básicos do aluno e o vetor com suas notas.
    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    // Calcula a média das notas armazenadas no vetor.
    public double calculaMedia() {
        if (notas.length == 0) {
            return 0;
        }
        
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    // Exibe as informações principais do aluno.
    public void mostraInfo() {
        String info = """
        
                ====== INFORMAÇÕES DO ALUNO: %s ======
                - Nome: %s
                - Matrícula: %s
                - Notas: %s
                - Média Final: %.2f

                """;

        System.out.printf(info, nome, nome, matricula, java.util.Arrays.toString(notas), calculaMedia());
    }
}
