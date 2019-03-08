package com.bilalkocoglu;

public class TreeWithStar {
    public int calculateFirstSpace(int row){
       return row-1;
    }

    public String drawTree(int rowCount){
        String tree = "";
        if (rowCount<1){
            tree+="...";
            System.exit(0);
        }

        System.out.println();
        int startStar = 1;
        int firstSpace = calculateFirstSpace(rowCount);

        for(int i = 1; i<=rowCount; i++){
            for(int k=0;k<firstSpace;k++){
                tree+=" ";
            }
            for(int j=0; j<startStar; j++){
                tree+="*";
            }
            startStar+=2;
            firstSpace--;
            if (!((i+1)>rowCount))
                tree+="\n";
        }
        return tree;
    }

    public static void main(String[]args){
        TreeWithStar treeWithStar = new TreeWithStar();
        System.out.println(treeWithStar.drawTree(50));
    }
}
