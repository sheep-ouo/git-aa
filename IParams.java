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
		System.out.println("请输入查询的班级(1:大班，2:中班，3:小班，0:退出)");
		int stuType=in.nextInt();
		
		if(stuType==1) {
			if(big!=0) {
				System.out.println("剩余"+big+"个名额");
						System.out.println("录入学生信息");
						System.out.println("请输入学生姓名：");
						String name=in.next();
						System.out.print("请输入学生班级：");
						String schoolsystem=in.next();
						ISignUp s=new ISignUp();
						s.setName(name);
						s.setSchoolSystem(schoolsystem);
						array.add(s);
						big--;
						return true;
			}
						else{
						System.out.println("无剩余名额");
						return false;
						}
		}
						else if(stuType==2){
						if(medium!=0) {
						System.out.println("剩余"+medium+"个名额");
						System.out.println("录入学生信息：");
						System.out.print("请输入学生姓名：");
						String name=in.next();
						System.out.println("请输入学生班级：");
						String schoolsystem=in.next();
						ISignUp s=new ISignUp();
						s.setName(name);
						s.setSchoolSystem(schoolsystem);
						array.add(s);
						medium--;
						return true;
							}
						else {
							System.out.println("无剩余名额：");
							return false;
						}
		}		
		 if(stuType==3) {
			if(small!=0) {
				System.out.println("剩余"+small+"个名额");
				System.out.println("录入学生信息：");
				System.out.print("请输入学生姓名：");
				String name=in.next();
				System.out.print("请输入学生班级：");
				String schoolsystem=in.next();
				ISignUp s=new ISignUp();
				s.setName(name);
				s.setSchoolSystem(schoolsystem);
			array.add(s);
			small--;
			return true;
				}
				else {
					System.out.println("无剩余名额：");
					return false;
				}
}		
		 else if(stuType==0) {
			 System.out.println("退出成功");
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
		System.out.println("班级学生信息：");
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




