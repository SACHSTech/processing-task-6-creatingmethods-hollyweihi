import processing.core.PApplet;
public class Sketch extends PApplet {
  public void settings() {
    size(300, 300);
  }
  public void setup() {
    background(0, 200, 0);
  }
  public void draw() {
    drawFlower(150, 150, 100);
    drawFlower(80, 90, 75);
    drawFlower(225, 80, 45);
    drawFlower(75, 225, 55);
    drawFlower(220, 220, 65);
  }
  public void drawFlower(float flowerX, float flowerY, float petalSize) {
	  float petalDistance = petalSize / 2;
    fill(255, 128, 0);
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    fill(255, 0, 0);
    ellipse(flowerX, flowerY,
            petalSize, petalSize);
  }
}
