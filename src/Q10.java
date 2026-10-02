import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Node> dq = new LinkedList<>();
        StringTokenizer st2= new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int value = Integer.parseInt(st2.nextToken());
            while(!dq.isEmpty() && dq.getLast().value > value){
                dq.removeLast();
            }
            dq.addLast(new Node(i,value));
            if(dq.getFirst().index <= i-m){
                dq.removeFirst();
            }
            bw.write(dq.getFirst().value + " ");
        }
        bw.flush();
        bw.close(); 
    }
    static class Node{
        public int index;
        public int value;

        public Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}
