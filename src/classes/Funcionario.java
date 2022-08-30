/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author João P. Arquim
 */
public class Funcionario extends Pessoa{//extendendo da classe Mãe: Pessoa
    
    //atributos do funcionário
    private String setor;
    private boolean trabalhando;

    //construtor dos atributos
    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);//super é para chamar o construtor da superclasse
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    //getters e setters dos atributos
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //método para mudar o trabalho
    public void mudarTrabalho(){
        if(isTrabalhando() == true){//se ele estiver trabalhando, ele muda o trabalho
            System.out.println("Trabalho mudado para Jardineiro!");
        }
    }
    
}
