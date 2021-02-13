package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank
    private String customerName;

    @NotBlank
    @Numeric
    private String tel;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String oldPrefectureId;

    @NotBlank
    private String oldAddress;

    @NotBlank
    private String newPrefectureId;

    @NotBlank
    private String newAddress;

    @Numeric
    //@NotBlank
    private String box;

    @Numeric
    //@NotBlank
    private String bed;

    @Numeric
    //@NotBlank
    private String bicycle;

    @Numeric
    //@NotBlank
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }


    public String getBox() {
        if (box == "") return "0";
        else return box;
    }
    /*public String getBox() {return box;}*/

    /*public void setBox(String box) {
        if (box != "") {this.box = box;}
        else {this.box = "0";}
    }*/
    public void setBox(String box) {
        this.box = box;
    }


    public String getBed() {
        if (bed == "") return "0";
        else return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        if (bicycle == "") return "0";
        else return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        if (washingMachine == "") return "0";
        else return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
}
