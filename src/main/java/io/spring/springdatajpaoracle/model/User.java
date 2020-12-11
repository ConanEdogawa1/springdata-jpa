package io.spring.springdatajpaoracle.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <H3></H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/6/30
 * @Time 5:49 下午
 * @Description No Description
 * @since
 */
@Data
@Entity
@Table(name = "t_user")
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName", length = 50)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "gender", length = 2)
    private Integer gender;

    @Column(name = "age", length = 3)
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "card_ID", length = 18)
    private String cardID;

    @CreatedDate
    @Column(name = "gmt_Create")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gmtCreate;

    @LastModifiedBy
    @Column(name = "gmt_Modified")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gmtModified;
}
