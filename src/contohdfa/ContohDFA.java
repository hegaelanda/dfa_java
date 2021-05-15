package contohdfa;

import java.util.Scanner;

public class ContohDFA {

    static int dfa = 0;
    
    static void q0(char c){
        if(c == 'a'){
            dfa = 1;
        }else if(c == '0' || c == '1'){
            dfa = 2;
        }else{
            dfa = -1;
        }
    }
    
    static void q1(char c){
        if(c == 'a' || c == '0' || c == '1'){
            dfa = 1;
        }else{
            dfa = -1;
        }
    }
    
    static void q2(char c){
        if(c == 'a' || c == '0' || c == '1'){
            dfa = 2;
        }else{
            dfa = -1;
        }
    }
    
    static boolean isAccepted(char input[]){
        int i;
        for (i = 0; i < input.length; i++) {
            if(dfa == 0)
                q0(input[i]);
            else if(dfa == 1)
                q1(input[i]);
            else if(dfa == 2)
                q2(input[i]);
            else
                return false;
        }
        if(dfa == 1)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char arrayInput[] = input.toCharArray();
        if(isAccepted(arrayInput))
            System.out.println("Accepted");
        else
            System.out.println("Not Accepted");
        
    }   
}
