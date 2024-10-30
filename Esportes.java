/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioMercadao;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
public class Esportes extends App {
    public String NomeProduto;
    public int PrecoProduto;
    public String DescricaoProduto;
    public Esportes (String NomeProduto, int PrecoProduto, String DescricaoProduto){
       super(NomeProduto, PrecoProduto, DescricaoProduto);
}
    @Override
    public String NomeProduto(){
        return NomeProduto;
    }
    @Override
    public int PrecoProduto(){
        return PrecoProduto;
    }
    @Override
    public String DescricaoProduto(){
        return "O nome do seu produto é " + NomeProduto + ",o preço do seu produto é " + PrecoProduto ;
    }
}

