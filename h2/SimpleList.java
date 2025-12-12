package h2;

public class SimpleList {
    Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        Node cur = head.next;
        if (cur == null) return null;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        Node last = getLast();
        if (last == null) {
            head.next = newNode;
        } else {
            last.next = newNode;
        }
    }

    public Node findFirst(int value) {
        Node cur = head.next;
        while (cur != null) {
            if (cur.value == value) return cur;
            cur = cur.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node pre = findFirst(preValue);
        if (pre == null) return false;
        Node newNode = new Node(newValue);
        newNode.next = pre.next;
        pre.next = newNode;
        return true;
    }

    public boolean delete(int value) {
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.value == value) {
                prev.next = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }
}
