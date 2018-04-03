package AbstractExample;

public abstract class Animal {

    public void eat(Animal food) {

        System.out.println("Animal Having Food");


    }

    public void sleep(int hours) throws InterruptedException {

        Thread.sleep(1000 * 60 * 60 * hours);
    }

    public abstract void makenoise();


  abstract public class Dog extends Animal{
      
    }
}


