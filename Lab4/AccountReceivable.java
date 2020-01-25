
public class AccountReceivable {
	private String accountId;
	private String accountName;
	private double amountBalance;
	private double maxiNumDebt;
	//constructor = ฟังก์ชั่นมีชื่อเหมือน class
	public AccountReceivable() {
		//กำหนดค่าเริ่มต้นให้ฟิลด์
		//new AccountReceivable() = คำส่งทำงาน
		this.accountId = "";
		this.accountName = null;
		this.amountBalance = 0.0;
		this.maxiNumDebt = 0.0;
		/*System.out.println("New");
		System.out.println(this.accountId);
		System.out.println(this.accountName);
		System.out.println(this.amountBalance);
		System.out.println(this.maxiNumDebt);*/
	}
	public AccountReceivable(String id,String name,double acouBl,double maxND) {
		//setter
		this.accountId = id;
		this.accountName = name;
		this.amountBalance = acouBl;
		this.maxiNumDebt = maxND; 
		/*System.out.println("--------------------");
		System.out.println(this.accountId);
		System.out.println(this.accountName);
		System.out.println(this.amountBalance);
		System.out.println(this.maxiNumDebt);*/
	}
	public AccountReceivable(String id,String name,double acouBl) {
		this.accountId = id;
		this.accountName = name;
		this.amountBalance = acouBl;
		this.maxiNumDebt = 0.0;
		/*System.out.println("----------------");
		System.out.println(this.accountId);
		System.out.println(this.accountName);
		System.out.println(this.amountBalance);
		System.out.println(this.maxiNumDebt);*/
	}
	public AccountReceivable(String id,String name) {
	//new AccountReceivable("Receive100","KK_ABC") = คำส่งทำงาน ,มันจะส่งค่ามาให้ตัวแปรในนี้
		this.accountId = id;
		this.accountName = name;
		this.amountBalance = 0.0;
		this.maxiNumDebt = 0.0;
		System.out.println("----------------");
		System.out.println(this.accountId);
		System.out.println(this.accountName);
		System.out.println(this.amountBalance);
		System.out.println(this.maxiNumDebt);
		/*constructor ตัวนี้นั้นมีการรับค่ามาแค่ 2 ตัวแต่เรามีฟิลด์ 4 ตัว
		 ดังค่าที่จะถูก set ก่อน = id and name ส่วนฟิลด์อีกสองยังไม่ถูก set ค่า
		 */	 
	}
	public String getAccountID() {
		return this.accountId;
	}
	public void setAccountName(String accName) {
		this.accountName = accName;
	}
	public String getAccountName() {
		return this.accountName;
		
	}
	public void setAmountBalance(double accBl) {
		this.amountBalance = accBl;
		
	}
	public double getAmountBalance() {
		return this.amountBalance; 
		
	}
	public void setMaxiNumDebt(double accmaxND) {
		this.maxiNumDebt = accmaxND;
	}
	public double getMaxiNumDebt() {
		return this.maxiNumDebt; 
	}
	public void debit(double newaccBl) {
		double Dbt =  newaccBl + this.amountBalance; 
		System.out.println(Dbt);
	}
	public void crebit(double newaccBl) {
		if (newaccBl > this.amountBalance) {
			double crebt =  newaccBl - this.amountBalance; 
			System.out.println(crebt);
		}else {
			double crebt =   this.amountBalance-newaccBl ; 
			System.out.println(crebt);
		}
	}
}
