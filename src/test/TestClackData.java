package test;

public class TestClackData {

    public static void main( String[] args ){

        //Testing for MessageClackData
        //Constructors
        data.MessageClackData message1 = new data.MessageClackData("user1", "Hello World", 2);
        data.MessageClackData message2 = new data.MessageClackData();

        //Methods
        System.out.println("Message reads: " + message1.getData);
        System.out.println("");

        //Overrides
        System.out.println("Message To String: " + message1.toString());
        data.MessageClackData message3 = new data.MessageClackData();
        System.out.println("Hash Code Comparison: " + message1.hashCode() + " vs. " + message3.hashCode());
        System.out.println();

        //Testing for FileClackData
        //Constructors
        data.FileClackData data1 = new data.FileClackData("user1", "Input_File", 2);
        data.FileClackData data2 = new data.FileClackData();

        //Methods
        data1.setFileName("New_Input_File");
        System.out.println("UserName: " + data1.getUserName());
        System.out.println("File Name: " + data1.getFileName());
        System.out.println("File Contents: "  + data1.getData());
        System.out.println("Type: " + data1.getType());
        System.out.println("Date: " + data1.getDate());

        //Overrides

    }
}
