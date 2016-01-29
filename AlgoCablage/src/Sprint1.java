import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;

public class Sprint1 {
	public static void main(String args[]){
		
		Map map1 = new Map();
		
		List<Coord> listObsUp = new LinkedList<Coord>(Arrays.asList(new Coord(0,0),new Coord(700,0),new Coord(700,0),new Coord(0,0)));
		Obstacle obsUp = new Obstacle(listObsUp);
		List<Coord> listObsLeft = new LinkedList<Coord>(Arrays.asList(new Coord(0,0),new Coord(0,700),new Coord(0,700),new Coord(0,0)));
		Obstacle obsLeft = new Obstacle(listObsLeft);
		List<Coord> listObsDown = new LinkedList<Coord>(Arrays.asList(new Coord(0,700),new Coord(700,700),new Coord(700,700),new Coord(0,700)));
		Obstacle obsDown = new Obstacle(listObsDown);
		List<Coord> listObsRight = new LinkedList<Coord>(Arrays.asList(new Coord(700,0),new Coord(700,700),new Coord(700,700),new Coord(700,0)));
		Obstacle obsRight = new Obstacle(listObsRight);
		
		
		List<Coord> listObs1 = new LinkedList<Coord>(Arrays.asList(new Coord(100,100),new Coord(300,100),new Coord(300,300),new Coord(100,300)));
		Obstacle obs1 = new Obstacle(listObs1);
		List<Coord> listObs2 = new LinkedList<Coord>(Arrays.asList(new Coord(400,100),new Coord(600,100),new Coord(600,300),new Coord(400,300)));
		Obstacle obs2 = new Obstacle(listObs2);
		List<Coord> listObs3 = new LinkedList<Coord>(Arrays.asList(new Coord(100,400),new Coord(100,600),new Coord(300,600),new Coord(300,400)));
		Obstacle obs3 = new Obstacle(listObs3);
		List<Coord> listObs4 = new LinkedList<Coord>(Arrays.asList(new Coord(400,400),new Coord(400,600),new Coord(600,600),new Coord(600,400)));
		Obstacle obs4 = new Obstacle(listObs4);
		
		map1.addObstacle(obsUp);
		map1.addObstacle(obsLeft);
		map1.addObstacle(obsDown);
		map1.addObstacle(obsRight);
		map1.addObstacle(obs1);
		map1.addObstacle(obs2);
		map1.addObstacle(obs3);
		map1.addObstacle(obs4);
		 
		JFrame fenetre = new JFrame();
		fenetre.setSize(750, 750);
		fenetre.add(map1);
		fenetre.setVisible(true);
	}
}
