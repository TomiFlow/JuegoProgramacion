package simpleslickgame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
 
public class Main extends BasicGame {
    private Rectangle rectangulo = null;
     
    public Main(String gamename){
        super(gamename);
    }
  
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.rectangulo = new Rectangle(50, 50, 100, 100);
        
    }
  
    @Override
    public void update(GameContainer gc, int i) throws SlickException {
    	Input input= gc.getInput();
    	if (input.isKeyDown(Input.KEY_DOWN)) {
    		rectangulo.setY(rectangulo.getY()+1);
    	}
    	else if  (input.isKeyDown(Input.KEY_UP)){
         rectangulo.setY(rectangulo.getY()-1); //Para arriba negativo y para arriba positivo
    	}
    	else if (input.isKeyDown(Input.KEY_RIGHT)) {
    		rectangulo.setX(rectangulo.getX()+1);
    
    	}
    	else if (input.isKeyDown(Input.KEY_LEFT)) {
    		rectangulo.setX(rectangulo.getX()-1);
    	}
    	else if (input.isKeyPressed(Input.KEY_R)) {
    		rectangulo.setX(0);
    		rectangulo.setY(0);
    		
    	}
    }
  
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.draw(this.rectangulo);
        
    }
  
    public static void main(String[] args){
        try{
            AppGameContainer appgc = new AppGameContainer(new Main("Formas y figuras"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }
        catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
