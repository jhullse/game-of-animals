package jhullse.gameofanimals.util.mutable;

public interface BinaryTreeNavigator {

    void setRoot(BinaryTreeNode root);

    BinaryTreeNode getRoot();

    BinaryTreeNode getCurrent();

    BinaryTreeNode next(boolean isLeftChild);

    void rewind();
}
