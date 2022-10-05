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
    public setFileName( String fileName ){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public String getData(){
        return this.fileContents;
    }

    public void readFileContents(){}

    public void writeFileContents(){}

    @Override
    public int hashCode(){

    }

    @Override
    public boolean equals(Object obj){

    }

    @Override
    public String toString(){
        return "FileName: "
    }
}
