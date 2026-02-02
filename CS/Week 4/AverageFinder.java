public class AverageFinder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, введите имя пользователя");
        } else {
            String name = args[0];
            System.out.println("Привет, " + name + "!");
        }
    }

}