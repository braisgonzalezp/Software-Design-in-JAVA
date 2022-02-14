package e2;

public class Slopes {

    public static int downTheSlope ( char[][] slopeMap , int right , int down ) {

        int contador1 = 0,trees = 0,filas=slopeMap.length;

        for (int i = 0; i < slopeMap.length; i++){
            for (int j = 0; j < slopeMap[i].length; j++){
                if (slopeMap[i].length != slopeMap.length || (slopeMap[i][j] != '.' && slopeMap[i][j] != '#')){
                    contador1++;
                }
            }
        }
        if(contador1 != 0 || right >= slopeMap[0].length || down >= slopeMap.length || right < 1 || down < 1) {
            throw new IllegalArgumentException();
        }else {
            for(int i = 0; i < slopeMap.length; i++){
                for(int j = 0; j < slopeMap[i].length; j++) {
                    if(slopeMap[i][j] == '#'){
                        trees++;
                    }
                    if(j == slopeMap[i].length){
                        j=0;
                    }
                    if(j%right == 0) {
                        if (i + down < slopeMap.length){
                            i = i + down;
                        }
                        else{
                            i=filas-1;
                        }

                    }
                }
            }
        }
        return trees;
    }

    public static int jumpTheSlope(char[][] slopeMap,int right,int down){
        int trees = 0,filas=slopeMap.length;

        for(int i = 0; i < slopeMap.length; i=i+down){
            for(int j = 0; j < slopeMap[i].length; j=j+down) {
                if(slopeMap[i][j] == '#'){
                    trees++;
                }

            }
        }


        return trees;
    }



    


}
