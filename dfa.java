

import java.util.Scanner;

public class dfa {

    public static void main(String[] args) {

       Scanner sc =new Scanner(System.in);
       int i=0;
        System.out.println("****DEFINE YOUR OWN DFA**** ");
        System.out.println("Enter Number of States ");
        int states= sc.nextByte();
        System.out.println("Enter number of Input Alphabets ");
        int alphabets=sc.nextByte();
        int[] alpha=new int[alphabets];
        int[] st= new int[states];
        for (int j=0;j<states;j++){
            st[j]=j;
        }
        for (int j=0;j<alphabets;j++){
            alpha[j]=j;
        }
        System.out.print("States are ");
        for (int j=0;j<states;j++){
            System.out.print("q"+st[j]+" ");
        }
        System.out.println();
        System.out.print("Input alphabets are ");
        for (int j=0;j<alphabets;j++){
            System.out.print(alpha[j]+" ");
        }
        System.out.println();
        int[][] trans=new int[states][alphabets];
        for(int j=0;j<states;j++){
            for(int k=0;k<alphabets;k++){
                System.out.println("Enter the Transition State of q"+st[j]+" X "+alpha[k]);
                trans[j][k]=sc.nextInt();
            }
        }
        System.out.println("Transition Table : ");
        for(int j=0;j<states;j++){
            for(int k=0;k<alphabets;k++){
                System.out.print(" ( q"+st[j]+" ");
                System.out.print("X "+alpha[k]+" ) ");
                System.out.print("= q"+trans[j][k]+" , ");
            }
            System.out.println();
        }
        System.out.print("Choose one Initial State from : ");
        for(int j=0;j<states;j++)
        {
            System.out.print(" q"+st[j]+" ");
        }
        System.out.println();
        int istate=sc.nextInt();
        System.out.println("So u Chose Initial State as : q"+istate);
        System.out.println("Enter number of Final States");
        int nf= sc.nextByte();
        System.out.println();
        System.out.println("Choose Final State from : ");
        for(int j=0;j<states;j++)
        {
            System.out.print(" q"+st[j]+" ");
        }
        System.out.println();
        int[] fstate=new int[nf];
        for(int j =0;j<nf;j++){
            fstate[j]=sc.nextInt();
        }
        System.out.println();
        System.out.print("So You Chose the Following as your Final States :");
        for(int j =0;j<nf;j++){
            System.out.print(" q"+fstate[j]+" ");
        }
        System.out.println();
        int choice;
        do {
            System.out.println("Enter a String to Check : ");
            String w=sc.next();
            int cursor=istate;
            if(w.startsWith("e")){
                for(int j=0; j <nf;j++){
                    if((fstate[j]==istate)){
                        System.out.println("Valid String");
                        i++;
                    }
                }
            }else{
                char[] ch = new char[w.length()];
                for (int j = 0; j <w.length(); j++) {
                    ch[j] = w.charAt(j);
                }
                System.out.print("q"+cursor);
                for(int j=0;j<w.length();j++){

                    cursor=trans[cursor][Integer.parseInt(String.valueOf(ch[j]))];
                    System.out.print("--> q"+cursor);
                }

                System.out.println();
                for(int j=0;j<fstate.length;j++)
                {
                    if(cursor==fstate[j]){
                        System.out.println("Valid String ");
                        i++;
                    }
                }

            }

            if(i==0)
                System.out.println("Not Valid");
            System.out.println("The String Ended  at q"+cursor+" State");
            System.out.println("Press 1 to do it again ,0 to Exit");
            choice= sc.nextByte();
            i=0;
        } while(choice!=0);
    }
}
