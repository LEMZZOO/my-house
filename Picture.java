/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square land;
    private Circle sun;
    private Circle moon;
    private Person lman;
    private Person rman;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        land = new Square();
        land.makeVisible();
        land.changeSize(700);
        land.moveVertical(140);
        land.moveHorizontal(-500);
        land.changeColor("green");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(250);
        
        moon = new Circle();
        moon.moveHorizontal(-150);
        moon.changeSize(37);
        moon.changeColor("magenta");
        moon.makeVisible();
    }
    public void amanecer()
    {
        moon.makeInvisible();
        sun.slowMoveVertical(-300);
        
        //Persona sale por la izquierda y se mueve hasta la casa.
        lman = new Person();
        lman.moveHorizontal(-270);
        lman.moveVertical(29);
        lman.makeVisible();
        lman.slowMoveHorizontal(130);
        
        //Persona sale por la derecha y se mueve hasta la casa.
        rman = new Person();
        rman.moveHorizontal(270);
        rman.moveVertical(29);
        rman.makeVisible();
        rman.slowMoveHorizontal(-230);
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}