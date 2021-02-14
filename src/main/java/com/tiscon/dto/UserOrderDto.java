package com.tiscon.dto;

public class UserOrderDto {

    private String customerName;

    private String tel;

    private String email;

    private String oldPrefectureId;

    private String oldAddress;

    private String newPrefectureId;

    private String newAddress;

    private String moveDate;

    private String moveYear;

    private String moveMonth;

    private String moveDay;

    private String box;

    private String bed;

    private String bicycle;

    private String washingMachine;

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

    public String getMoveDate() { return moveDate; }

    public void setMoveDate(String moveDate) { this.moveDate = moveDate; }

    public String getMoveYear() {
        String[] dayArray = this.moveDate.split("-");
        return dayArray[0];
    }

    public void setMoveYear(String moveYear) { this.moveYear = moveYear; }

    public String getMoveMonth() {
        String[] dayArray = this.moveDate.split("-");
        return dayArray[1];
    }

    public void setMoveMonth(String moveMonth) { this.moveMonth = moveMonth; }

    public String getMoveDay() {
        String[] dayArray = this.moveDate.split("-");
        return dayArray[2];
    }

    public void setMoveDay(String moveDay) { this.moveDay = moveDay; }

    /*
    public String getMonth() {
        String[] dayArray = this.moveDay.split("-");
        return dayArray[1];
    }*/

    public int getBox() {
        return Integer.parseInt(box);
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getBed() {
        return Integer.parseInt(bed);
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getBicycle() {
        return Integer.parseInt(bicycle);
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public int getWashingMachine() {
        return Integer.parseInt(washingMachine);
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(Boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
}
