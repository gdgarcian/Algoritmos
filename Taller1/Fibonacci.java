public class Fibo {

	/*
	public Fibo() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	public static void main(String[] args) {
		Fibo fib = new Fibo();
		
		System.out.println("Iterative version:");
		System.out.println(fib.fibonacciIterative(5));
		System.out.println(fib.fibonacciIterative(6));
		System.out.println(fib.fibonacciIterative(7));
		System.out.println(fib.fibonacciIterative(8));
		System.out.println(fib.fibonacciIterative(10));
		System.out.println(fib.fibonacciIterative(20));
		System.out.println(fib.fibonacciIterative(30));
	}

}
