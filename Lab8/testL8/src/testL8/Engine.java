package testL8;

public class Engine {
	private String id;
	private String series;
	private String decription;
	//instance ���� �ѹ�ա��������㹡�����ҧ  object �����е��  ����� 3 �����
	public Engine() {
		
	}
	public Engine(String Id,String Sreies,String Decrip) {
		this.id = Id;
		this.series = Sreies;
		this.decription = Decrip;
	}
	public void setId(String Idset) {
		this.id = Idset;
	}
	public String getId() {
		return this.id;
	}
	public void setSreies(String SeriesSet) {
		this.series =  SeriesSet;
	}
	public String getSeries() {
		return this.series;
	}
	public void setDecrip(String DecripSet) {
		this.decription =  DecripSet;
	}
	public String getDecrip() {
		return this.decription;
	}
	
}
