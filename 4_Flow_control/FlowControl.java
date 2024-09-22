
public class FlowControl {
    public static void main(String[] args) {
    
        SwitchCase();
        Loops();
    }

    public static void SwitchCase(){
        System.out.println("Switch Case");
        int num=20;
        switch(num){
            case 20: 
                System.out.println("Num = "+num);
            default:
                System.out.println("Deafult case");
        }
    }

    public static  void Loops(){
        // for loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);  
        }

        //for Each  loop
        String array[] = { "Ron", "Harry", "Hermoine" };
        for (String x : array){
            System.out.println(x);
        }

        //while loop

        int j=0;

        while(j<10){
            System.out.println(j);
            j++;
        }

        //do while loop
        int k=0;

        do { 
            System.out.println(k);
            k++;
        } while (k <10);


    }
}
