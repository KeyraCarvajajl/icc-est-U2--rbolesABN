public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NOMBRES : DIANA BORJA - KEYRA CARVAJAL");
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(15);

        System.out.println("Nodo a insertar : 10 ");
        
        System.out.println(tree);
    }
}
