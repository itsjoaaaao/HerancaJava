/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author João P. Arquim
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciei um objeto da classe Aluno
        Aluno a1 = new Aluno(2022, "ADS", "Cleberson", 22, "Masculino");
        
        System.out.println("\tAluno:");
        //mostrando na tela seus dados
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Sexo: " + a1.getSexo());
        System.out.println("Matricula: " + a1.getMatr());
        System.out.println("Curso: " + a1.getCurso());
        
        a1.cancelarMatr();//cancelando a matricula
        
        //instanciei um objeto da classe Professor
        Professor p1 = new Professor("POO", 2000, "Jonatas", 35, "Masculino");
        System.out.println("\tProfessor:");
       
        //dados do professor
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Especialidade: " + p1.getEspecialidade());
        System.out.println("Salário: " + p1.getSalario());
        
        p1.receberAum(300);//aumentando o salario do professor
        
        //novo objeto instanciado da classe funcionário
        Funcionario f1 = new Funcionario("Limpeza", true, "Ney", 49, "Masculino");
        System.out.println("\tFuncionário:");
        
        //dados do funcionário
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Idade " + f1.getIdade());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println("Setor: " + f1.getSetor());
        
        f1.mudarTrabalho();//método para mudar o trabalho
        
    }
    
}
