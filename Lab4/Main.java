
public class Main {

	public static void main(String[] args) {
		AccountReceivable ac0 = new AccountReceivable();
		AccountReceivable ac1 = new AccountReceivable("Cookie192","Kririn",5000,100000);
		AccountReceivable ac2 = new AccountReceivable("Cookie192","Kririn",5000);
		AccountReceivable ac3 = new AccountReceivable("Cookie192","Kririn");
        System.out.println("------------------");
		ac0.setAccountName("Nitchakarn");  
        ac0.setAmountBalance(20000);
        ac0.setMaxiNumDebt(200000);
        System.out.println(
        		"Account ID :" + ac0.getAccountID()+"\n"+
        		"Account Name :" + ac0.getAccountName()+"\n"+
        		"Account Balance :" + ac0.getAmountBalance()+"\n"+
        		"Account MaxDebt :" + ac0.getMaxiNumDebt()
        );
        System.out.println("------------------");
        ac0.debit(25000);
        ac0.crebit(3000);
	}
	

}
