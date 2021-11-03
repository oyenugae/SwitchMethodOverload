import java.util.Scanner;
import java.lang.String;

class Main {
  public static void main(String[] args) {
    // Create a program calculate the perimeter of a quadilateral
    char quadilateral;
    float side1, side2, side3, side4;

    Scanner sc = new Scanner (System.in);
    
  do {
    System.out.println ("Type the kind of quadilateral that you want to find it's perimeter. Type exit to end the program");
  
    quadilateral = sc.next().charAt(0);
    switch (quadilateral){
      case 's':
          System.out.println("Input the side of the quadilateral");
          side1 = sc.nextFloat();
          System.out.println("The perimeter of the square is "+ perimeterQuadilateral(side1));

          break;
      case 'r':
        System.out.println("Input length of the quadilateral");

          side1 = sc.nextFloat();

          System.out.println("Input breadth of the quadilateral");
          side2 = sc.nextFloat();
          System.out.println("The perimeter of the square is "+ perimeterQuadilateral(side1, side2));
          break;

        case 't':
          System.out.println("Input side 1 of the quadilateral");
          side1 = sc.nextFloat();
          System.out.println("Input side 2 of the quadilateral");
          side2 = sc.nextFloat();
          System.out.println("Input side 3 of the quadilateral");
          side3 = sc.nextFloat();
          System.out.println("Input side 4 of the quadilateral");
          side4 = sc.nextFloat();
          System.out.println("The perimeter of the square is "+ perimeterQuadilateral(side1, side2, side3, side4));

          break;
        case 'e':
            System.out.println("Thanks for stopping by to use our application. Have an awesome Day. Bye for now!");

            break;

        default:
          System.out.println("Sorry, Quadilateral unknown by me");

          break;
      }
        
    }while (quadilateral != 'e');
    
   // System.out.println("Hello world!");
  }

 // method to calculate the perimeter in which all sides are equal
  static float perimeterQuadilateral(float side){
    return 4*side;
  }
// method to calculate the perimeter in which two sides are equal, 
  static float perimeterQuadilateral(float length, float breadth){
    return 2 * (length + breadth);
  }

// calcualtion of perimeters in which in their four sides are not equal
static float perimeterQuadilateral(float side1, float side2, float side3, float side4){
    return side1 + side2 + side3 + side4;
  }

}