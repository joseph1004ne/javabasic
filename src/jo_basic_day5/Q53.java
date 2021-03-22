package jo_basic_day5;

public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	char[]letter = {'a','b','c'};
	for(int index = 0; index<letter.length;index++)
		System.out.print(letter[index]+",");
	
	
	double[] a= {1.1,2.2,3.3};
	System.out.println(a[0]+""+a[1]+""+a[2]);
	a[1]=a[2];
	System.out.println(a[0]+""+a[1]+""+a[2]);
	
	int[]sampleArray = new int[10];
	for(int index = 1; index<=sampleArray.length; index++)
		sampleArray[index]=3*index;
	
	
	
	}

}
