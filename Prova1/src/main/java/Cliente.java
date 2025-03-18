/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class Cliente {

    private String nome;
    private String email;
    private String curso;
    private char tipoCurso;
    private String Orientador;
    private String isBolsa;

    public Cliente(String nome, String email, String curso, char tipoCurso, String Orientador, String isBolsa) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.tipoCurso = tipoCurso;
        this.Orientador = Orientador;
        this.isBolsa = isBolsa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(char tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getOrientador() {
        return Orientador;
    }

    public void setOrientador(String Orientador) {
        this.Orientador = Orientador;
    }

    public String isIsBolsa() {
        return isBolsa;
    }

    public void setIsBolsa(String isBolsa) {
        this.isBolsa = isBolsa;
    }

}
