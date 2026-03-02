import java.util.Scanner;
class numberguess{
    public static void main(String[] args){
        int num=((int)(Math.random()*100));

        Scanner obj = new Scanner(System.in);
        //int guess=obj.nextInt();
        int guess;
       do
       {
            System.out.print("ENTER YOUR GUESS NUMBER:");
            guess=obj.nextInt();
            if(num==guess){
                System.out.println("YEYY YOU WIN THE MATCH");
            }else if(num>guess){
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }else{
                System.out.println("YOUR NUMBER IS TOO BIG");
            }
       }
       while(guess != num);
        {
            System.out.println("YOU LOSSE THE MATCH..."+num);
       }
       obj.close();
    }
}
