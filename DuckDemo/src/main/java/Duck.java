package main.java;
public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;

   public void swim(){  
   }
   public void display(){
		
	   }
   
   public void performQuack() {
      try {
		quackBehavior.quack();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void performFly() {
	   try {
		flyBehavior.fiy();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   }
}


