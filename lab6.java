public class Main {
  public static void main(String[] args) {
    BST lab5Tree = new BST();

    // Step 2 - Insert values into the tree
    int[] valuesToInsert = { 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10 };
    for (int value : valuesToInsert) {
      lab5Tree.insert(value);
    }

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Inorder Traversal sorted
    System.out.println("Inorder Traversal:");
    lab5Tree.inorder();
    System.out.println();

    // Step 5 - Postorder Traversal
    System.out.println("Postorder Traversal:");
    lab5Tree.postorder();
    System.out.println();

    // Step 6 - Preorder Traversal
    System.out.println("Preorder Traversal:");
    lab5Tree.preorder();
    System.out.println();

    // Step 7 - Search for value 36
    System.out.println("Searching for value 36: " + lab5Tree.search(36));

    // Step 8 - Search for value 37
    System.out.println("Searching for value 37: " + lab5Tree.search(37));

    // Step 9 - Path to value 2
    System.out.print("Path to 2: ");
    lab5Tree.path(2);
    System.out.println();

    // Step 10 - Path to value 34
    System.out.print("Path to 34: ");
    lab5Tree.path(34);
    System.out.println();
  }
}
