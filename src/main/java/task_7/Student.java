package task_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private String firstname;
    private String lastname;
    private String group;

    @Override
    public String toString() {
        return "\n{firstname: " + firstname + ", " +
                "lastname: " + lastname + ", " +
                "group: " + group + "}";
    }
}
