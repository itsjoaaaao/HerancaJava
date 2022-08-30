/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author João P. Arquim
 */
public class Professor extends Pessoa{//extendendo a classe Pessoa
    
    //atributos do professor
    private String especialidade;
    private float salario;

    //contrutor dos atributos
    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //getters e setters dos atributos
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //método para receber aumento
    public void receberAum(float aum){
       if(getSalario()>0){//se o salario for maior que 0
           salario = salario + aum;// ele faz o aumento
       } 
        System.out.println("Aumento efetuado!\n");
    }
    
}
