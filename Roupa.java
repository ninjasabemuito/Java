/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioMercadao;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
 class Roupa extends App {
     public String NomeProduto;
    public int PrecoProduto;
    public String DescricaoProduto;
    public Roupa (String NomeProduto, int PrecoProduto, String DescricaoProduto){
       super(NomeProduto, PrecoProduto, DescricaoProduto);
}
   
    public String NomeProduto(){
        return NomeProduto;
    }
    
    public int PrecoProduto(){
        return PrecoProduto;
    }
    
    public String DescricaoProduto(){
        return "O nome do seu produto é " + NomeProduto + ",o preço do seu produto é " + PrecoProduto ;
    }
}