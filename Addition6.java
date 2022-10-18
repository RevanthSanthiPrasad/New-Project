package OOPS_2;

public class Addition6 {
	//	METHOD OVER LOADING 
	public int sum(int a) {
		return a;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Addition6 add = new Addition6 ();
		
		System.out.println(add.sum(17));
		System.out.println(add.sum(17,20));
		System.out.println(add.sum(17,20,15));
	}
}
