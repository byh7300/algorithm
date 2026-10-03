import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class Q_26{
    static ArrayList<Integer>[] A;
    static Boolean visited[];


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        visited=new Boolean[N+1];
        for(int i=1;i<=N;i++){
            A[i]=new ArrayList<>();
            
        }
    
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        for(int i=1;i<=N;i++){
            Collections.sort(A[i]);
           
        }
        visited=new Boolean[N+1];
        dfs(v);
        System.out.println();
        visited=new Boolean[N+1];

        bfs(v);
        System.out.println();
    }

    public static void dfs(int x){

        visited[x]=true;
        System.out.print(x+" ");
        for(int y:A[x]){
            if(!visited[y]){
                dfs(y);
            }
        }
    }
    
    private static void bfs(int x){
        Queue<Integer> q=new LinkedList<>();
        q.add(x);
       visited[x]=true;
        while(!q.isEmpty()){
            int now=q.poll();
            System.out.print(now+" ");
            for(int y:A[now]){
                if(!visited[y]){
                    visited[y]=true;
                    q.add(y);
                }
            }
        }
    }
}