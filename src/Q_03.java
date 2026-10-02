import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q_03 {
    public static void main(String[] args) {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long b[] = new long[n+1];
        for(int i=1;i<=n;i++){
            b[i] = b[i-1]+Long.parseLong(st.nextToken());
        }
        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            System.out.println(b[r]-b[l-1]);
            
        }
    }
}
