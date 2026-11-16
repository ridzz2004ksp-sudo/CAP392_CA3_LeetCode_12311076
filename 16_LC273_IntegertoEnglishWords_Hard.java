class Solution {

    String[] ones = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };
    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };

    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {

            int group = num % 1000;

            if (group != 0) {

                String part = convert(group);

                if (!thousands[i].equals("")) {
                    part = part + " " + thousands[i];
                }

                if (!words.equals("")) {
                    part = part + " " + words;
                }

                words = part;
            }

            num = num / 1000;
            i++;
        }

        return words;
    }

    public String convert(int num) {
        String result = "";
        if (num >= 100) {
            result = ones[num / 100] + " Hundred";
            num = num % 100;

            if (num != 0) {
                result = result + " " + convert(num);
            }
        }
        else if (num >= 20) {
            result = tens[num / 10];

            if (num % 10 != 0) {
                result = result + " " + ones[num % 10];
            }
        }
        else if (num > 0) {

            result = ones[num];
        }

        return result;
    }
}
