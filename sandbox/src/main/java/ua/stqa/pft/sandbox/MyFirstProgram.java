package ua.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] agrs) {

    hello("world");
    hello("user");
    hello("Volodymyr");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " + " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольник со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}

