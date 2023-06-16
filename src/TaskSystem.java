import com.sun.security.jgss.GSSUtil;

import java.time.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class TaskSystem {
    public static void main(String[] args) {
        Taskmanagementsystem mana=new Taskmanagementsystem();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Task Management System");
            System.out.println("1. Add a task");
            System.out.println("2. Retrieve task");
            System.out.println("3. Update the task");
            System.out.println("4. Delete task");
            System.out.println("5.close the task");
            System.out.print(" eneter any one number..............: ");
            int c = sc.nextInt();
            switch(c) {
                case 1:
                    System.out.print("enter Id:");
                    int taskId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("enter description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter status: ");
                    String status = sc.nextLine();

                    System.out.print("Enter due date in the form of  (yyyy-MM-dd): ");
                    String duedate = sc.nextLine();

                    int a = 1;
                    try {
                        LocalDate date = LocalDate.parse(duedate);
                        System.out.println("Valid date: " + date);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format: " + duedate);
                        a = 0;
                    }
//                    if (a == 0) {
//                        System.out.println("please input valid date");
//                        break;}else{

                        Task task = new Task(taskId, description, status, duedate);
                        mana.addTask(task);

                    break;
                case 2:
                    System.out.print("EnterID: ");
                    int reId = sc.nextInt();

                    Task getTask = mana.geturTask(reId);
                    if (getTask != null) {
                        System.out.println("your Task ID is...... " + getTask.getTask_id());
                        System.out.println("your Description is........ " + getTask.getDescription());
                        System.out.println("your Status is......." + getTask.getStatus());
                        System.out.println("Due date is.....pls complete the tsk within due date" + getTask.getDuedate());
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter task ID: ");
                    int updateTaskId = sc.nextInt();

                    Task updatedTask = mana.geturTask(updateTaskId);
                    System.out.println(updatedTask);
                    if (updatedTask != null) {
                        System.out.print("Enter the updated task description please......: ");
                        String newDesc = sc.nextLine();
                        sc.next();

                        updatedTask.setDescription(newDesc);

                        System.out.print("Enter new task status: ");
                        String newStatus = sc.nextLine();
                        sc.next();
                        updatedTask.setStatus(newStatus);

                        System.out.print("Enter new task due date (yyyy-MM-dd) make enure that due date is correct format....: ");
                        String newDueDateStr = sc.nextLine();
                        sc.next();
                        mana.update(updatedTask);


            }
                    break;
                case 4:
                    System.out.print("Enter task ID: ");
                    int deleteTaskId = sc.nextInt();
                    mana.deletetask(deleteTaskId);
                    break;

                case 5:
                    System.out.println("again use this system to add  and update the task......");
                    break;
                default:
                    System.out.println("Invalid input enter the number from 1 to 5 only......");
                    break;



            }

        }}}

