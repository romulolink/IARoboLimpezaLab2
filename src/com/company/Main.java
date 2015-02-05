package com.company;

import java.util.Random;

public class Main {


    public static int l =0;
    public static int c =0;

    // ambiente
    public static String[][] ambiente = new String[10][10];


    public static void main(String[] args) {

        Random random = new Random();

        int contador = 0;

        System.out.printf("\n Sujando... \n");

        // Preenche a matriz aleatóriamente
        for(int i =0;i < ambiente.length; i++){
            for (int j=0; j < ambiente[0].length ; j++ ){

                l=i;
                c=j;

                if(random.nextBoolean()){

                    if(quinaDireitaTopo()){

                        System.out.printf("\nQuina Topo Direita\n");
                       
                    }

                    else if(quinaEsquedaTopo()){

                        System.out.printf("\nQuina Topo Esquina\n");
                    }

                    ambiente[i][j] = "S";

                    System.out.printf("Sujando posição [" + i + "]" + "[" + j + "]\n");
                }

            }

        }

        //posicao inicial

        System.out.printf("\nLimpando...\n");

        do{



        }while(contador != (ambiente.length * ambiente[0].length)) ;
        // enquanto todos os elementos nao forem verificados continua


    }



    //################################## POSIÇÕES

    public static boolean quinaDireitaTopo(){

        if(isRightLimit(l,c, ambiente) && isTopLimit(l,c,ambiente)){

            return true;
        }
        else{
            return false;
        }
    }


    public static boolean quinaEsquedaTopo(){

        if(isLeftLimit(l, c, ambiente) && isTopLimit(l,c,ambiente)){

            return true;

        }
        else{
            return false;
        }
    }


    public static boolean quinaDireitaBase(){

        if(isRightLimit(l, c, ambiente) && isBotttomLimit(l, c, ambiente)){

            return true;

        }
        else{
            return false;
        }
    }



    public static boolean quinaEsquerdaBase(){

        if(isLeftLimit(l, c, ambiente) && isBotttomLimit(l, c, ambiente)){

            return true;

        }
        else{
            return false;
        }
    }


    //limite a direita coluna igual a n
    public static boolean isRightLimit(int l, int c, String matrix[][]){

        if(l == (matrix[0].length - 1)){
            return true;
        }else{
            return false;
        }
    }

    //limite da esquerda coluna igual a 0
   public static boolean isLeftLimit(int l, int c, String matrix[][]){

       if(l == 0){
           return true;
       }else{
           return false;
       }

   }


    //limite da base linha = 0
    public static boolean isBotttomLimit(int l, int c, String matrix[][]){

        if(c == (matrix[0].length - 1)){
            return true;
        }else{
            return false;
        }
    }

    //limite do top linha igual a n
    public static boolean isTopLimit(int l, int c, String matrix[][]){

        if(c == 0){
            return true;
        }else{
            return false;
        }
    }



    // ########################## DIREÇÕES

    public static void direita(){

        l++;

    }

    public static void esquerda(){

        l--;

    }


    public static void cima(){

        c++;

    }


    public static void baixo(){

        c--;

    }


    public static boolean isVerified(){

        return true;
    }





    public static void aspirador(int l, int c, String matrix[][]){


        System.out.printf("Aspirado");
    }

}
