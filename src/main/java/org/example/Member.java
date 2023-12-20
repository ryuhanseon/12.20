package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
public class Member {
    private int memberId;
    private String userId;
    private String password;
    private String passwordConfirm;

    Member(int memberId, String userId, String password, String passwordConfirm){
        this.memberId = memberId;
        this.userId = userId;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }

    public int getMemberId(){
        return this.memberId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public  String getPassword(){
        return this.password;
    }
    public String getPasswordConfirm(){
        return this.passwordConfirm;
    }

}