public class PrefixString {
    public static void main(String[] args) {
        String[] str = new String[]{"ab", "a"};

        String result = longestCommonPrefix(str);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            boolean present = false;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() > i && strs[j].charAt(i) == strs[0].charAt(i)){
                    present = true;
                } else {
                    return sb.toString();
                }
            }
            if(present){
                sb.append(strs[0].charAt(i));
            }
        }

        return sb.toString();
    }
}
