package io.spring.springdatajpaoracle.utils;

/**
 * <H3>响应消息封装</H3>
 * <p></p >
 *
 * @author yiwen zhai
 * @Date 2020/7/1
 * @Time 2:13 下午
 * @Description No Description
 * @since
 */
public class ResponseVO<T> {

    /**
     * 响应码
     */
    private Integer responseCode = ResponseMsg.ResponseCode.SUCCESS.getCode();

    /**
     * 相应消息，默认成功
     */
    private String responseMessage = ResponseMsg.ResponseCode.SUCCESS.getMessage();

    /**
     * 返回的数据
     */
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(T data) {
        this.data = data;
    }

    /**
     * 返回带有自定义错误码的消息体
     *
     * @param errCode 错误码
     * @param message 错误消息
     * @return ResponseVO<T> 实体
     */
    public ResponseVO<T> error(int errCode, String message) {
        this.responseCode = errCode;
        this.responseMessage = message;
        return this;
    }

    /**
     * 返回固定的错误消息体
     *
     * @param message 自定义消息
     * @return ResponseVO<T> 实体
     */
    public ResponseVO<T> error(String message) {
        return this.error(ResponseMsg.ResponseCode.UNKNOWN_WARNING.getCode(), message);
    }

    /**
     * 参数错误
     *
     * @param message 当参数错误后返回前台的友好提升
     * @return
     */
    public ResponseVO<T> parameterError(String message) {
        return this.error(ResponseMsg.ResponseCode.PARAM_WARNING.getCode(), message);
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
