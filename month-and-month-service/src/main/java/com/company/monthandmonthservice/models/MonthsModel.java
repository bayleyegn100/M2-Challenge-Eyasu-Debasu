package com.company.monthandmonthservice.models;

import java.util.Objects;

public class MonthsModel {
    private int monthNumber;
    private String monthInString;

    public MonthsModel(int monthNumber, String monthInString) {
        this.monthNumber = monthNumber;
        this.monthInString = monthInString;
    }

    public MonthsModel() {
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getMonthInString() {
        return monthInString;
    }

    public void setMonthInString(String monthInString) {
        this.monthInString = monthInString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthsModel that = (MonthsModel) o;
        return monthNumber == that.monthNumber && Objects.equals(monthInString, that.monthInString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthNumber, monthInString);
    }

    @Override
    public String toString() {
        return "MonthsModel{" +
                "monthNumber=" + monthNumber +
                ", monthInString='" + monthInString + '\'' +
                '}';
    }
}
