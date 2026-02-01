import java.time.LocalDate;

public class Exam {
    int examId;
    String code;
    String title;
    CategoryQuestion category; // FK --> Object thay categoryId
    int duration;
    Account creator; // FK --> Object thay creatorId
    LocalDate createDate;
}
