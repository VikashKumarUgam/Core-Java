public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem current = this.root;
        while (current != null) {
            int comparison = current.compareTo(item);
            if (comparison < 0) {
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(item).setPrevious(current);
                    return true;
                }
            } else if (comparison > 0) {
                if (current.previous() != null) {
                    current.previous().setNext(item).setPrevious(current.previous());
                    current.setPrevious(item).setNext(current);

                } else {
                    current.setPrevious(item).setNext(current);
                    this.root = item;

                }
                return true;
            } else
                return false;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0)
                currentItem = currentItem.next();
            else if (comparison > 0)
                return false;
            else {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null)
                        currentItem.next().setPrevious(currentItem.previous());
                }
                return true;
            }
        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (root == null)
            System.out.println("The list is empty");

        else{
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}