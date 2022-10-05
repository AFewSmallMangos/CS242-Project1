package data;
public class MessageClackData extends ClackData {
    private String message;

    //Constructors
    public MessageClackData( String userName, String message, int type ){
        super( userName, type );
        this.message = message;
    }

    public MessageClackData(){
        super();
        this.message = null;
    }

    public String getData(){
        return this.message;
    }

    @Override
    public boolean equals(Object obj){

    }

    @Override
    public int hashCode(){

    }

    @Override
    public String toString(){
        return "UserName: " + getUserName() + "Date: " + this.getDate() + "Type: " + this.getType() + "Message: " + this.getData();
    }
}
