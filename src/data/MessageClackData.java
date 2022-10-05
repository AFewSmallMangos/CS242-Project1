package data;
public class MessageClackData extends ClackData {
    private String message;

    //Constructors
    public MessageClackData( String userName, String message, int type ){
        super( userName, type ); //Calls ClackData
        this.message = message; //sets message, which ClackData can't do
    }

    //Default Constructor
    public MessageClackData(){
        super();
        this.message = null;
    }

    public String getData(){
        return this.message;
    } //Returns message

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }else if(!(obj instanceof MessageClackData)) {
            return false;
        }

        MessageClackData comparisonMessage = (MessageClackData) obj;
        //If all the parameters for Message are the same, the two message data should be equal
        return this.getData() == comparisonMessage.getData() &&
                this.getDate() == comparisonMessage.getDate() &&
                this.getType() == comparisonMessage.getType() &&
                this.getUserName() == comparisonMessage.getUserName();

    }

    @Override
    public int hashCode(){ //Generates a hash code based on information in the message; each unique message should have a unique hash code
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
    public String toString(){ //Spits out all parameters in a string format
        return "\nUserName: " + getUserName() + "\nDate: " + this.getDate() + "\nType: " + getType() + "\nMessage: " + this.getData();
    }
}
