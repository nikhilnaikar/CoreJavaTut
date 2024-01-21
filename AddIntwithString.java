package Pracc;

public class AddIntwithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		String name="Ram";
		System.out.println(a+name);
		System.out.println(name+a);
		System.out.println(a+b+name);
		System.out.println(name+a+b);//name+a will be concatenated, now the result is string
		//and hence string is concatenated with number and displayed with adding
	}

}
