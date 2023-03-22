public class App {
    public static void main(String[] args) throws Exception {

        User user =  new User();

        user.setName("ANDRE");
        user.setEmail("andremacena@gmail.com");
        user.getCollege().setName("Universidade Federal FLuminense");
        user.getCollege().setState("Rj");
        user.getCollege().setCity("Niterói");

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getCollege().getName());
        System.out.println(user.getCollege().getState());
        System.out.println(user.getCollege().getCity());
    }
}
