public class HollowPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int col = 1; col <= 4; col++){
            for(int row = 1; row <= n; row++){
                if (row == 1 || row == 5 || col == 1 || col == 4) { 
                    System.out.print("  *");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
