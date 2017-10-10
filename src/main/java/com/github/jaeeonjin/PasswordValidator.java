package com.github.jaeeonjin;

/**
 * Created by JaeeonJin on 2017-10-10.
 */
public class PasswordValidator {

    private int minLength, maxLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validateMin(String password) {
        int length = password.length();
        if (length >= minLength) return true;
        else return false;
    }

    public boolean validateMax(String password) {
        int length = password.length();
        if (length <= maxLength) return true;
        else return false;
    }

//    테스트 클래스를 만들지 않을 때는 메인문으로 작성하는데 이건 별로 안좋음
//    public static void main(String[] args) {
//        PasswordValidator pv = new PasswordValidator(0, 3);
//        boolean result = pv.validate("123");
//        System.out.println(result);
//    }


}
