package tugas.praktikum5_modul5;

public class No1_SinglyLinkedListNonCircular {
    // Singly Linked List Non Circular
    
    public static void main(String[] ar)
    {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.1 Singly Linked List Non Circular");

        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
}
  
