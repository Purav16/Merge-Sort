
public class BS {
	public static void main(String[] args){
		int[] array = {10,2,3,1,56,21};
		
		for ( int i = 0 ; i < array.length ; i++ ){
			for ( int j = 0 ; j < array.length ; j++ ){
				if (array[i] <= array[j]){
					
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp ;
				}
			}
		}
	
	
	for (int n : array){
		System.out.print(n + " ");
	}

}
}
