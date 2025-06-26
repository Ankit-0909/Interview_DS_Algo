public class Addition{
    public static void main(String[] args) {
        //  ----> sum of all element of an array
        int [] marks = {2,4,3,6,8 };
        int sum = 0;
        // for(int element:marks){
        //  sum = sum + element;
        //}
        //System.out.println(sum);
        for(int i = 0;i<marks.length;i++){
            sum = sum +marks[i];
        }
        System.out.println(sum);
        System.out.println(marks.length);
    }
}
