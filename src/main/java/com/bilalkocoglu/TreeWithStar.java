package com.bilalkocoglu;

public class TreeWithStar {
    public int calculateFirstSpace(int row){
       return row-1;
    }

    public void drawTree(int rowCount){
        if (rowCount<1){
            System.out.println("...");
            System.exit(0);
        }

        System.out.println();
        int startStar = 1;
        int firstSpace = calculateFirstSpace(rowCount);

        for(int i = 1; i<=rowCount; i++){
            for(int k=0;k<firstSpace;k++){
                System.out.print(" ");
            }
            for(int j=0; j<startStar; j++){
                System.out.print("*");
            }
            startStar+=2;
            firstSpace--;
            System.out.println();
        }
    }

    public static void main(String[]args){
        TreeWithStar treeWithStar = new TreeWithStar();
        treeWithStar.drawTree(50);
    }
}
