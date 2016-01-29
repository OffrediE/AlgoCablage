import java.util.List;
import java.util.LinkedList;
import java.awt.Dimension;
import java.awt.Graphics;javax.swing.JFrame;
import javax.swing.JPanel;

public class Map extends JPanel{
	private List<Obstacle> obstacles;
	private List<PointDep> pointsDep;
	private List<PointArr> pointsArr;
	private List<Cable> cables;
	private Pathfinder pathfinder;
	
	public Map(){
		 setPreferredSize(new Dimension(720, 405));
	}
	
	public List<Obstacle> getObstacles() {
		return obstacles;
	}
	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}
	public void addObstacle(Obstacle obstacle){
		this.obstacles.add(obstacle);
	}
	
	/*
	public List<PointDep> getPointsDep() {
		return pointsDep;
	}
	public void setPointsDep(List<PointDep> pointsDep) {
		this.pointsDep = pointsDep;
	}
	public List<PointArr> getPointsArr() {
		return pointsArr;
	}
	public void setPointsArr(List<PointArr> pointsArr) {
		this.pointsArr = pointsArr;
	}*/
	
	public List<Cable> getCables() {
		return cables;
	}
	public void setCables(List<Cable> cables) {
		this.cables = cables;
	}
	public void addCable(Cable cable){
		this.cables.add(cable);
	}
	
	public Algo getAlgo() {
		return pathfinder;
	}
	public void setAlgo(Algo Algo) {
		this.pathfinder = pathfinder;
	}
	
	public void paintComponent(Graphics g) {
          super.paintComponent(g);
          
          for(Cable c:cables){
          	LinkedList<Coord> points = (LinkedList) c.getAngles();
          	g.drawLine(points.getFirst().getX() , points.getFirst().getY() , points.getLast().getX() , points.getLast().getY());
          	
          	for(int i=1;i<points.size();i++){
          		g.drawLine(points.get(i-1).getX() , points.get(i-1).getY() , points.get(i).getX() , points.get(i).getY());
          	}
          }
          
          for(Obstacle o:obstacles){
          	LinkedList<Coord> points = (LinkedList) o.getAngles();
          	g.drawLine(points.getFirst().getX() , points.getFirst().getY() , points.getLast().getX() , points.getLast().getY());
          	
          	for(int i=1;i<points.size();i++){
          		g.drawLine(points.get(i-1).getX() , points.get(i-1).getY() , points.get(i).getX() , points.get(i).getY());
          	}
          }
     }
	
}
