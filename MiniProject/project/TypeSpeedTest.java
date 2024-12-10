

import java.util.Scanner;

public class TypeSpeedTest {
    public static void main(String args[])
    {
        String str="We cannot solve problems with the kind of thinking we employed when we came up with them. Albert Einstein";
        System.out.println("Type the Following Paragraph");
        System.out.println(str);

        long startTime=System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        sc.close();
    
        long endTime=System.currentTimeMillis();

        long totalTime=(endTime-startTime)/1000;

        String strarr1[]=str.split("\\s+"),strarr2[]=S.split("\\s+");

        int Correct=0,Wrong=0;
        for(int i=0;i<Math.min(strarr1.length,strarr2.length);i++)
        {
            if(strarr1[i].equals(strarr2[i]))
            {
                Correct++;
            }
            else{
                Wrong++;
            }
        }
        Wrong=Math.max(0,strarr1.length-strarr2.length);
        double typeSpeed=(Correct/(double)totalTime)*60;
        System.out.print("Time Take :"+totalTime+"sec"+"\nTyped Correct Word :"+Correct+"\nTyped Wrong Word :"+Wrong+"\nTyping Speed :"+typeSpeed+"WPM");
    }
}
