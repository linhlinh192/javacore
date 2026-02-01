import java.time.LocalDate;

public class GroupAccount {
    Group group; // FK --> Object thay groupId
    Account account; // FK --> Object thay accountId
    LocalDate joinDate;
}
