package School;

public class FullTime extends Teacher{
    private int anualSalary;
    private String unit;

	public FullTime(String n, int a, String s, int as, String u) {
		super(n, a, s);
		anualSalary = as;
		unit = u;
	}

	public int getAnualSalary() {
		return this.anualSalary;
	}

	public void setAnualSalary(int anualSalary) {
		this.anualSalary = anualSalary;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void print() {
		super.print();
		System.out.println("Gaji per tahun : " +anualSalary);
		System.out.println("Unit : " +unit);
	}
}
