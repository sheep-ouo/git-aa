package sm.cm;
aaaaaaaa

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {
	int big;
	int medium;
	int small;
	ArrayList<ISignUp> arry=new ArrayList<ISignUp>();
	Scanner in=new Scanner(System.in);

	public void School(int big,int medium,int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	
	public boolean addISignUp(ArrayList<ISignUp> array) {
		
		
		for(int i=0;;i++) {
		System.out.println("�������ѯ�İ༶(1:��࣬2:�а࣬3:С�࣬0:�˳�)");
		int stuType=in.nextInt();
		
		if(stuType==1) {
			if(big!=0) {
				System.out.println("ʣ��"+big+"������");
						System.out.println("¼��ѧ����Ϣ");
						System.out.println("������ѧ��������");
						String name=in.next();
						System.out.print("������ѧ���༶��");
						String schoolsystem=in.next();
						ISignUp s=new ISignUp();
						s.setName(name);
						s.setSchoolSystem(schoolsystem);
						array.add(s);
						big--;
						return true;
			}
						else{
						System.out.println("��ʣ������");
						return false;
						}
		}
						else if(stuType==2){
						if(medium!=0) {
						System.out.println("ʣ��"+medium+"������");
						System.out.println("¼��ѧ����Ϣ��");
						System.out.print("������ѧ��������");
						String name=in.next();
						System.out.println("������ѧ���༶��");
						String schoolsystem=in.next();
						ISignUp s=new ISignUp();
						s.setName(name);
						s.setSchoolSystem(schoolsystem);
						array.add(s);
						medium--;
						return true;
							}
						else {
							System.out.println("��ʣ�����");
							return false;
						}
		}		
		 if(stuType==3) {
			if(small!=0) {
				System.out.println("ʣ��"+small+"������");
				System.out.println("¼��ѧ����Ϣ��");
				System.out.print("������ѧ��������");
				String name=in.next();
				System.out.print("������ѧ���༶��");
				String schoolsystem=in.next();
				ISignUp s=new ISignUp();
				s.setName(name);
				s.setSchoolSystem(schoolsystem);
			array.add(s);
			small--;
			return true;
				}
				else {
					System.out.println("��ʣ�����");
					return false;
				}
}		
		 else if(stuType==0) {
			 System.out.println("�˳��ɹ�");
		 }
	}
}
	

		
		public void print(ArrayList<ISignUp>array) {
			for(int i=0;i<array.size();i++) {
				ISignUp s=array.get(i);
				System.out.println(s.getName()+","+s.getSchoolSystem());
			}
		}

		
}	


public class IParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ISignUp>array=new ArrayList<ISignUp>();
		Scanner in=new Scanner(System.in);
		SchoolSystem a=new SchoolSystem();
		a.School(10,15,20);
		while(a.addISignUp(array)) {
			a.addISignUp(array);
		}
		System.out.println("�༶ѧ����Ϣ��");
		a.print(array);
	}

}


public class ISignUp {

	String name;
	String SchoolSystem;
	public void student(String name,String SchoolSystem) {
		this.name=name;
		this.SchoolSystem=SchoolSystem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSchoolSystem() {
		return SchoolSystem;
	}
	public void setSchoolSystem(String SchoolSystem) {
		this.SchoolSystem=SchoolSystem;
	}
}




