import java.util.List;

public class Cable {
	private PointDep pointDep;
	private PointArr pointArr;
	private List<Coord> angles;
	
	public PointDep getPointDep() {
		return pointDep;
	}
	public void setPointDep(PointDep pointDep) {
		this.pointDep = pointDep;
	}
	public PointArr getPointArr() {
		return pointArr;
	}
	public void setPointArr(PointArr pointArr) {
		this.pointArr = pointArr;
	}
	public List<Coord> getAngles() {
		return angles;
	}
	public void setAngles(List<Coord> angles) {
		this.angles = angles;
	}
}
