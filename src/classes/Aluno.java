/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author João P. Arquim
 */
public class Aluno extends Pessoa{//extendendo a classe Pessoa
    
    //atrubutos do aluno
    private int matr;
    private String curso;

    //construtor dos atributos
    public Aluno(int matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);//super é para chamar o construtor da superclasse
        this.matr = matr;
        this.curso = curso;
    }
    
    //getters e setters dos atributos
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //método para cancelar matricula
    public void cancelarMatr(){
        setMatr(0);
        System.out.println("Matricula cancelada!!\n");
    }
    
}
