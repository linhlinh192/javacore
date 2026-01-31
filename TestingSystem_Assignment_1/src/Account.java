import java.time.LocalDate;

public class Account {
    int accountId;
    String email;
    String userName;
    String fullName;
    LocalDate createDate;
    Department department; // FK --> Object thay departmentId
    Position posion; // FK --> Object thay positionId
}
