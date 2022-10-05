package test;

public class TestClackServer {
    public static void main( String[] args ) {

        //Constructors
        main.ClackServer server1 = new main.ClackServer( 3456 );
        main.ClackServer server2 = new main.ClackServer();

        //Methods
        System.out.println("Port: " + server1.getPort());

        //Overrides
        main.ClackServer server3 = new main.ClackServer();
        System.out.println("Hash Codes: " + server2.hashCode() + " vs. " + server3.hashCode());
        System.out.println("Equality Comparison: " + server1.equals(server2));
        System.out.println("Server as a String: " + server1.toString());
    }
}
