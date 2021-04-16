package Ex3;

public class MovableCircle implements Movable {
public int radius;
public MovablePoint center;

public MovableCircle(int x, int y, int xSp,int ySp, int radius) {
	this.radius = radius;
	this.center = new MovablePoint(x,y,xSp,ySp);
}

@Override
public String toString() {
    return "MovableCircle{" +
            "radius=" + radius +
            ", center=" + center +
            '}';
	}

@Override
public void moveUp() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveDown() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveLeft() {
	// TODO Auto-generated method stub
	
}

@Override
public void moveRight() {
	// TODO Auto-generated method stub
	
}
}
