public class Droid {
    String name;
    int bateryLevel;

    public void droid(String droidName){
        bateryLevel = 100;
        name = droidName;
    }

    public void performTask(String task){
        System.out.println(name +" is performing task: " + task + ".");
        bateryLevel -= 10;
    }


    public static void main(String[] args) {
        Droid android = new Droid();
        android.droid("Codey");
        System.out.println(android.name);
        android.performTask("Dancing");
        System.out.println(android.bateryLevel);
    }

}
