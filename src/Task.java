import java.util.*;
public class Task {
    ArrayList<Integer> s=new ArrayList<Integer>();
        private int Task_id;
        private String description;
        private String status;
        private String duedate;
        Task(){
            System.out.println("complete the task");
        }

    public Task(int task_id, String description, String status, String duedate) {
        Task_id = task_id;
        s.add(task_id);
        this.description = description;
        this.status = status;
        this.duedate = duedate;
    }

    public int getTask_id() {
        return Task_id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setTask_id(int task_id) {
        Task_id = task_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}


