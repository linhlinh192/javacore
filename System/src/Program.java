import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
//      Account --- khoi tao doi tuong cho account
        Account acc1 = new Account();
        acc1.accountID = 10;
        acc1.fullName = "Nguyen A";

        Account acc2 = new Account();
        acc2.accountID = 11;
        acc2.email = "abc@gmail.com";

        Account acc3 = new Account();
        acc3.accountID = 12;
        acc3.createDate = LocalDateTime.now();

//      Department --- khoi tao doi tuong cho department
        Department depart1 = new Department();
        depart1.departmentID = 1;
        depart1.departmentName = "Marketing";

        Department depart2 = new Department();
        depart2.departmentID = 2;
        depart2.departmentName = "HR";

        Department depart3 = new Department();
        depart3.departmentID = 3;
        depart3.departmentName = "Sale";

//      in ra gia tri cua moi doi tuong
        System.out.println("Your email account is:" + acc2.email);
        System.out.println("Your department is:" + depart2.departmentName);
    }
}
