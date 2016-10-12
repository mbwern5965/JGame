package application;

import static org.lwjgl.opengl.GL11.*;
 
import java.awt.Color;
 
import org.lwjgl.input.Keyboard;
 
public class Player {
     
    public static float x,y;
    public static float vel=0.96f;
     
    public Player(float x, float y){
         
        this.x=x;
        this.y=y;
         
    }
     
    public void playerMovement(){
        drawPlayer();       
        while(Keyboard.next()){
             
            if (Keyboard.getEventKeyState()){
                if(Keyboard.isKeyDown(Keyboard.KEY_D)){                 
                    x++;
                     
                 
                 
                }
             
         
            }
             
        }       
    }
     
    public static void drawPlayer(){
         
        glBegin(GL_QUADS); //Begins drawing the quad
        glColor3f(0.5f,0.4f,0.3f); //Paints the quad
        glVertex2f(x, y);//Top left corner
        glVertex2f(x + 45,y);//Top right corner
        glVertex2f(x + 45, y+ 45);//Bottom right corner
        glVertex2f(x, y+45);//Bottom left corner
        glEnd();// Ends quad drawing
    }
     
     
 
}
