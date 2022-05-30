public static void postOrder(Node root){
        if(root == null){
            System.out.println(-1+" ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
        }
