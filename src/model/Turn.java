package model;

public class Turn {

    private int value;

    public Turn() {
        value = 0;
    }

    public Color take(){
        return Color.values()[value];
    }

    public void change() {
        value = (value +1)% (Color.values().length-1);
    }
}
