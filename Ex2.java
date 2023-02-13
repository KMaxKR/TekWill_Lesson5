public class Ex2 {
    public static void main(String[] args){
        int count = 0;
        for (int i = 100; i <= 1000; i++){
            if(i % 6 == 0 && i % 5 == 0){
                System.out.print(i + " ");
                count += 1;
                if(count == 10){
                    System.out.println("\n");
                    count = 0;
                }
            }
        }
    }
}
