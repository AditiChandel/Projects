import java.util.Date;

public class FileVersion {
    private String filename;
    private String content;
    private Date timestamp;

    // Constructor to initialize the file version
    public FileVersion(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.timestamp = new Date();
    }

    // Getters and Setters
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "File: " + filename + "\nTimestamp: " + timestamp.toString();
    }
}
