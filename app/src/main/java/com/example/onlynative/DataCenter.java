package com.example.onlynative;

public class DataCenter {
  String number;
  String text;


  private static DataCenter instance = new DataCenter();
  //private construct
  private DataCenter() {
    number="dirty";
    text="shit";
  }

  public static DataCenter getInstance() {
    return instance;
  }

  public String getNumber() {
    return number;
  }

  public String getText() {
    return text;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setText(String text) {
    this.text = text;
  }
}
