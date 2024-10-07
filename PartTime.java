package School;

public class PartTime extends Teacher {
    private int hoursworked;

	public PartTime(String n, int a, String s, int hw) {
        super(n, a, s);
        hoursworked = hw;
    }

    public int gethoursworked() {
        return this.hoursworked;
    }

    public void sethoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    int setSalary = hoursworked * 50000;

    public void print() {
        super.print();
        System.out.println("Gaji Per jam: Rp." + setSalary);
    }
}
