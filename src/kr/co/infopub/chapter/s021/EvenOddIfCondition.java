package kr.co.infopub.chapter.s021;
// if condition
public class EvenOddIfCondition {
	public static void main(String[] args) {
		int temp=99;
		if(temp%2==1){    // Ȧ�� 
			temp=temp*3+1;
		}else{
			temp=temp/2;
		}
		System.out.printf("��� ��=%d\n",temp);
	}
}