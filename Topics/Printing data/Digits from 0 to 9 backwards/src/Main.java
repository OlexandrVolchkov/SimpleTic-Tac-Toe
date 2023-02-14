class Main {
    public static void main(String[] args) {
        int i = 9;
        while (i >= 0) {
            if (i > 0) {
                System.out.print(i + " ");
                i--;
            } else if(i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}
