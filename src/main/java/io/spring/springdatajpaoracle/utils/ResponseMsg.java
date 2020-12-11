package io.spring.springdatajpaoracle.utils;

/**
 * <H3>返回消息</H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 2:13 下午
 * @Description Controller响应返回的消息和Code
 * @since 1.0
 */
public class ResponseMsg {

    public enum ResponseCode{
        SUCCESS(0, "成功"),
        PARAM_WARNING(1, "参数错误"),
        DB_WARNING(2, "数据库异常"),
        CODE_WARNING(3, "代码运行异常"),
        UNKNOWN_WARNING(4, "未知异常");

        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        ResponseCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
