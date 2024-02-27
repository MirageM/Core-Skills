class DynamicArray {
    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) { 
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(length == capacity){
            resize();
        }
        this.arr[length++] = n;
    }

    public int popback() {
        if(length > 0){
            length--;
        }
        return this.arr[length];
    }

    private void resize() { 
        this.capacity *= 2;
        int[] newArr = new int[capacity];
        for(int i = 0; i < length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
