package kr.co.infopub.chapter.s013;
// ���
public class BioCalendar {
	// ���, ������� ������ �� ����.
	public static final int PHYSICAL = 23;     // ���(������ ����)
	public static void main(String[] args) {
		System.out.println(PHYSICAL);   
		int index=PHYSICAL;                  // ������� ������ ���� 
		// Math.PI 3.14���� ���ǵȾ� �ִ� ���
		double vals=2 * Math.PI / index ;
		System.out.println(vals +"����");
	}
}