package Lista2.Exercicio1;

/*
 * Crie um novo projeto que defina uma classe para representar um 
 * círculo.  Dois atributos precisam ser definidos: raio, que é do tipo double e 
 * possui como valor default 1 e cor, que armazenada um valor do tipo String 
 * e tem como valor default “vermelho”. A classe deve implementar os 
 * métodos de acesso aos atributos (getters e setters), além de definir um 
 * método para calcular a área do círculo (2 ∗ 𝜋 ∗ 𝑟2) e outro para exibir os 
 * dados do círculo. Em seguida, crie uma classe contendo o método main e 
 * instancie dois círculos. Altere a cor e o raio dos círculos, calcule a área e 
 * exiba seus dados.
 */

 public class Circulo {
     private double raio = 1.0;
     private String cor = "vermelho";
 
     public double getCirculo() {
         return raio;
     }
     public void setCirculo(double raio) {
         this.raio = raio;
     }
     public String getCor() {
         return cor;
     }
     public void setCor(String cor) {
         this.cor = cor;
     }
 
     public Circulo() {
         this.raio = raio;
         this.cor = cor;
     }
 
     public double calcularArea(double raio){
         return (3.14)*(raio*raio);
     }
 
     public void exibirDados(){
         System.out.println("Raio: " +raio+ "\nCor: " +cor+ "\nÁrea: " +calcularArea(raio));
     }
 
 
     
 
     
 
 }
 