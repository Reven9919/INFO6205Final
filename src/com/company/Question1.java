package com.company;

class Question1 {
    public String compressString(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuffer ans = new StringBuffer();
        int cnt = 1;
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); ++i) {
            if (ch == str.charAt(i)) {
                cnt++;
            } else {
                ans.append(ch);
                ans.append(cnt);
                ch = str.charAt(i);
                cnt = 1;
            }
        }
        ans.append(ch);
        ans.append(cnt);
        return ans.length() >= str.length() ? str : ans.toString();
    }
}

