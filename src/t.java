import java.lang.reflect.Array;
import java.util.Arrays;

public class t {

	public static void main(String[] args) {
		int m[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };
                   sort(m );
	 

	}

	private static void sort(int[][] m) {
		 
		  int temp =0;
		  int temp1 =0;
		for(int i =1;i<6;i++){
			 for(int j =0;j<i;j++){
				if(m[j][1]>m[i][1]){
					temp = m[i][0];
					temp1 = m[i][1];
					m[i][0]=m[j][0];
					m[i][1]=m[j][1];
					m[j][0]=temp;
					m[j][1]=temp1;
				} 
			 }
		}
 	for(int i =1;i<6;i++){
			 for(int j =0;j<i;j++){
				if(m[j][0]>m[i][0]/*&&(m[j][0]+m[j][1]>m[i][0]+m[i][1])*/){
					temp = m[i][0];
					temp1 = m[i][1];
					m[i][0]=m[j][0];
					m[i][1]=m[j][1];
					m[j][0]=temp;
					m[j][1]=temp1;
				} 
			 }
		} 
 	for(int i =1;i<6;i++){
		 for(int j =0;j<i;j++){
			if(m[j][0]==m[i][0]&&(m[j][0]+m[j][1]>m[i][0]+m[i][1]) ){
				temp = m[i][0];
				temp1 = m[i][1];
				m[i][0]=m[j][0];
				m[i][1]=m[j][1];
				m[j][0]=temp;
				m[j][1]=temp1;
			} 
		 }
	} 
		 
		for(int i = 0;i<6;i++){
			System.out.println("{"+m[i][0]+","+m[i][1]+"}");
		}
		
		
		
	}

}
