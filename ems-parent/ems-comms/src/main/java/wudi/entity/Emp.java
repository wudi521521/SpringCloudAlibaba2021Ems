package wudi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/25 20:08
 */
@Data
@Accessors(chain = true)
public class Emp {
    private String id;
    private String name;
    private String path;
    private String salary;
    private Integer age;
}
