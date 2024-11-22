class BST {
  // TreeNode classfor structure of each node 
  class TreeNode {
      int value;
      TreeNode left, right;

      public TreeNode(int value) {
          this.value = value;
          left = right = null;
      }
  }

  private TreeNode root;

  // Constructor
  public BST() {
      root = null;
  }

  // Step 2 - Insert a value in BST
  public void insert(int value) {
      root = insertRec(root, value);
  }

  private TreeNode insertRec(TreeNode root, int value) {
      if (root == null) {
          root = new TreeNode(value);
          return root;
      }
      if (value < root.value) {
          root.left = insertRec(root.left, value);
      } else if (value > root.value) {
          root.right = insertRec(root.right, value);
      }
      return root;
  }

  // Step 3 - Delete node
  public void delete(int value) {
      root = deleteRec(root, value);
  }

  private TreeNode deleteRec(TreeNode root, int value) {
      if (root == null) return root;

      if (value < root.value) {
          root.left = deleteRec(root.left, value);
      } else if (value > root.value) {
          root.right = deleteRec(root.right, value);
      } else {
          if (root.left == null) return root.right;
          else if (root.right == null) return root.left;

          root.value = minValue(root.right);
          root.right = deleteRec(root.right, root.value);
      }
      return root;
  }

  private int minValue(TreeNode root) {
      int minValue = root.value;
      while (root.left != null) {
          minValue = root.left.value;
          root = root.left;
      }
      return minValue;
  }

  // Step 4 - Inorder Traversal in Sorted order
  public void inorder() {
      inorderRec(root);
  }

  private void inorderRec(TreeNode root) {
      if (root != null) {
          inorderRec(root.left);
          System.out.print(root.value + " ");
          inorderRec(root.right);
      }
  }

  // Step 5 - Postorder Traversal
  public void postorder() {
      postorderRec(root);
  }

  private void postorderRec(TreeNode root) {
      if (root != null) {
          postorderRec(root.left);
          postorderRec(root.right);
          System.out.print(root.value + " ");
      }
  }

  // Step 6 - Preorder Traversal
  public void preorder() {
      preorderRec(root);
  }

  private void preorderRec(TreeNode root) {
      if (root != null) {
          System.out.print(root.value + " ");
          preorderRec(root.left);
          preorderRec(root.right);
      }
  }

  // Step 7 - Search for a value
  public boolean search(int value) {
      return searchRec(root, value) != null;
  }

  private TreeNode searchRec(TreeNode root, int value) {
      if (root == null || root.value == value) {
          return root;
      }
      if (value < root.value) {
          return searchRec(root.left, value);
      }
      return searchRec(root.right, value);
  }

  // Step 9 n 10 Displaying the path from the root to a given node
  public void path(int value) {
      if (pathRec(root, value)) {
          System.out.println("Path to " + value + " found.");
      } else {
          System.out.println("Path to " + value + " not found.");
      }
  }

  private boolean pathRec(TreeNode root, int value) {
      if (root == null) {
          return false;
      }

      System.out.print(root.value + " ");

      if (root.value == value) {
          return true;
      }

      boolean left = pathRec(root.left, value);
      boolean right = pathRec(root.right, value);

      if (left || right) {
          return true;
      }

      // Backtrack if the path does not exist in this direction
      System.out.print("<- ");
      return false;
  }
}

public class Main {
  public static void main(String[] args) {
      BST lab5Tree = new BST();

      // Step 2 - Insert values into the tree
      int[] valuesToInsert = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
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
