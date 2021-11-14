public class WhileAndDoWhile {
    public static void main(String[] args) {
        boolean even = isEvenNumber(5);
        System.out.println(even);
//        int count = 1;
//        while(count !=6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count Value is " +count);
//            count++;
//        }
//        for(int i = 6; i !=6; i++){
//            System.out.println("Count Value is " + count);
//        }
//        count = 6;
//        do{
//            System.out.println("Count Value is " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        }while(count != 6);
//        int  number = 4;
//        int finishnumber = 20;
//        int sum = 0;
//        while(number <= finishnumber){
//            number++ ;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("The sum is "+ sum);
//        }

        int  number = 4;
        int finishnumber = 20;
        int sum = 0;
        while(number <= finishnumber){
            number++ ;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number is " + number);
            sum++;
            if(sum >=5){
                break;
            }
        }
        System.out.println("Sum of even numbers are: " + sum);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
