import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {

    Random myColor = new Random();

    int intXFlower = 0;
    int intYFlower = 0;
      for (int intRow = 5; intRow < 50; intRow+=10) {
        for (int intColumn = 5; intColumn < 50; intColumn+=10) {
          intXFlower =  intRow * 10;  
          intYFlower =  intColumn * 10; 
          if (!findNumber(intRow)) {
          drawFlower(intXFlower,intYFlower,10,myColor.nextInt(256),myColor.nextInt(256),myColor.nextInt(256));
          }
        }
      }
    
    int intXFace = 0;
    int intYFace = 0;
      for (int intRow2 = 5; intRow2 < 100; intRow2+=20) {
        for (int intColumn = 5; intColumn < 100; intColumn+=20) {
          intXFace =  intRow2 * 5;  
          intYFace =  intColumn * 5;
          if (!findNumber(intRow2)) {
          drawFace(intXFace,intYFace,30,10,10,10);
          }
        }     
      }
      
    }
  

  /** Creates the flower
  * 
  * @param flowerX The x-coordinate of the flower's center
  * @param flowerY The y-coordinate of the flower's center
  * @param petalSize The size of the flower's petals
  * @param myColor The red component of the flower's color
  * @param myColor2 The green component of the flower's color
  * @param myColor3 The blue component of the flower's color
  * @author T. Chu
  */

  public void drawFlower(float flowerX, float flowerY, float petalSize, float myColor, float myColor2, float myColor3) {

    // Set distance of petal from the center
    float petalDistance = petalSize / 2;
    
    // Set color for petals
    fill(myColor, myColor2, myColor3); 

    // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);
  
    // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);
  
    // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);
  
    // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);
  
    // center petal
    ellipse(flowerX, flowerY, petalSize, petalSize);

  }
  
  /** Creates the face
  * 
  * @param faceX The x-coordinate of the face's center
  * @param faceY The y-coordinate of the face's center
  * @param faceSize The size of the face
  * @param LeftEye The size of the left eye
  * @param RightEye The size of the right eye
  * @param Mouth The size of the mouth
  * @author T. Chu
  */

  public void drawFace(float faceX, float faceY, float faceSize, float LeftEye, float RightEye, float Mouth) {

      // Reset the color to white
      fill (255,255,255);

      // Head
      ellipse (faceX,faceY,faceSize,faceSize);
  
      // Set left eye color to black
      fill(0,0,0);
  
      // Left-eye
      ellipse (faceX-faceSize/5, faceY-faceSize/5,faceSize/5,faceSize/5); 
  
      // Set right eye color to black
      fill(0,0,0);
  
      // Right-eye
      ellipse (faceX+faceSize/5, faceY-faceSize/5,faceSize/5,faceSize/5);
  
      // Set mouth color to red
      fill(255,5,5);
  
      // Mouth
      ellipse (faceX, faceY+faceSize/5,faceSize/2,faceSize/5);
  
  }

  /** Draws the flower if the number of rows of flowers are even
  * 
  * @param intNumOFEntities determines if the amount of rows are divisible by 2
  * @return true or false
  * @author T. Chu
  */

  public boolean findNumber (int intNumOfRows) {
    if (intNumOfRows % 2 ==0) {
      return true;
    } else {
      return false;
    }
  }

}