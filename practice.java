import java.util.*;
class practice {
    public static void main(String []args){
       Scanner s = new Scanner(System.in);
       int num =s.nextInt();
       if(num==0){
          System.out.println("zero");
       }
       else if(num>0){
        System.out.println("positive");
       }
       else{
        System.out.println("negative");
       }

       for(int i=1;i<=num;i++){
        System.out.println(i);
       }

       switch (num) {
        case 1:
            System.out.println("sunday");
            break;
        case 2:
          System.out.println("monday");
          break;
        case 3:
          System.out.println("tuesday");
          break;
        case 4:
          System.out.println("wednesday");
          break;
        case 5:
          System.out.println("thursday");
          break;
        case 6:
          System.out.println("friday");
          break;
        case 7:
          System.out.println("saturday");
          break;
        default:
            break;
       }
       

       int i=2;
       System.out.println("do while loop");
       do{
         System.out.println(i);
         i++;
       }
       while(i<10);

    }
}