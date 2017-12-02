package io.noep.security.web.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Taehoon Yoo
 * User  : taehoon
 * Date  : 2017. 12. 2.
 * Time  : 오후 2:11
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */

public class LoginForm {

    @NotBlank
    private String id;
    @NotBlank
    private String password;

    public LoginForm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
