public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        /*
         for(int i=0; i<=100; i++){
             if(i >=2 && i%2 == 0){
                 System.out.println("Уволен айтишник с id "+ i);
             }
         }


         */
        int i = 2;
         while(i <= 100){
             if(i%2 == 0){
                 System.out.println("Уволен айтишник с id "+ i);
             }
             i++;
         }
    }
}
