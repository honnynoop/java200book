package kr.co.infopub.chapter.s014;
// ����  % * /
public class BioCalendar {
	// ���, ������� ������ �� ����.
	public static final int PHYSICAL = 23;     // ���(������ ����)
	public static void main(String[] args) {
		System.out.println(PHYSICAL);   
		int index=PHYSICAL;                  // ������� ������ ����
		int days=1200;   
		// Math.PI 3.14���� ���ǵȾ� �ִ� ���
		double vals=(days % index) * 2 * Math.PI / index ;
		System.out.println(vals +"����");
		System.out.println( Math.toDegrees(vals) +"��");
	}
}
