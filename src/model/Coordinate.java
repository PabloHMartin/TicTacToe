package model;

import utils.ClosedInterval;
import utils.Direction;

import java.util.Random;

public class Coordinate {

    private utils.Coordinate coordinate;

    public static final int DIMENSION = 3;

    private static final ClosedInterval LIMITS = new ClosedInterval(0, Coordinate.DIMENSION-1);

    public Coordinate(){
        coordinate = new utils.Coordinate();
    }

    public Coordinate(int row, int column){
        this();
        this.setRow(row);
        this.setColumn(column);
    }

    public Coordinate(Coordinate coordinate) {
        this(coordinate.coordinate.getRow(),
                coordinate.coordinate.getColumn());
    }

    public void setRow(int row){
        assert LIMITS.includes(row);
        coordinate.setRow(row);
    }

    public void setColumn(int column){
        assert LIMITS.includes(column);
        coordinate.setColumn(column);
    }

    public void random() {
        Random random = new Random(System.currentTimeMillis());
        coordinate.setRow(random.nextInt(Coordinate.DIMENSION));
        coordinate.setColumn(random.nextInt(Coordinate.DIMENSION));
    }

    public Direction direction(Coordinate coordinate){
        Direction direction = this.coordinate.direction(coordinate.coordinate);
        if (direction == Direction.NON_EXISTENT) {
            if(this.inInverse() && coordinate.inInverse())
                return Direction.INVERSE;
        }
        return direction;
    }

    private boolean inInverse(){
        return coordinate.getRow() + coordinate.getColumn() == Coordinate.DIMENSION-1;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((coordinate == null) ? 0 : coordinate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coordinate other = (Coordinate) obj;
        if (coordinate == null) {
            if (other.coordinate != null)
                return false;
        } else if (!coordinate.equals(other.coordinate))
            return false;
        return true;
    }

    public Coordinate clone() {
        return new Coordinate(this);
    }

    public int getRow() {
        return coordinate.getRow();
    }

    public int getColumn() {
        return coordinate.getColumn();
    }

    @Override
    public String toString(){
        return "[" + (coordinate.getRow()+1) + ", " + (coordinate.getColumn()+1) + "]";
    }

}
