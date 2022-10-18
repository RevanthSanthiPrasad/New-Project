package OOPS_2;

public class UsePrivateFund7 {
	public static void main(String[]args) {
		PrivateFund fund = new PrivateFund();
		System.out.println(fund.interest(10000));
	}
}

class PrivateFund extends Fund {
	public int interest(int amount) {
		return amount*12/100;
	}
}

class Fund {
	public int interest(int amount) {
		return amount*8/100;
	}
}