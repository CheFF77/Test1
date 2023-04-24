public class Practice1 {
    public static void checkUsername(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
    }

    private static void checkUserName(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}