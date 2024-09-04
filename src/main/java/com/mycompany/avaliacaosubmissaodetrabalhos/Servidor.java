
package com.mycompany.avaliacaosubmissaodetrabalhos;


public class Servidor {
    //atributos
    private String matricula;
    private Usuario usuario;

    //construtores
    public Servidor(){
    }

    public Servidor(Usuario usuario){
        this.usuario = usuario;
    }

    //get e set
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


}
