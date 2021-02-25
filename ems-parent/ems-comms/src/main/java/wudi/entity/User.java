package wudi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 20:03
 */
@Data
@Accessors(chain = true)
public class User {
    private Integer id;
    private String username;
    private String realname;
    private String password;
    private String sex;
    private String status;
    private Date registerTime;
}
