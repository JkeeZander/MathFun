import java.util.*;
public class FourSquared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desired = scanner.nextInt();
        while(desired!=-1){
        int e = 1;
        int root = 2;
        int possibleNumber =  (int)Math.floor(Math.pow(4,(double)e/(double)root));
        while(desired!=possibleNumber){
            if((int)Math.floor(Math.pow(4,(double)e/(double)root))>desired){
                root++;
            }else{
                e++;
            }
            possibleNumber =  (int)Math.floor(Math.pow(4,(double)e/(double)root));
        }
        System.out.println("To get desired number " + desired + "\nexponent needed is :"+e + "\n" + "root needed is:" +root);
        desired = scanner.nextInt();
    }
    }
}
