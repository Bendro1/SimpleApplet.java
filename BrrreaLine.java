package ucenie.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrrreaLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[100];
        System.out.println("Zadaj vety napisom stop program ukoncis");
        for(int i =0;i<100;i++){
            str[i]= br.readLine();
            if(str[i].equals("stop")){
                break;
            }
        }
        for(int i =0;i<100;i++){
            if(str[i].equals("stop")){
                break;
            }
            System.out.println(str[i]);
        }

    }
}
