public class Add45 { 
    public static void main(String[] args) {
    
        int [][] gugudan = new int[10][10];
        
        for(int i = 0 ; i < 10 ; i++) {
            for(int k = 0 ; k < 10 ; k++) {
                gugudan[i][k] = i * k;
            }
        }

        for(int i = 1 ; i < 10 ; i++) {
            for(int k = 1 ; k < 10 ; k++){
                System.out.print(" " + gugudan[i][k]);
            }
            System.out.println();
        }
    }
}