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
        drawFlower(intXFlower,intYFlower,10,myColor.nextInt(256),myColor.nextInt(256),myColor.nextInt(256));
      }
    }
  int intXFace = 0;
  int intYFace = 0;
    for (int intRow = 5; intRow < 100; intRow+=20) {
      for (int intColumn = 5; intColumn < 100; intColumn+=20) {
        intXFace =  intRow * 5;  
        intYFace =  intColumn * 5; 
        drawFace(intXFace,intYFace,30,10,10,10);
      } 
    }
  }
  

  public void drawFlower(float flowerX, float flowerY, float petalSize, float myColor, float myColor2, float myColor3) {

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
  

  public void drawFace(float faceX, float faceY, float faceSize, float LeftEye, float RightEye, float Mouth) {

    fill (255,255,255);

    ellipse (faceX,faceY,faceSize,faceSize);

    fill(0,0,0);

    ellipse (faceX-width/50, faceY-width/60,faceSize/5,faceSize/5); 

    fill(0,0,0);

    ellipse (faceX+width/50, faceY-width/60,faceSize/5,faceSize/5);

    fill(255,5,5);

    ellipse (faceX-width/500, faceY-width/4,faceSize/2,faceSize/5);

    fill(255,255,255);

  }
  
  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */

  
  
}