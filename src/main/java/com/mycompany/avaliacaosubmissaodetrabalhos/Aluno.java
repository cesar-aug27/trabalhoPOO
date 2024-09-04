

package com.mycompany.avaliacaosubmissaodetrabalhos;


public class Aluno {
    
    private int matriculaSigaa;
    private Trabalho trabalho;
    private Evento evento;

    public Evento getEvento() {
        return evento;
    }

    public int getMatriculaSigaa() {
        return matriculaSigaa;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setMatriculaSigaa(int matriculaSigaa) {
        this.matriculaSigaa = matriculaSigaa;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}
