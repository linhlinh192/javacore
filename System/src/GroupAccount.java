import java.time.LocalDateTime;

public class GroupAccount {
    Group groupID;         // FK → Object
    Account accountID;     // FK → Object
    LocalDateTime joinDate;
}
