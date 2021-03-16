package homeworkJUnitIntro;

public class StringPractiseHw {

    public static String getStrReverse(String str) {
        if (str == null || str.isEmpty())
            return null;
        //  str = str.toLowerCase().trim();
        str = str.trim();

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.equalsIgnoreCase(str))
                output = str.charAt(i) + output;

        }
        return output;
    }

    public static int getCountWords(String sent, String word) {
        if(sent==null||word==null|| sent.isEmpty()||word.isEmpty())
            return -1;
        int count = 0;
      /*  for (int i = 0; i < sent.length(); i++) {
            if (sent.equals(word)) {
                count++;
            }
        }*/
        return 0;
    }

}

