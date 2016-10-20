public class BubbleSort{
	public static void main(String[] args) {
		int [] a={1,45,12,4,23,48,78};
		System.out.println("排序前");
		for (int i=0;i<a.length-1 ;i++ ) {
			System.out.print(a[i]+"  ");
		}
		Sort.sort(a);
		System.out.println();
		for (int i=0;i<a.length-1 ;i++ ) {
			System.out.print(a[i]+"  ");
		}
	}
}
class Sort{
	public static void sort(int [] data){
		for (int i=0;i<data.length-1 ;i++ ) {
			for (int j=0;j<data.length-i-1 ;j++ ) {
				if(data[j]>data[j+1]){
					int temp = data[j];  
                    data[j] = data[j + 1];  
                    data[j + 1] = temp;
				}
			}
		}
	}
}
/*
public class BubbleSort {  
    public static void sort(int data[]) {  
        for (int i = 0; i < data.length -1; i++) {  
            for (int j = 0; j < data.length - i - 1; j++) {  
                if (data[j] > data[j + 1]) {  
                    int temp = data[j];  
                    data[j] = data[j + 1];  
                    data[j + 1] = temp;  
                }  
  
            }  
        }  
    }  
  
}
*/