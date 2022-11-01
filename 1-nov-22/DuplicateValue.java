package nov1Assg;
//wap to find duplicate values of an array of integer values
public class DuplicateValue {

	public static void main(String[] args) {
		
		int a[]=new int[]{2,3,4,3,4,6,5};          
        System.out.println("Duplicate values are ");  
        for(int i=0;i<a.length;i++) {  
            for(int j=i+1;j<a.length;j++) {  
                if(a[i]==a[j])  
                    System.out.println(a[j]);  
              }}}}
