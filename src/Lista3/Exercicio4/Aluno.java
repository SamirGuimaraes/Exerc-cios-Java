package Lista3.Exercicio4;

/*
 * Faça um programa em Java para gerenciar o cadastro de estudantes por meio de uma lista. 
 * Você deve criar uma classe para representar um estudante, 
 * contendo os atributos nome, idade e matricula. 
 * 
 * Além disso, a classe deve implementar os construtores, 
 * os métodos get e set para cada atributo, além da impressão dos dados utilizando o toString.
 * 
 * Implemente uma classe de execução para permitir 
 * adicionar, remover, buscar e exibir informações sobre os estudantes usando a classe ArrayList.
 * Caso prefira, também pode utilizar arrays.
 */

 public class Aluno {
     private String nome;
     private int matricula;
     private String disciplina;
 
     public String getDisciplina() {
         return disciplina;
     }
     public void setDisciplina(String disciplina){
         this.disciplina = disciplina;
     }
     
     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }
 
     public int getMatricula(){
         return matricula;
     }
     public void setMatricula(int matricula){
         this.matricula = matricula;
     }
 
     @Override
     public String toString() {
         return "Nome: " + nome + ", Disciplina: " + disciplina + ", Matrícula: " + matricula;
     }
     public Aluno(){
         this.nome = nome;
         this.disciplina = disciplina;
         this.matricula = matricula;
     }
 
     public void exibirDados(){
         System.out.println("Nome do aluno: " +nome);
         System.out.println("Matrícula ativa: " +matricula);
         System.out.println("Disciplinas inscritas: " +disciplina);
     }
     
     
 
 }
 
