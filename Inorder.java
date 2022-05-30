 public static void inOrder(Node root){
        if(root == null){
            System.out.println(-1+" ");
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
        }
