public class Commit {
    private String message;
    private FileVersion fileVersion;

    // Constructor to initialize commit with message and file version
    public Commit(String message, FileVersion fileVersion) {
        this.message = message;
        this.fileVersion = fileVersion;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FileVersion getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(FileVersion fileVersion) {
        this.fileVersion = fileVersion;
    }
}
