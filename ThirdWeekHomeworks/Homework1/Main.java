package ThirdWeekHomeworks.Homework1;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Room room1 = addARoom(30, 10, 10, store);
        System.out.println("Depodaki Elma Sayısı : " + store.getElma());
        System.out.println("Room1'deki Elma Sayısı : " + room1.getRoom1Apple());
        Room room2 = addARoom(20, 40, 40, store);
        System.out.println("Depodaki Elma Sayısı : " + store.getElma());
        System.out.println("Room2'deki Elma Sayısı : " + room2.getRoom1Apple());
        room1.buyApple();
        System.out.println("Room1'de alışveriş sonrası kalan Elma Sayısı : " + room1.getRoom1Apple());
        room2.buyPear();
        System.out.println("Room2'de alışveriş sonrası kalan Armut Sayısı : " + room2.getRoom1Pear());
        // System.out.println("Room1'de Elma Alışverişi Yapıldıktan sonra depoda kalan
        // elma sayısı : "
        // + store.getElma() + "Room1 de kalan elma sayısı :" +
        // store.room1.getRoom1Apple());

    }

    public static Room addARoom(int roomApple, int roomPear, int roomCherry, Store store) {
        int amountApple = store.getElma() - roomApple;
        int amountPear = store.getArmut() - roomPear;
        int amountCherry = store.getKiraz() - roomCherry;
        if (amountApple < 0) {
            // throw new AliException("Depoda Yeterli Elma Yoktur !");
            System.out.println("Depoda Yeterli Elma Yoktur !");
            System.exit(amountApple);
        }
        if (amountPear < 0) {
            // throw new AliException("Depoda Yeterli Elma Yoktur !");
            System.out.println("Depoda Yeterli Armut Yoktur !");
            System.exit(amountPear);
        }
        if (amountCherry < 0) {
            // throw new AliException("Depoda Yeterli Elma Yoktur !");
            System.out.println("Depoda Yeterli Kiraz Yoktur !");
            System.exit(amountCherry);
        }

        Room room1 = new Room(roomApple, roomPear, roomCherry);
        store.setElma(store.getElma() - room1.getRoom1Apple());
        store.setArmut(store.getArmut() - room1.getRoom1Pear());
        store.setArmut(store.getKiraz() - room1.getRoom1Cherry());
        return room1;
    }

}
