package net.nextabc.validator.testers;

import net.nextabc.validator.EmptyableTester;
import net.nextabc.validator.Texts;

/**
 * @author 陈哈哈 (bitschen@163.com)
 * @since 1.0.0
 */
public class UnixTimestampTester extends EmptyableTester {

    private static final int LENGTH = String.valueOf(System.currentTimeMillis() / 1000).length();

    @Override
    public boolean testNotEmptyValue(Options opts, String value) throws Exception {
        return LENGTH == value.length() && Texts.isDigits(value);
    }
}
