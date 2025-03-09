class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this(val, null);
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head.next;
        while(curr != null){
            if(i == index){
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;
        if(newNode.next == null){
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        ListNode curr = this.head;
        int i = 0;
        while(i < index && curr != null){
            curr = curr.next;
            i++;
        }
        if(curr != null && curr.next != null){
            if(curr.next == tail){
                tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode curr = this.head.next;
        while(curr != null){
            result.add(curr.val);
            curr = curr.next;
        }
        return result;
        
    }
}
