public class Node {
    public Node next;
    public Node previous;
    public Student student;

    public Node(Student student){
        this.next = null;
        this.previous = null;
        this.student = student;
    }

}
