package com.github.jaeeonjin.passwordvalidator;

import com.github.jaeeonjin.PasswordValidator;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 메소드 우클릭 후 실행으로도 부분 실행 가능.
 * Created by JaeeonJin on 2017-10-10.
 */
public class PasswordValidatorTest {

    private String testPW = "jaeeonjin";

    private static PasswordValidator pv;
    private static int minLen = 5;
    private static int maxLen = 10;

    @BeforeClass
    public static void init() {
        pv = new PasswordValidator(minLen, maxLen);
    }

    @Test
    public void 미니멀랭_지정값보다크면_테스트_성공() {
        boolean result = pv.validateMin(testPW);
        assertTrue(result);
    }

    @Test
    public void 맥스랭_지정값보다작으면_테스트_성공() {
        boolean result = pv.validateMax(testPW);
        assertTrue(result);
    }

    @Test
    public void 패스워드가_어드민이면_테스트_실패() {
        assertNotEquals("admin", testPW);
    }

    @Test
    public void 패스워드가_널이면_테스트_실패() {
        assertNotNull(testPW);
    }

    @Test
    public void 패스워드가_빈_문자열이면_테스트_실패() {
        assertFalse(testPW.length() == 0);
    }
}
