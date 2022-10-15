public class Main {
    public static void main(String[] args) {

                Author tolstoi = new Author("Lev", "Tolstoi");
                Author pushkin = new Author("Alexander", "Pushkin");
                System.out.println("first.name = " + tolstoi.getFirstName());
                System.out.println("second.name = " + tolstoi.getSecondName());
                System.out.println("first.name = " + pushkin.getFirstName());
                System.out.println("second.name = " + pushkin.getSecondName());

                Book warAndPeace = new Book("War and Peace", tolstoi, 1970);
                Book EvgeniyOnegin = new Book("Evgeniy Onegin", pushkin, 1930);
                System.out.println("warAndPeace = " + warAndPeace.getName());
                System.out.println("warAndPeace = " + tolstoi.getFirstName() + " " +
                        tolstoi.getSecondName());
                System.out.println("warAndPeace = " + warAndPeace.getYear());
                System.out.println("EvgeniyOnegin = " + EvgeniyOnegin.getName());
                System.out.println("EvgeniyOnegin = " + pushkin.getFirstName() + " " +
                        pushkin.getSecondName());
                System.out.println("EvgeniyOnegin = " + EvgeniyOnegin.getYear());
                warAndPeace.setYear(1960);
                System.out.println("warAndPeace = " + warAndPeace.getYear());

            }
        }
