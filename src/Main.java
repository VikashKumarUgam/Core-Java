public class Main {
    public static void main(String[] args) {
        //Challenge 1: Different Ways to Create and Start Threads
        final BankAccount bankAccount = new BankAccount("12345-678",1000.00);
        Thread thread1 = new Thread(){
            public void run(){
                bankAccount.deposit(300);
                bankAccount.withdraw(100);
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100);
            }
        };

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300);
                bankAccount.withdraw(50);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100);
            }
        });
        thread3.start();
        thread4.start();
    }

    //    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
//    private Map<String,String> vocabulary = new HashMap<String,String>();
//
//    public Main() {
//        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
//        locations.put(2, new Location(2, "You are at the top of a hill"));
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
//        locations.put(4, new Location(4, "You are in a valley beside a stream"));
//        locations.put(5, new Location(5, "You are in the forest"));
//
//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("E", 3);
//        locations.get(1).addExit("S", 4);
//        locations.get(1).addExit("N", 5);
//
//        locations.get(2).addExit("N", 5);
//
//        locations.get(3).addExit("W", 1);
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//
//
//        vocabulary.put("NORTH","N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("EAST","E");
//        vocabulary.put("WEST","W");
//        vocabulary.put("QUIT","Q");
//
//    }
//
//    public void command() {
//        int loc = 1;
//        while(true){
//            System.out.println(locations.get(loc).getDescription());
//            if(loc == 0)
//                break;
//            Map<String,Integer> exits = locations.get(loc).getExits();
//            System.out.print("Available exits are ");
//            for(String exit: exits.keySet())
//                System.out.print(exit+", ");
//            System.out.println();
//            Scanner scanner = new Scanner(System.in);
//            String dir = scanner.nextLine().toUpperCase();
//            if(dir.length()>1){
//                String[] words = dir.split(" ");
//                for(String word: words){
//                    if(vocabulary.containsKey(word)){
//                        dir = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//            if(exits.containsKey(dir)) {
//                loc = exits.get(dir);
//
//            } else {
//                System.out.println("You cannot go in that direction");
//            }
//
//
//        }
//
//    }
}