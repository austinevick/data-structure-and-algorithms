public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){

        //if the array is full, resize it
        if (items.length==count){
            //create a new array (twice the size)

        }

        //Add the new item at the end
        items[count++]=item;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
