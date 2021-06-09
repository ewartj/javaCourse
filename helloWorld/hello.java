public class hello {

    public static void main(String[] args){
        System.out.println("Hello, Dave");

        int myFirstNumber = (10 + 5)  + (10 * 2);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
        public void whatIsNameInYear(String name, int year, int newYear, String gender) {
            int rank = getRank(year, name, gender);
            String newName = getName(newYear, rank, gender);
            System.out.println(name + "born in " + year + " would be " + newName + " in " + newYear);
        }

        public void teatWhatIsNameInYear() {
            int year = 2012;
            int newYear = 2014;
            String gender = "F";
            String name = "Isabella";
            whatisNameInYear(name, year, newYear, gender);
        }
    }
}
