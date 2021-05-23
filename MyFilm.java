class Emp {
	private long empno ;
	private String name ;
	private double salary ; 
	private String job ; 
	private double comm ;
	private Dept dept ;
	private Emp leader ;
	public Emp(Long empno, String name, String job, double salary, double comm) {
		this.empno = empno ;
		this.name = name ;
		this.job = job ;
		this.salary = salary ;
		this.comm = comm ;
	}
	public void setDept(Dept dept) {
		this.dept = dept ;
	}
	public Dept getDept() {
		return this.dept ;
	}
	public void setLeader(Emp leader) {
		this.leader = leader ;
	}
	public Emp getLeader() {
		return this.leader;
	}
	public String getInfo(){
		return this.empno + ", " + this.name + ", " + this.job + ", " + this.salary + ", " + this.comm  ;
	} 
}

class Dept {
	private long deptno ; 
	private String dname ;
	private String loc ; 
	private Emp emps[] ;
	public Dept(Long deptno, String dname, String loc) {
		this.deptno = deptno ;
		this.dname = dname ;
		this.loc = loc ;
	}
	public void setEmps(Emp[] emps) {
		this.emps = emps ;
	}
	public Emp[] getEmps() {
		return this.emps;
	}
	public String getInfo(){
		return this.deptno + ", " + this.dname + ", " + this.loc ;
	} 
}

public class MyFilm{
	public static void main(String[] args) {
		// 定义出各个实例化对象，并没有任何关联设置
		Dept dept = new Dept(01L, "HR", "SH") ; 
		Emp empA = new Emp(0001L, "David", "boss", 10000.00, 500.00) ;
		Emp empB = new Emp(0002L, "Jimmy", "clerk", 2000.00, 0.0) ;
		Emp empC = new Emp(0003L, "James", "manager", 500.00, 200.00) ;
		Emp empD = new Emp(0004L, "Anne", "clerk", 2000.00, 0.0) ;
		Emp empList[] = new Emp[] {empA, empB, empC, empD} ;
		// 进行关联设置
		for (Emp i : empList){
			i.setDept(dept) ;
		} // 雇员和部门
		empB.setLeader(empC) ;
		empC.setLeader(empA) ;
		empD.setLeader(empC) ; 
		// 雇员和雇员
		dept.setEmps(empList) ; // 部门和雇员
		System.out.println("|-" + dept.getInfo()) ; // 通过部门获取
		for (Emp i : dept.getEmps()) {
			System.out.println("\t |-" + i.getInfo()) ;
			if (i.getLeader() != null ) {
				System.out.println("\t\t |-" + i.getLeader().getInfo()) ;
			}
		}
		System.out.println("-------------") ;
		for (Emp i : dept.getEmps()) { // 通过雇员取
			System.out.println("|-" + i.getDept().getInfo());
		}
	}
}