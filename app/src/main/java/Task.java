public class Task {
    public String id, userId, description, creationDate, dueDate, postponeTo;
    public int urgency, status;

    public Task() {} // Empty constructor for Firebase

    public Task(String id, String userId, String description, String creationDate,
                String dueDate, String postponeTo, int urgency, int status) {
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.postponeTo = postponeTo;
        this.urgency = urgency;
        this.status = status;
    }
}
