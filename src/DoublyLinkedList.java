import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Premier constructeur qui initialise les éléments à null et 0
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /*public void add(Student s){
        Node newNode = new Node(s); // Crée un nouveau noeud avec l'étudiant donnée.
        // Si la tail est vide, le nouveau noeud devient la queue et la tête
        if(tail == null){
            tail = newNode;
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

    }*/

    public void addToFront(Student s){
        int newId = s.getId();
        if(isDuplicateId(newId)){
            System.out.println("Student with ID " + newId + " already exists. Duplicate IDs are not allowed.");
            return;
        }
        Node newNode = new Node(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head; // Met le noeud de base en tant que suivant du noeud newNode
            head.previous = newNode; // Met le précédent du noeud de base au noeud newNode
            head = newNode; // Met à jour la tête à newNode
        }
    }

    public void addToBack(Student s){
        int newid = s.getId();
        if(isDuplicateId(newid)){
            System.out.println("Student with ID " + newid + " already exists. Duplicate IDs are not allowed.");
            return;
        }
        Node newNode = new Node(s);
        if(head == null){
            head = newNode;
            tail =newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void remove(int studentId){
        Node current = head;
        while(current!=null){
            if(current.student.getId()==studentId){
                if(current==head){
                    head = current.next;
                if(head!=null){
                    head.previous = null;
                }
                } else if (current==tail) {
                    tail = current.previous;
                    tail.next = null;
                }else{
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                return;
            }
            return;
        }
        current= current.next;
    }

    public Student find(String name){
        Node current = head;
        while(current!=null){
            if(current.student.getName().equalsIgnoreCase(name)){
                return current.student;
            }
            current = current.next;
        }
        return null;
    }

    public void modifyEmail(String name, String newEmail){
        Node current = head;
        while(current!=null){
            if (current.student.getName().equalsIgnoreCase(name)) {
                current.student.setEmail(newEmail);
                return;
            }
            current = current.next;
        }
    }

    public void printStudents(){
        Node current = head;
        while(current!=null){
            System.out.println("Name: " + current.student.getName() + ", ID: " + current.student.getId() + ", Email: " + current.student.getEmail());
            current = current.next;
        }
    }

    public void printStudentsBackwards(){
        Node current = tail;
        while(current!=null){
            System.out.println("Name: " + current.student.getName() + ", ID: " + current.student.getId() + ", Email: " + current.student.getEmail());
            current = current.previous;
        }
    }

    public boolean isDuplicateId(int studentId){
        Node current = head;
        while(current!=null){
            if(current.student.getId() == studentId){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void sortedStudents(){
        List<Student> studentArrayList = new ArrayList<>();
        Node current = head;
        while (current != null) {
            studentArrayList.add(current.student);
            current=current.next;
        }
        studentArrayList.sort(Comparator.comparingInt(Student::getId));

        head =null;
        tail=null;
        for(Student st : studentArrayList){
            addToBack(st);
        }
    }
}
