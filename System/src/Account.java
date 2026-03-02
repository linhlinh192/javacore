import java.time.LocalDateTime;

public class Account {
    int accountID;
    String email;
    String userName;
    String fullName;
    Department departmentID;   // FK → Object
    Position positionID;       // FK → Object
    LocalDateTime createDate;

    Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentID=" + departmentID +
                ", positionID=" + positionID +
                ", createDate=" + createDate +
                '}';
    }
}
