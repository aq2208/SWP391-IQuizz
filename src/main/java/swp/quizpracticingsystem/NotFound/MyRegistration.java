package swp.quizpracticingsystem.NotFound;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MyRegistration {
    private Date dateRegis;
    private String status;
    private String subName;
    private Integer cid;
    private Date validfrom;
    private String packageName;
    private Integer totalcost;
    private String regisId;
    private Date validTo;
}
