public class Practice {
        String myName;
        int practiceHours;
        int practiceDays;

        public Practice(String name, int hours, int days){
            myName = name;
            practiceHours = hours;
            practiceDays = days;
    }

    public static void main(String[] args){
            Practice everyday = new Practice("Nimesh", 4, 5);

            System.out.println(everyday.myName + " practices " + everyday.practiceHours + " hours, "
                    + everyday.practiceDays + " days a week.");
    }

}
