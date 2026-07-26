package splitwise.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {

    private String groupId;
    private String groupName;
    private List<User>users=new ArrayList<>();
    private List<Expense>expenses=new ArrayList<>();

    public Group(String groupName){
        this.groupId=UUID.randomUUID().toString();
        this.groupName=groupName;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void addExpense(Expense expense){
        this.expenses.add(expense);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    
}
