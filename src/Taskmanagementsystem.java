import java.util.*;
public class Taskmanagementsystem extends Task{
    Scanner sc=new Scanner(System.in);
   private ArrayList<Task> tasks=new ArrayList<>();
   HashSet<Task> tasklist=new HashSet<>();
    public Taskmanagementsystem() {
        System.out.println("Hi welcome to task management system");
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
//    public Task geturTask(int task_id){
//        int taskindex=0;
//           if(s.isEmpty()){
//               System.out.println("there  is no task assigned here");
//               }
//           else  if (s.contains(task_id)) {
//                System.out.println("Your task is available....");
//                System.out.println("please wait..........");
//                 taskindex=s.indexOf(task_id);
//               return tasks.get(taskindex);}
//           else{
//               System.out.println("enter crct task id");}
//                return null;}
    public Task geturTask(int taskId) {
        //System.out.println(tasks);
        for (Task task : tasks) {
            if (task.getTask_id()==taskId) {
                System.out.println(task);
                return task;
            }
        }
        return null;
    }

    public void update(Task task){
        int a=1;
        while(a==1){
     //   System.out.println("wait ur task is loding........");
    //    Task oldTask = geturTask(task.getTask_id());
    //    if(oldTask==null){
    //        System.out.println("your task is not in the list....can u create a new task...");}
     //   else{
      //      System.out.print("your old task is.......");
       //    String olderdec= task.getDescription();
       //     System.out.println("write you new task description");
        //    String newerdec=sc.next();
         //           task.setDescription(newerdec);
        tasklist.add(task);
        System.out.println("updated");
             break;}}

    public void deletetask(int id){
        System.out.println("do u surely want to delete the task.......");
        Task deltask=geturTask(id);
        if(deltask==null){
            System.out.println("your task is not found");}
        else{
        tasks.remove(deltask);
            System.out.println("your task is deleted .........");}}
    }

