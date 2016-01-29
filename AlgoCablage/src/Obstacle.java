import java.util.List;

public class Obstacle {
	private List<Coord> sommets;

	public Obstacle(List<Coord> sommets) {
		this.sommets = sommets;
	}
	public List<Coord> getSommets() {
		return sommets;
	}
	public void setSommets(List<Coord> sommets) {
		this.sommets = sommets;
	}
}
