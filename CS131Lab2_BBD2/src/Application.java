

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Wizard brad = new Wizard();
brad.setKey(2);
brad.lock(2);
brad.takeDamage(50);
System.out.println(brad.getHealth());
brad.unlock(2);
brad.takeDamage(50);
System.out.println(brad.getHealth());
brad.takeDamage(25);
System.out.println(brad.getHealth());
brad.lock(2);
brad.takeDamage(15);
System.out.println(brad.getHealth());
System.out.println(brad.isLocked());
brad.unlock(1);
System.out.println(brad.isLocked());
brad.setName("brad");
System.out.println(brad.toString());
	}

}
