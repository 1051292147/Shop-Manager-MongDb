package com.fzw.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {
    @Id
    private String id;
    private String orderId;
    private String title;
    private String totalPay;
    private String actualPay;
    private int paymentTypeStatus;
    private String paymentTypeStatusStr;
    private String createTime;
    private String receiverAddress;
    private String receiverMobile;
    private String receiver;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getActualPay() {
        return actualPay;
    }

    public void setActualPay(String actualPay) {
        this.actualPay = actualPay;
    }

    public int getPaymentTypeStatus() {
//        if (paymentTypeStatusStr.equals("微信支付")){
//            paymentTypeStatus=0;
//        }else if (paymentTypeStatusStr.equals("支付宝支付")){
//            paymentTypeStatus=1;
//        }
        return paymentTypeStatus;
    }

    public void setPaymentTypeStatus(int paymentTypeStatus) {
        this.paymentTypeStatus = paymentTypeStatus;
    }

    public String getPaymentTypeStatusStr() {
        if (paymentTypeStatus==0){
            paymentTypeStatusStr="微信支付";
        }else if (paymentTypeStatus==1){
            paymentTypeStatusStr="支付宝支付";
        }
        return paymentTypeStatusStr;
    }

    public void setPaymentTypeStatusStr(String paymentTypeStatusStr) {
        this.paymentTypeStatusStr = paymentTypeStatusStr;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Order(String id, String orderId, String title, String totalPay, String actualPay, int paymentTypeStatus, String paymentTypeStatusStr, String createTime, String receiverAddress, String receiverMobile, String receiver) {
        this.id = id;
        this.orderId = orderId;
        this.title = title;
        this.totalPay = totalPay;
        this.actualPay = actualPay;
        this.paymentTypeStatus = paymentTypeStatus;
        this.paymentTypeStatusStr = paymentTypeStatusStr;
        this.createTime = createTime;
        this.receiverAddress = receiverAddress;
        this.receiverMobile = receiverMobile;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderId='" + orderId + '\'' +
                ", title='" + title + '\'' +
                ", totalPay='" + totalPay + '\'' +
                ", actualPay='" + actualPay + '\'' +
                ", paymentTypeStatus='" + paymentTypeStatus + '\'' +
                ", paymentTypeStatusStr='" + paymentTypeStatusStr + '\'' +
                ", createTime='" + createTime + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverMobile='" + receiverMobile + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
