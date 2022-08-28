package Variable;

public class Dairies {
	public static void main(String[] args) {
		
		int a[][][] = new int[2][1][3];
		
		a[0][0][0]=11;
		a[0][0][1]=10;
		a[1][0][1]=12;
		a[0][0][2]=14;
		a[1][0][0]=15;
		a[1][0][2]=13;
		
              //   1      2	    10	
		for (int i = 1; i < 2; i++) {
			
			    //     3      4     9
			for (int j = 0; j < 1; j++) {
				   
				      //   5      6     8
				for (int k = 2; k < 3; k++) {
					
                                       // 7
					System.out.println(a[i][j][k]);
					
					
				}
				
			}
			
			
		}
	}

}
