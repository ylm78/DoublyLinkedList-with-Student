public class Main {
    public static void main(String[] args) {
        Student st = new Student(), st2 = new Student();
        st.setId(20210709);
        st.setEmail("arifxhakan78@gmail.com");
        st.setName("arif");
        Node newNode = new Node(st);
        DoublyLinkedList dLL = new DoublyLinkedList();
        dLL.addToFront(st);
        dLL.printStudents();
        st2.setId(20210708);
        st2.setEmail("yannito78@gmail.com");
        st2.setName("yann");
        dLL.addToFront(st2);
        dLL.printStudents();
    }
}