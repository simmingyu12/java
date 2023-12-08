package JavaStudy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//employee 클래스
public class Emp {
    
    private int employeeId;
    private String firstName;
    private int salary;
}
