package com.bfhl.service;

import com.bfhl.dto.BfhlRequest;
import com.bfhl.dto.BfhlResponse;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BfhlServiceImpl implements BfhlService {

    private static final String FULL_NAME = "daksh_kansal";
    private static final String DOB = "2004-08-06";
    private static final String EMAIL = "kansaldaksh101@gmail.com";
    private static final String ROLL_NUMBER = "2310990234";

    @Override
    public BfhlResponse processData(BfhlRequest request) {
        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alpha = new ArrayList<>();
        List<String> special = new ArrayList<>();
        long sum = 0;
        for(String item : request.getData()) {

            if(isNumber(item)) {

                long n = Long.parseLong(item);
                sum += n;

                if(n % 2 == 0)
                    even.add(item);
                else
                    odd.add(item);

            } else if(isAlpha(item)) {

                alpha.add(item.toUpperCase());

            } else {

                special.add(item);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String item : request.getData()) {
            if(isAlpha(item))
                sb.append(item);
        }

        String rev = sb.reverse().toString();

        StringBuilder concat = new StringBuilder();

        for(int i=0;i<rev.length();i++) {

            char c = rev.charAt(i);

            if(i % 2 == 0)
                concat.append(Character.toUpperCase(c));
            else
                concat.append(Character.toLowerCase(c));
        }

        BfhlResponse res = new BfhlResponse();

        res.setSuccess(true);
        res.setUserId(FULL_NAME + "_" + DOB);
        res.setEmail(EMAIL);
        res.setRollNumber(ROLL_NUMBER);
        res.setOddNumbers(odd);
        res.setEvenNumbers(even);
        res.setAlphabets(alpha);
        res.setSpecialCharacters(special);
        res.setSum(String.valueOf(sum));
        res.setConcatString(concat.toString());

        return res;
    }

    private boolean isNumber(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    private boolean isAlpha(String s) {
        return s.chars().allMatch(Character::isLetter);
    }
}
