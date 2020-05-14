package game;

public class Game {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		Enemy enemy = new Enemy();
		
		player.update();
		
		enemy.update();
		
	}

}
