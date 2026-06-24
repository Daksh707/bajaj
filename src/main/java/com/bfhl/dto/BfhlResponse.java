package com.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BfhlResponse {
    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("odd_numbers")
    private List<String> oddNumbers;

    @JsonProperty("even_numbers")
    private List<String> evenNumbers;

    @JsonProperty("alphabets")
    private List<String> alphabets;

    @JsonProperty("special_characters")
    private List<String> specialCharacters;

    @JsonProperty("sum")
    private String sum;

    @JsonProperty("concat_string")
    private String concatString;

    public boolean isSuccess() { return isSuccess; }
    public void setSuccess(boolean s) { isSuccess = s; }
    public String getUserId() { return userId; }
    public void setUserId(String u) { userId = u; }
    public String getEmail() { return email; }
    public void setEmail(String e) { email = e; }
    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String r) { rollNumber = r; }
    public List<String> getOddNumbers() { return oddNumbers; }
    public void setOddNumbers(List<String> l) { oddNumbers = l; }
    public List<String> getEvenNumbers() { return evenNumbers; }
    public void setEvenNumbers(List<String> l) { evenNumbers = l; }
    public List<String> getAlphabets() { return alphabets; }
    public void setAlphabets(List<String> l) { alphabets = l; }
    public List<String> getSpecialCharacters() { return specialCharacters; }
    public void setSpecialCharacters(List<String> l) { specialCharacters = l; }
    public String getSum() { return sum; }
    public void setSum(String s) { sum = s; }
    public String getConcatString() { return concatString; }
    public void setConcatString(String s) { concatString = s; }
}
