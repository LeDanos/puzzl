package com.company;

import java.util.Scanner;

/**
 * hlavní class
 */
public class Main {

    /**
     * @param args hlavní funkce
     */
    public static void main(String[] args) {
        int level=1;
        int[] player={0,2};
        int[] max={4,3};
        int[][] box={{3,1},{-1,-1}};
        int[][] exit={{4,3},{-1,-1}};
        int[][] wall={{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}};

        System.out.println("Puzzl");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Tutoriál:");
        System.out.println("Ovládáte postavu \uD83E\uDDCD a váš cíl je posunout box \uD83D\uDCE6 do cíle \uD83D\uDD73️.");
        System.out.println("ve vaší cestě budou také stát stromy \uD83C\uDF32\uD83C\uDF33.");
        System.out.println("Ve hře můžete napsat w/a/s/d aby jste posunuli vaší postavu \uD83E\uDDCD.");
        System.out.println("Kdybyste se zasekli napište restart aby jste restartovali level.");
        System.out.println("Až budete připraveni, napište start a zahájíte první level.");
        for (int i = 0; i < 1;) {
            Scanner scstart = new Scanner(System.in);
            if (scstart.nextLine().equalsIgnoreCase("start")){
                i++;
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                              Level 1");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      Zmáčkněte enter aby jste pokračovali");
        Scanner sce = new Scanner(System.in);
        String e = sce.nextLine();
        for (int i = 0; i < 1;) {
            System.out.println("\n\n\n\n\n\n");
            for (int j = 0; j <= max[1]; j++) { //j=y
                for (int k = 0; k <= max[0]; k++) { //k=x
                    if (player[1]==j && player[0]==k){
                        System.out.print(" \uD83E\uDDCD ");
                    }else if ((box[0][1]==j && box[0][0]==k)||(box[1][1]==j && box[1][0]==k)){
                        System.out.print(" \uD83D\uDCE6 ");
                    }else if ((exit[0][1]==j && exit[0][0]==k)||(exit[1][1]==j && exit[1][0]==k)){
                        System.out.print(" \uD83D\uDD73 ️");
                    }else if ((wall[0][1]==j && wall[0][0]==k)||(wall[1][1]==j && wall[1][0]==k)||(wall[2][1]==j && wall[2][0]==k)||(wall[3][1]==j && wall[3][0]==k)||(wall[4][1]==j && wall[4][0]==k)||(wall[5][1]==j && wall[5][0]==k)||(wall[6][1]==j && wall[6][0]==k)||(wall[7][1]==j && wall[7][0]==k)){
                        System.out.print("\uD83C\uDF32\uD83C\uDF33");
                    }else{
                        System.out.print(" \uD83D\uDDC6 ");
                    }
                }
                System.out.println(" ");
            }
            Scanner sca = new Scanner(System.in);
            String a = sca.nextLine();
            if (a.equalsIgnoreCase("restart")){
                switch (level){
                    case 1:
                        player[0]=0;
                        player[1]=2;
                        max[0]=4;
                        max[1]=3;
                        box[0][0]=3;
                        box[0][1]=1;
                        exit[0][0]=4;
                        exit[0][1]=3;
                        break;
                    case 2:
                        player[0]=1;
                        player[1]=0;
                        max[0]=6;
                        max[1]=4;
                        box[0][0]=5;
                        box[0][1]=1;
                        exit[0][0]=5;
                        exit[0][1]=4;
                        wall[0][0]=3;
                        wall[0][1]=0;
                        wall[1][0]=0;
                        wall[1][1]=2;
                        wall[2][0]=2;
                        wall[2][1]=2;
                        wall[3][0]=3;
                        wall[3][1]=2;
                        wall[4][0]=4;
                        wall[4][1]=2;
                        wall[5][0]=5;
                        wall[5][1]=2;
                        wall[6][0]=6;
                        wall[6][1]=2;
                        break;
                    case 3:
                        player[0]=4;
                        player[1]=3;
                        max[0]=8;
                        max[1]=3;
                        box[0][0]=1;
                        box[0][1]=2;
                        box[1][0]=7;
                        box[1][1]=2;
                        exit[0][0]=1;
                        exit[0][1]=0;
                        exit[1][0]=7;
                        exit[1][1]=0;
                        wall[0][0]=3;
                        wall[0][1]=1;
                        wall[1][0]=5;
                        wall[1][1]=1;
                        wall[2][0]=0;
                        wall[2][1]=3;
                        wall[3][0]=1;
                        wall[3][1]=3;
                        wall[4][0]=2;
                        wall[4][1]=3;
                        wall[5][0]=6;
                        wall[5][1]=3;
                        wall[6][0]=7;
                        wall[6][1]=3;
                        wall[7][0]=8;
                        wall[7][1]=3;
                        break;
                }
            }
            else if (a.equalsIgnoreCase("w")){
                if (player[1]-1==box[0][1] && player[0]==box[0][0]){
                    if (box[0][1]-1==box[1][1]&&box[0][0]==box[1][0]){
                        if (box[1][1]>0){
                            if (box[1][1]-1 == wall[0][1]&&box[1][0] == wall[0][0]||box[1][1]-1 == wall[1][1]&&box[1][0] == wall[1][0]||box[1][1]-1 == wall[2][1]&&box[1][0] == wall[2][0]||box[1][1]-1 == wall[3][1]&&box[1][0] == wall[3][0]||box[1][1]-1 == wall[4][1]&&box[1][0] == wall[4][0]||box[1][1]-1 == wall[5][1]&&box[1][0] == wall[5][0]||box[1][1]-1 == wall[6][1]&&box[1][0] == wall[6][0]||box[1][1]-1 == wall[7][1]&&box[1][0] == wall[7][0]){

                            }else{
                                box[1][1]--;
                                box[0][1]--;
                                player[1]--;
                            }
                        }
                    }
                    else if (box[0][1]>0){
                        if (box[0][1]-1 == wall[0][1]&&box[0][0] == wall[0][0]||box[0][1]-1 == wall[1][1]&&box[0][0] == wall[1][0]||box[0][1]-1 == wall[2][1]&&box[0][0] == wall[2][0]||box[0][1]-1 == wall[3][1]&&box[0][0] == wall[3][0]||box[0][1]-1 == wall[4][1]&&box[0][0] == wall[4][0]||box[0][1]-1 == wall[5][1]&&box[0][0] == wall[5][0]||box[0][1]-1 == wall[6][1]&&box[0][0] == wall[6][0]||box[0][1]-1 == wall[7][1]&&box[0][0] == wall[7][0]){

                        }else{
                            box[0][1]--;
                            player[1]--;
                        }
                    }
                }else if (player[1]-1==box[1][1] && player[0]==box[1][0]){
                    if (box[1][1]-1==box[0][1]&&box[1][0]==box[0][0]){
                        if (box[0][1]>0){
                            if (box[0][1]-1 == wall[0][1]&&box[0][0] == wall[0][0]||box[0][1]-1 == wall[1][1]&&box[0][0] == wall[1][0]||box[0][1]-1 == wall[2][1]&&box[0][0] == wall[2][0]||box[0][1]-1 == wall[3][1]&&box[0][0] == wall[3][0]||box[0][1]-1 == wall[4][1]&&box[0][0] == wall[4][0]||box[0][1]-1 == wall[5][1]&&box[0][0] == wall[5][0]||box[0][1]-1 == wall[6][1]&&box[0][0] == wall[6][0]||box[0][1]-1 == wall[7][1]&&box[0][0] == wall[7][0]){

                            }else{
                                box[0][1]--;
                                box[1][1]--;
                                player[1]--;
                            }
                        }
                    }
                    else if (box[1][1]>0){
                        if (box[1][1]-1 == wall[0][1]&&box[1][0] == wall[0][0]||box[1][1]-1 == wall[1][1]&&box[1][0] == wall[1][0]||box[1][1]-1 == wall[2][1]&&box[1][0] == wall[2][0]||box[1][1]-1 == wall[3][1]&&box[1][0] == wall[3][0]||box[1][1]-1 == wall[4][1]&&box[1][0] == wall[4][0]||box[1][1]-1 == wall[5][1]&&box[1][0] == wall[5][0]||box[1][1]-1 == wall[6][1]&&box[1][0] == wall[6][0]||box[1][1]-1 == wall[7][1]&&box[1][0] == wall[7][0]){

                        }else{
                            box[1][1]--;
                            player[1]--;
                        }
                    }
                }else if ((player[1]-1==exit[0][1] && player[0]==exit[0][0])||(player[1]-1==exit[1][1] && player[0]==exit[1][0])){

                }else if ((player[1]-1==wall[0][1] && player[0]==wall[0][0])||(player[1]-1==wall[1][1] && player[0]==wall[1][0])||(player[1]-1==wall[2][1] && player[0]==wall[2][0])||(player[1]-1==wall[3][1] && player[0]==wall[3][0])||(player[1]-1==wall[4][1] && player[0]==wall[4][0])||(player[1]-1==wall[5][1] && player[0]==wall[5][0])||(player[1]-1==wall[6][1] && player[0]==wall[6][0])||(player[1]-1==wall[7][1] && player[0]==wall[7][0])){

                }else if (player[1]>0){
                    player[1]--;
                }
            }else if(a.equalsIgnoreCase("s")){
                if (player[1]+1==box[0][1] && player[0]==box[0][0]){
                    if (box[0][1]<max[1]){
                        if (box[0][1]+1==box[1][1]&&box[0][0]==box[1][0]){
                            if (box[1][1]<max[1]){
                                if (box[1][1]+1 == wall[0][1]&&box[1][0] == wall[0][0]||box[1][1]+1 == wall[1][1]&&box[1][0] == wall[1][0]||box[1][1]+1 == wall[2][1]&&box[1][0] == wall[2][0]||box[1][1]+1 == wall[3][1]&&box[1][0] == wall[3][0]||box[1][1]+1 == wall[4][1]&&box[1][0] == wall[4][0]||box[1][1]+1 == wall[5][1]&&box[1][0] == wall[5][0]||box[1][1]+1 == wall[6][1]&&box[1][0] == wall[6][0]||box[1][1]+1 == wall[7][1]&&box[1][0] == wall[7][0]){

                                }else{
                                    box[1][1]++;
                                    box[0][1]++;
                                    player[1]++;
                                }
                            }
                        }
                        else if (box[0][1]+1 == wall[0][1]&&box[0][0] == wall[0][0]||box[0][1]+1 == wall[1][1]&&box[0][0] == wall[1][0]||box[0][1]+1 == wall[2][1]&&box[0][0] == wall[2][0]||box[0][1]+1 == wall[3][1]&&box[0][0] == wall[3][0]||box[0][1]+1 == wall[4][1]&&box[0][0] == wall[4][0]||box[0][1]+1 == wall[5][1]&&box[0][0] == wall[5][0]||box[0][1]+1 == wall[6][1]&&box[0][0] == wall[6][0]||box[0][1]+1 == wall[7][1]&&box[0][0] == wall[7][0]){

                        }else{
                            box[0][1]++;
                            player[1]++;
                        }
                    }
                }else if (player[1]+1==box[1][1] && player[0]==box[1][0]){
                    if (box[1][1]+1==box[0][1]&&box[1][0]==box[0][0]){
                        if (box[0][1]<max[1]){
                            if (box[0][1]+1 == wall[0][1]&&box[0][0] == wall[0][0]||box[0][1]+1 == wall[1][1]&&box[0][0] == wall[1][0]||box[0][1]+1 == wall[2][1]&&box[0][0] == wall[2][0]||box[0][1]+1 == wall[3][1]&&box[0][0] == wall[3][0]||box[0][1]+1 == wall[4][1]&&box[0][0] == wall[4][0]||box[0][1]+1 == wall[5][1]&&box[0][0] == wall[5][0]||box[0][1]+1 == wall[6][1]&&box[0][0] == wall[6][0]||box[0][1]+1 == wall[7][1]&&box[0][0] == wall[7][0]){

                            }else{
                                box[0][1]++;
                                box[1][1]++;
                                player[1]++;
                            }
                        }
                    }
                    else if (box[1][1]<max[1]){
                        if (box[1][1]+1 == wall[0][1]&&box[1][0] == wall[0][0]||box[1][1]+1 == wall[1][1]&&box[1][0] == wall[1][0]||box[1][1]+1 == wall[2][1]&&box[1][0] == wall[2][0]||box[1][1]+1 == wall[3][1]&&box[1][0] == wall[3][0]||box[1][1]+1 == wall[4][1]&&box[1][0] == wall[4][0]||box[1][1]+1 == wall[5][1]&&box[1][0] == wall[5][0]||box[1][1]+1 == wall[6][1]&&box[1][0] == wall[6][0]||box[1][1]+1 == wall[7][1]&&box[1][0] == wall[7][0]){

                        }else{
                            box[1][1]++;
                            player[1]++;
                        }
                    }
                }else if ((player[1]+1==exit[0][1] && player[0]==exit[0][0])||(player[1]+1==exit[1][1] && player[0]==exit[1][0])){

                }else if ((player[1]+1==wall[0][1] && player[0]==wall[0][0])||(player[1]+1==wall[1][1] && player[0]==wall[1][0])||(player[1]+1==wall[2][1] && player[0]==wall[2][0])||(player[1]+1==wall[3][1] && player[0]==wall[3][0])||(player[1]+1==wall[4][1] && player[0]==wall[4][0])||(player[1]+1==wall[5][1] && player[0]==wall[5][0])||(player[1]+1==wall[6][1] && player[0]==wall[6][0])||(player[1]+1==wall[7][1] && player[0]==wall[7][0])){

                }else if (player[1]<max[1]){
                    player[1]++;
                }
            }else if(a.equalsIgnoreCase("a")){
                if (player[0]-1==box[0][0] && player[1]==box[0][1]){
                    if (box[0][0]-1==box[1][0]&&box[0][1]==box[1][1]){
                        if (box[1][0]>0){
                            if (box[1][0]-1 == wall[0][0]&&box[1][1] == wall[0][1]||box[1][0]-1 == wall[1][0]&&box[1][1] == wall[1][1]||box[1][0]-1 == wall[2][0]&&box[1][1] == wall[2][1]||box[1][0]-1 == wall[3][0]&&box[1][1] == wall[3][1]||box[1][0]-1 == wall[4][0]&&box[1][1] == wall[4][1]||box[1][0]-1 == wall[5][0]&&box[1][1] == wall[5][1]||box[1][0]-1 == wall[6][0]&&box[1][1] == wall[6][1]||box[1][0]-1 == wall[7][0]&&box[1][1] == wall[7][1]){

                            }else{
                                box[1][0]--;
                                box[0][0]--;
                                player[0]--;
                            }
                        }
                    }
                    else if (box[0][0]>0){
                        if (box[0][0]-1 == wall[0][0]&&box[0][1] == wall[0][1]||box[0][0]-1 == wall[1][0]&&box[0][1] == wall[1][1]||box[0][0]-1 == wall[2][0]&&box[0][1] == wall[2][1]||box[0][0]-1 == wall[3][0]&&box[0][1] == wall[3][1]||box[0][0]-1 == wall[4][0]&&box[0][1] == wall[4][1]||box[0][0]-1 == wall[5][0]&&box[0][1] == wall[5][1]||box[0][0]-1 == wall[6][0]&&box[0][1] == wall[6][1]||box[0][0]-1 == wall[7][0]&&box[0][1] == wall[7][1]){

                        }else{
                            box[0][0]--;
                            player[0]--;
                        }
                    }
                }else if (player[0]-1==box[1][0] && player[1]==box[1][1]){
                    if (box[1][0]-1==box[0][0]&&box[1][1]==box[0][1]){
                        if (box[0][0]>0){
                            if (box[0][0]-1 == wall[0][0]&&box[0][1] == wall[0][1]||box[0][0]-1 == wall[1][0]&&box[0][1] == wall[1][1]||box[0][0]-1 == wall[2][0]&&box[0][1] == wall[2][1]||box[0][0]-1 == wall[3][0]&&box[0][1] == wall[3][1]||box[0][0]-1 == wall[4][0]&&box[0][1] == wall[4][1]||box[0][0]-1 == wall[5][0]&&box[0][1] == wall[5][1]||box[0][0]-1 == wall[6][0]&&box[0][1] == wall[6][1]||box[0][0]-1 == wall[7][0]&&box[0][1] == wall[7][1]){

                            }else{
                                box[0][0]--;
                                box[1][0]--;
                                player[0]--;
                            }
                        }
                    }
                    else if (box[1][0]>0){
                        if (box[1][0]-1 == wall[0][0]&&box[1][1] == wall[0][1]||box[1][0]-1 == wall[1][0]&&box[1][1] == wall[1][1]||box[1][0]-1 == wall[2][0]&&box[1][1] == wall[2][1]||box[1][0]-1 == wall[3][0]&&box[1][1] == wall[3][1]||box[1][0]-1 == wall[4][0]&&box[1][1] == wall[4][1]||box[1][0]-1 == wall[5][0]&&box[1][1] == wall[5][1]||box[1][0]-1 == wall[6][0]&&box[1][1] == wall[6][1]||box[1][0]-1 == wall[7][0]&&box[1][1] == wall[7][1]){

                        }else{
                            box[1][0]--;
                            player[0]--;
                        }
                    }
                }else if ((player[0]-1==exit[0][0] && player[1]==exit[0][1])||(player[0]-1==exit[1][0] && player[1]==exit[1][1])){

                }else if ((player[0]-1==wall[0][0] && player[1]==wall[0][1])||(player[0]-1==wall[1][0] && player[1]==wall[1][1])||(player[0]-1==wall[2][0] && player[1]==wall[2][1])||(player[0]-1==wall[3][0] && player[1]==wall[3][1])||(player[0]-1==wall[4][0] && player[1]==wall[4][1])||(player[0]-1==wall[5][0] && player[1]==wall[5][1])||(player[0]-1==wall[6][0] && player[1]==wall[6][1])||(player[0]-1==wall[7][0] && player[1]==wall[7][1])){

                }else if (player[0]>0){
                    player[0]--;
                }
            }else if(a.equalsIgnoreCase("d")){
                if (player[0]+1==box[0][0] && player[1]==box[0][1]){
                    if (box[0][0]+1==box[1][0]&&box[0][1]==box[1][1]){
                        if (box[1][0]<max[0]){
                            if (box[1][0]+1 == wall[0][0]&&box[1][1] == wall[0][1]||box[1][0]+1 == wall[1][0]&&box[1][1] == wall[1][1]||box[1][0]+1 == wall[2][0]&&box[1][1] == wall[2][1]||box[1][0]+1 == wall[3][0]&&box[1][1] == wall[3][1]||box[1][0]+1 == wall[4][0]&&box[1][1] == wall[4][1]||box[1][0]+1 == wall[5][0]&&box[1][1] == wall[5][1]||box[1][0]+1 == wall[6][0]&&box[1][1] == wall[6][1]||box[1][0]+1 == wall[7][0]&&box[1][1] == wall[7][1]){

                            }else{
                                box[1][0]++;
                                box[0][0]++;
                                player[0]++;
                            }
                        }
                    }
                    else if (box[0][0]<max[0]){
                        if (box[0][0]+1 == wall[0][0]&&box[0][1] == wall[0][1]||box[0][0]+1 == wall[1][0]&&box[0][1] == wall[1][1]||box[0][0]+1 == wall[2][0]&&box[0][1] == wall[2][1]||box[0][0]+1 == wall[3][0]&&box[0][1] == wall[3][1]||box[0][0]+1 == wall[4][0]&&box[0][1] == wall[4][1]||box[0][0]+1 == wall[5][0]&&box[0][1] == wall[5][1]||box[0][0]+1 == wall[6][0]&&box[0][1] == wall[6][1]||box[0][0]+1 == wall[7][0]&&box[0][1] == wall[7][1]){

                        }else{
                            box[0][0]++;
                            player[0]++;
                        }
                    }
                }else if (player[0]+1==box[1][0] && player[1]==box[1][1]){
                    if (box[1][0]+1==box[0][0]&&box[1][1]==box[0][1]){
                        if (box[0][0]<max[0]){
                            if (box[0][0]+1 == wall[0][0]&&box[0][1] == wall[0][1]||box[0][0]+1 == wall[1][0]&&box[0][1] == wall[1][1]||box[0][0]+1 == wall[2][0]&&box[0][1] == wall[2][1]||box[0][0]+1 == wall[3][0]&&box[0][1] == wall[3][1]||box[0][0]+1 == wall[4][0]&&box[0][1] == wall[4][1]||box[0][0]+1 == wall[5][0]&&box[0][1] == wall[5][1]||box[0][0]+1 == wall[6][0]&&box[0][1] == wall[6][1]||box[0][0]+1 == wall[7][0]&&box[0][1] == wall[7][1]){

                            }else{
                                box[0][0]++;
                                box[1][0]++;
                                player[0]++;
                            }
                        }
                    }
                    else if (box[1][0]<max[0]){
                        if (box[1][0]+1 == wall[0][0]&&box[1][1] == wall[0][1]||box[1][0]+1 == wall[1][0]&&box[1][1] == wall[1][1]||box[1][0]+1 == wall[2][0]&&box[1][1] == wall[2][1]||box[1][0]+1 == wall[3][0]&&box[1][1] == wall[3][1]||box[1][0]+1 == wall[4][0]&&box[1][1] == wall[4][1]||box[1][0]+1 == wall[5][0]&&box[1][1] == wall[5][1]||box[1][0]+1 == wall[6][0]&&box[1][1] == wall[6][1]||box[1][0]+1 == wall[7][0]&&box[1][1] == wall[7][1]){

                        }else{
                            box[1][0]++;
                            player[0]++;
                        }
                    }
                }else if ((player[0]+1==exit[0][0] && player[1]==exit[0][1])||(player[0]+1==exit[1][0] && player[1]==exit[1][1])){

                }else if ((player[0]+1==wall[0][0] && player[1]==wall[0][1])||(player[0]+1==wall[1][0] && player[1]==wall[1][1])||(player[0]+1==wall[2][0] && player[1]==wall[2][1])||(player[0]+1==wall[3][0] && player[1]==wall[3][1])||(player[0]+1==wall[4][0] && player[1]==wall[4][1])||(player[0]+1==wall[5][0] && player[1]==wall[5][1])||(player[0]+1==wall[6][0] && player[1]==wall[6][1])||(player[0]+1==wall[7][0] && player[1]==wall[7][1])){

                }else if (player[0]<max[0]){
                    player[0]++;
                }
            }
            if ((box[0][0]==exit[0][0] && box[0][1]==exit[0][1] && box[1][0]==exit[1][0] && box[1][1]==exit[1][1])||(box[0][0]==exit[1][0] && box[0][1]==exit[1][1] && box[1][0]==exit[0][0] && box[1][1]==exit[0][1])){
                if (level==1){
                    level=2;
                    player[0]=1;
                    player[1]=0;
                    max[0]=6;
                    max[1]=4;
                    box[0][0]=5;
                    box[0][1]=1;
                    exit[0][0]=5;
                    exit[0][1]=4;
                    wall[0][0]=3;
                    wall[0][1]=0;
                    wall[1][0]=0;
                    wall[1][1]=2;
                    wall[2][0]=2;
                    wall[2][1]=2;
                    wall[3][0]=3;
                    wall[3][1]=2;
                    wall[4][0]=4;
                    wall[4][1]=2;
                    wall[5][0]=5;
                    wall[5][1]=2;
                    wall[6][0]=6;
                    wall[6][1]=2;
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    System.out.println("                                              Level 2");
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    System.out.println("                                                                       Zmáčkněte enter aby jste pokračovali");
                    Scanner scee = new Scanner(System.in);
                    String ee = scee.nextLine();
                }
                else if (level==2){
                    level=3;
                    player[0]=4;
                    player[1]=3;
                    max[0]=8;
                    max[1]=3;
                    box[0][0]=1;
                    box[0][1]=2;
                    box[1][0]=7;
                    box[1][1]=2;
                    exit[0][0]=1;
                    exit[0][1]=0;
                    exit[1][0]=7;
                    exit[1][1]=0;
                    wall[0][0]=3;
                    wall[0][1]=1;
                    wall[1][0]=5;
                    wall[1][1]=1;
                    wall[2][0]=0;
                    wall[2][1]=3;
                    wall[3][0]=1;
                    wall[3][1]=3;
                    wall[4][0]=2;
                    wall[4][1]=3;
                    wall[5][0]=6;
                    wall[5][1]=3;
                    wall[6][0]=7;
                    wall[6][1]=3;
                    wall[7][0]=8;
                    wall[7][1]=3;
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    System.out.println("                                              Level 3");
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    System.out.println("                                                                      Zmáčkněte enter aby jste pokračovali");
                    Scanner scee = new Scanner(System.in);
                    String ee = scee.nextLine();
                }
                else if (level==3){
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    System.out.println("                                          -=  You Won!  =-");
                    System.out.println("----------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }

        /* level 1
        * ......
        * ...B..
        * X.....
        * .....O
        *
        * level 2
        * .X.M...
        * .....B.
        * M.MMMMM
        * .......
        * .....O.
        *
        * level 3
        * .O.....O.
        * ...M.M...
        * .B.....B.
        * MMM.X.MMM
        */
    }
}