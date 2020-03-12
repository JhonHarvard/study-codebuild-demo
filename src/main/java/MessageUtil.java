/**
 * @Author fengshij
 * @E-mail fengshij@isoftstone.com
 * @Date 2020/3/12-2020
 * @Version
 * @Module
 * @Describe
 */
public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String salutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}