package data;
public class FileClackData extends ClackData{
    //Variables
    private String fileName;
    private String fileContents;

    //Constructors
    public FileClackData( String userName, String fileName, int type ){
        super(userName, type);
        this.fileName = fileName;
        this.fileContents = null;
    }

    public FileClackData(){
        super();
        this.fileName = null;
        this.fileContents = null;
    }

    //Methods
    public void setFileName( String fileName ){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public String getData(){
        return this.fileContents;
    }

    //Yet to be filled
    public void readFileContents(){}

    public void writeFileContents(){}

    @Override
    public int hashCode(){ //Generates a unique hash code based on File information; each unique file should have a unique hash code
        int thisHash = 12;
        if( this.fileName == null ){
            thisHash = thisHash * 32;
        } else {
            thisHash = thisHash * 32 + this.fileName.hashCode();
        }
        if( this.fileContents == null ){
            thisHash = thisHash * 32;
        } else {
            thisHash = thisHash * 32 + this.fileContents.hashCode();
        }
        thisHash = thisHash * 32 + getUserName().hashCode();
        thisHash = thisHash * 32 + getType();

        return thisHash;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) {
            return false;
        }else if(!(obj instanceof FileClackData)){
            return false;
        }

        FileClackData comparisonFile = (FileClackData) obj;
        //If all File parameters are equal, the two files should return true
        return this.getFileName() == comparisonFile.getFileName() &&
                this.getData() == comparisonFile.getData() &&
                this.getType() == comparisonFile.getType() &&
                this.getUserName() == comparisonFile.getUserName();
    }

    @Override
    public String toString(){ //Spits out all file parameters as a string
        return "FileName: " + this.getFileName() + "File Contents: " + this.getData();
    }
}
