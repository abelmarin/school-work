class A {
    int f (int x) {
      System.out.format ("A.f (%d)%n", x);
      return (x == 0) ? g () : f (x - 1); 
    }
  
    int g () {
      System.out.println ("A.g ()"); 
      return 0;
    }
  
    void h () {
      System.out.println ("A.h ()"); 
    }
  }
  
  
  class B extends A {
    int f (int x) {
      System.out.format ("B.f (%d)%n", x);
      return super.f (x);
    }
  
    int g () { 
      System.out.println ("B.g ()"); 
      A r = this;
      r.h ();
      return 0;
    }
  
    void h () {
      System.out.println ("B.h ()"); 
      super.h ();
    }
  }
  
  
  public class Inheritance08 {
    public static void main (String[] args) {
      A x = new B (); 
      x.f (3);
    }
  }