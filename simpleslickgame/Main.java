package simpleslickgame;
import org.newdawn.slick.*;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
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
    	 Input input =gc.getInput();
    	 if (input.isKeyDown(Input.KEY_RIGHT)){
    		rectangulo.setX(rectangulo.getX()+1); 
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
            System.out.println("Hay un error pardillo");
        	//Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}