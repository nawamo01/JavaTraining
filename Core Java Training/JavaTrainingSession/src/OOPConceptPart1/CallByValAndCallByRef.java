package OOPConceptPart1;

public class CallByValAndCallByRef {
	/*
	 * 1. Call by val - Passing value while calling method
	 * 2. Call by ref - Passing object reference while calling method
	 */
	int p;
	int q;
	
	public static void main(String[] args) {
	
		// callbyval
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		int l = obj.callbyval(x,y);		//CallByVal
		System.out.println(l);
		
		
		//callbyref
		obj.p = 50;
		obj.q = 60;
		obj.callbyref(obj);
		//after swap
		System.out.println("P ="+obj.p);
		System.out.println("q ="+obj.q);
		
	}

	public int callbyval(int a, int b){
		System.out.println("callbyval");
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}

	public void callbyref(CallByValAndCallByRef t){
		System.out.println("callbyref_ValueSwap");
		int temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
}
