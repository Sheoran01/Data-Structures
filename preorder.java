public static void preOrder(Node root) {
            if (root == null) {
                System.out.println(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
