import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        int count=0;
        for(int k=0;k<N;k++){
            int find = b[k];
            int i=0;
            int j=N-1;
            
            while(i<j){
                if(b[i]+b[j]==find){
                    if(i!=k && j!=k){
                        count++;
                        break;
                    }
                    else if(i==k){
                        i++;
                    }
                    else if(j==k){
                        j--;
                    }
                }
                else if(b[i]+b[j]<find){
                    i++;
                }
                else{
                    j--;
                }
                }
            }
            System.out.println(count);
            scanner.close();

        }
    }

    
    

