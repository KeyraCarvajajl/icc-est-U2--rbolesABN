
public class Node {
  private int value;
  private Node left;
  private Node right;
  private int heigth;

  public Node(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
    this.heigth = 0;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public int getHeigth() {
    return heigth;
  }

  public void setHeigth(int heigth) {
    this.heigth = heigth;
  }
  
}
