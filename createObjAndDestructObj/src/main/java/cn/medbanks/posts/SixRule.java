package cn.medbanks.posts;

import java.util.regex.Pattern;

/**
 * The type Six rule.
 *
 * @author weaving
 * @since 2021 /1/15 17:00
 */
public class SixRule {


    /**
     * 正确做法
     */
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]IV?I{0,3})$");

    /**
     * 每次调用都要创建一个pattern 实例，因此性能上有很多问题
     *
     * @param s the s
     * @return boolean boolean
     */
    static boolean isRomanNumeral(String s) {

        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]IV?I{0,3})$");
    }

    /**
     * Is roman numeral 2 boolean.
     *
     * @param s the s
     * @return the boolean
     */
    static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
