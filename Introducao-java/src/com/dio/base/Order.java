package com.dio.base;


/**
 * @author Rennan Cattem
 * @version 1.0.0
 * @
 *
 */

public class Order {

    private final String code;
    //private final int totalValue;


    private String[] itens;

    /**
     * Construtor da classe
     * @param code          Codigo do pedido
     * @param totalValue    Valor total do pedido
     */
    public Order(String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }

    public void  printItens() {
        //int i = 0;
        //EXEMPLO 4 ESTRUTURA DE REPETICAO
        for (String i : itens){
            System.out.println(i);
        }

        //EXEMPLO 3 ESTRUTURA DE REPETICAO
        /*
        for(int i = 0; i < itens.length; i++){
            System.out.println(itens[i]);
        }
         */

        //EXEMPLO 2 ESTRUTURA DE REPETICAO
        /*
        do{
            System.out.println(itens[i]);
            i++;
        }while(i < itens.length);
         */

        //EXEMPLO 1 ESTRUTURA DE REPETICAO
        /*
        while (i < itens.length){
            System.out.println(itens[i]);
            i++;
        }
         */
    }

    //DIDATICA DE ESTRUTURA DE CONDICAO
    /*
    public double calculateFee(){
        switch (totalValue){
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
        */

}
