package ben_mkiv.guitoolkit.client.widget;

public interface prettyElement {
    int getY();
    int getX();
    int getHeight();
    int getWidth();

    void setX(int pos);
    void setY(int pos);

    void setVisible(boolean state);
    boolean getVisible();

}