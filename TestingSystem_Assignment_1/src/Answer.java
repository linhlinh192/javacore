public class Answer {
    int answerId;
    String content;
    Question question; // FK --> Object thay questionId
    boolean isCorrect;
}
