package assignment;

public class OperationEX5 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		
		int result = num1 | num2;
		System.out.println(result);
		
		int num3 = 5;
		System.out.println(num3 << 1);
		
		// 5에 2의2승인 4를 곱한값.
		System.out.println(num3 << 2);
		
		// 5에 2의3승인 8을 곱한값.
		System.out.println(num3 << 3);
		
		//num3 의 값은 변하지 않는다 왜? 그것은 <<= 
		//뒤에 등호를 붙어줘야지 값을 대입해주게됨.
		System.out.println(num3);
		
	}

}
