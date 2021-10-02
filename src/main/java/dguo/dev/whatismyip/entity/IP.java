package dguo.dev.whatismyip.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class IP {
    private String IP;
    private Date timestamp;

}
