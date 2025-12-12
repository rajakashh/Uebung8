package h2;

public class H2_main {
    public static void main(String[] args) {
        SimpleList myList = new SimpleList();
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Initial list:");
        printList(myList);

        myList.insertAfter(45, 4);
        System.out.println("After insertAfter(45,4):");
        printList(myList);

        Node found = myList.findFirst(45);
        System.out.println("findFirst(45) -> " + (found != null ? found.value : "null"));

        myList.delete(45);
        System.out.println("After delete(45):");
        printList(myList);
    }

    static void printList(SimpleList l) {
        StringBuilder sb = new StringBuilder();
        Node n = l.getFirst();
        boolean first = true;
        while (n != null) {
            if (!first) sb.append(",");
            sb.append(n.value);
            first = false;
            n = n.next;
        }
        System.out.println(sb.toString());
    }
}
