class Main {
    public static void main(String[] args) {
        String arr[][] = {
                {"O", "X", "X"},
                {"O", "X", "O"},
                {"X", "O", "X"}};

        for (int x=0; x<arr.length; x++ ){
            for( int y=0; y<3; y++){
                if(y!=2) {
                    System.out.print(arr[x][y] + " ");
                } else System.out.print(arr[x][y]);
            }
            System.out.println();
        }
    }
}