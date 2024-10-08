public class shortestpath {
    
    public static float getshortestpath(String path){
        int y=0, x=0;

        for(int i=0; i<path.length();i++){
            char dir=path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }

            //west
            else if(dir == 'W'){
                x--;
            }

            //east
            else if(dir == 'E'){
                x++;
             }

        }

        return(float)Math.sqrt(x*x + y*y);
    }

    public static void main(String args[]) {
        String path="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
}
