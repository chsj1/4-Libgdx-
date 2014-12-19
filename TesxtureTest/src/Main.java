import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.example.hellolibgdx.MyGame;


public class Main {

	public static void main(String[] args) {
		new LwjglApplication(new MyGame(), "Game", 480, 800, false);  
	}
}
