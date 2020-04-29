public class hello {


    public static void main(String[] args){
        //boolean hasPrerequisite = true;
        boolean hasPrerequisite = false;

        if (hasPrerequisite) {
            // do nothing
        } else {
            System.out.println("Must complete prerequisite course!");
        }

        if (!hasPrerequisite) {
            System.out.println("this is noice!");
        }
        System.out.println("Hello world");
    }
}
