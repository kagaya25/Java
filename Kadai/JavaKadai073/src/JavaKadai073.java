//Done
import java.util.*;
public class JavaKadai073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		while(true)
		{
			
			System.out.println("�f�[�^����͂��Ă��������[�[��");
			int num1 = sc.nextInt();
			total = total + num1;
			System.out.println( "���v�́@ "+ total+"�@�Ȃ�܂���");
			if(total >100) {
				break;
			}
		}
		
	}

}