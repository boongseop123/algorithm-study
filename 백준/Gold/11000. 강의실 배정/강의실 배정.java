import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = stoi(br.readLine());
		
		//1. Input Data를 2차원 배열로 받는다. (new int[n][2])
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");	
			arr[i][0] = stoi(input[0]);
			arr[i][1] = stoi(input[1]);
		}

		//2. 입력 데이터를 오름차순으로 정렬해준다. (시작 시간이 같다면, 끝나는 시간을 오름차순으로 정렬)
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
		});
		//3. PriorityQueue(우선순위 큐)를 만들어주고, (정렬된)배열의 첫 번째 end값을 큐에 넣는다.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(arr[0][1]);
		
		//4. 배열을 두 번째 값부터 순회하면서,
		for(int i = 1; i < n; i++) {
			//start가 PriorityQueue의 peek()보다 작거나 같다면, pq에서 하나 뺀다.
			if(pq.peek() <= arr[i][0]) pq.poll();
			
			//4-1. 순회하면서, 현재 end값을 새로 pq에 넣어준다.
			pq.add(arr[i][1]);
		}
		
		//5. pq에 남아있는 데이터의 갯수가 필요한 강의실의 갯수이다.
		System.out.println(pq.size());
		br.close();
	}
	public static int stoi(String str) {return Integer.parseInt(str);}
}