public class Variable {

  public void age() {
    int age = 0;
    age = age + 7;
    System.out.println("Puppy age is : " + age);
  }

  public static void main(String[] args) {
    System.out.println("Learning about Variables");

    int a, b, c;
    int d = 10, e = 10;
    byte z = 22;
    double pi = 3.14;
    char f = 'a';

    Variable obj = new Variable();
    obj.age();

  }
}