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
        if(obj == null){
            return false;
        }else if(!(obj instanceof MessageClackData)) {
            return false;
        }

        MessageClackData comparisonMessage = (MessageClackData) obj;
        return this.getData() == comparisonMessage.getData() &&
                this.getDate() == comparisonMessage.getDate() &&
                this.getType() == comparisonMessage.getType() &&
                this.getUserName() == comparisonMessage.getUserName();

    }

    @Override
    public int hashCode(){
        int thisHash = 11;
        if( this.message == null){
            thisHash = thisHash * 31;
        } else {
            thisHash = thisHash * 31 + this.message.hashCode();
        }
        thisHash = thisHash * 31 + this.getUserName().hashCode();
        thisHash = thisHash * 31 + this.getType();

        return thisHash;
    }

    @Override
    public String toString(){
        return "UserName: " + getUserName() + "Date: " + this.getDate() + "Type: " + getType() + "Message: " + this.getData();
    }
}
