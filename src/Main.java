public class Main {
    public static void main(String[] args) {
        int[] plants = {7,7,7,7,7,7,7};
        int lastIndex = plants.length-1;
        int forwardStep = 0;
        int totalStep = 0;
        int capacity = 0;
        boolean check = true;
        int count = 0;
        while (check){
            capacity =8;
            for(int i=0; i<plants.length; i++){
                if(capacity>=plants[count] && count<plants.length-1){
                    capacity=capacity-plants[count];
                    count++;
                    forwardStep++;
                }
            }
            if(capacity<plants[count]){
                totalStep+=forwardStep*2;
            }
            if(count==lastIndex){
                totalStep+=count+1;
                check=false;
            }
        }
        System.out.println(totalStep);
    }
}
