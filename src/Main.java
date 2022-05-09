import java.util.Scanner;

public class Main {


    public static void main(String[] args){
    //System.out.println("ОТВЕТ : " + factor(5));
        //  System.out.println("ОТВЕТ : " + fac( 8));;



        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2= sc.nextInt();
        String wr = sc.next();

        System.out.println(n +"" + n2 + wr);

        String wr2 = sc.next();
System.out.println(wr2);
    }
  //  public static int factor(int num){
  //  int res= 1;
    //    while (num != 1){
      //      res *=num;
        //    num--;
       // }
      //  return res;
   // }

  //  public static int fac(int num){
    //    if (num < 1)
      //      return 0;
      //  if (num == 1)
        //    return 1;

      //  return num * fac(num-1);
  //  }


}
