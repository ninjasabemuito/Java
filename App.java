/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ExercicioMercadao;

abstract class App {
    
   public String NomeProduto;
   public int PrecoProduto;
   public String DescricaoProduto;
   
   public App(String NomeProduto, int PrecoProduto, String DescricaoProduto){
       this.DescricaoProduto = DescricaoProduto;
       this.NomeProduto = NomeProduto;
       this.PrecoProduto = PrecoProduto;
}
   public String DescricaoProduto(){
        return "O nome do seu produto é " + NomeProduto + ",o preço do seu produto é " + PrecoProduto ;
    }
}

    