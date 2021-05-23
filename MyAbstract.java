abstract class Action {
	public static final int EAT = 1 ; 
	public static final int SLEEP = 5 ; 
	public static final int WORK = 10 ; 
	public void command(int code) {
		switch(code) {
			case EAT : {
				this.eat() ;
				break ;
			}
			case SLEEP : {
				this.sleep() ;
				break ;
			}
			case WORK : {
				this.work() ;
				break ;
			}
			case EAT + SLEEP + WORK : {
				this.eat() ;
				this.sleep() ;
				this.work() ;
				break ;
 			}
		}
	}
	public abstract void eat() ;
	public abstract void work() ;
	public abstract void sleep() ;
}
class Robots extends Action {
	public void eat() {
		System.out.println("机器人充电。") ;
	}
	public void work() {
		System.out.println("机器人工作。") ;
	}
	public void sleep() {}
}
class People extends Action {
	public void eat() {
		System.out.println("人自己做饭。") ;
	}
	public void work() {
		System.out.println("人乖乖去工作。") ;
	}
	public void sleep() {
		System.out.println("人躺床上睡觉。") ;
	}
}
class Pigs extends Action {
	public void eat() {
		System.out.println("猪吃猪圈里的东西。") ;
	}
	public void sleep() {
		System.out.println("猪倒地就睡。") ;
	}
	public void work() {}
}
public class MyAbstract {
	public static void main(String[] args) {
	Action robotsAction = new Robots() ;
	Action peopleAction = new People() ;
	Action pigsAction = new Pigs() ;

	robotsAction.command(Action.SLEEP) ;
	peopleAction.command(Action.EAT + Action.WORK + Action.SLEEP) ;
	pigsAction.eat();
	pigsAction.command(Action.EAT);
	}
}
