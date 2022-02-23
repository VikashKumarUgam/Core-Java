import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            if(branch.newCustomer(customerName,initialTransaction))
                return true;
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            if(branch.addCustomerTransaction(customerName,initialTransaction))
                return true;
        }
        return false;
    }

    private Branch findBranch(String name){
        for(int i =0 ; i<branches.size();i++){
            if(branches.get(i).getName().equals(name))
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+branchName);
            for(int i = 0; i<branch.getCustomers().size();i++){
                Customer customer = branch.getCustomers().get(i);
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                if(printTransactions) {
                    System.out.println("Transactions");
                    for(int j=0; j<customer.getTransactions().size();j++){
                        System.out.println("["+ (j+1) +"] Amount "+customer.getTransactions().get(j));
                    }
                }
            }

            return true;
        }
        return false;
    }
}
