import java.time.LocalDate;

public class Question {
    int questionId;
    String content;
    CategoryQuestion category; // FK --> Object thay categoryId
    TypeQuestion type; // FK --> Object thay typeId
    Account creator; // FK --> Object thay creatorId
    LocalDate createDate;
}
