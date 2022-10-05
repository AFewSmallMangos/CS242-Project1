package test;

public class TestClackClient {
    public static void main( String[] args ) {
        //Constructors
        main.ClackClient client1 = new main.ClackClient("user1", "host1", 2345);
        main.ClackClient client2 = new main.ClackClient();

        //Methods
        System.out.println( "UserName: " + client2.getUserName());
        System.out.println( "HostName: " + client2.getHostName());
        System.out.println( "Port : " + client1.getPort());

        //Overloads
        System.out.println( "Hash code comparison: " + client1.hashCode() + " vs. " + client2.hashCode());
        System.out.println( "Equality Comparison: " + client1.equals(client2));
        System.out.println( "Client as a String: " + client1.toString());

    }
}
