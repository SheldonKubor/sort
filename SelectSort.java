
  public class SelectSort{
  	public static void main(String[] args) {
  		int [] a={1,45,12,4,23,48,78};
		System.out.println("before");
		for (int i=0;i<a.length-1 ;i++ ) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		Sort.sort(a);
		System.out.println("after");
		for (int i=0;i<a.length-1 ;i++ ) {
			System.out.print(a[i]+"  ");
		}
  	}

  }
  class SelSort{
  	public static void sort(int data[]) {  
        int minVal;  
        int minIndex;  
        for (int i = 0; i < data.length - 1; i++) {  
            minVal = data[i];  
            minIndex = i;  
            for (int j = i + 1; j < data.length; j++) {  
                if (data[j] < minVal) {  
                    minVal = data[j];  
                    minIndex = j;  
                }  
            }  
            if (minVal != data[i] && minIndex != i) {  
                data[minIndex] = data[i];  
                data[i] = minVal;  
            }  
        }   
    }  
  }
