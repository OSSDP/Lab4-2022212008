public class Solution15 {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxLength = Math.max(v1.length, v2.length);
        for (int i = 0; i < maxLength; ++i) {
            int x = 0, y = 0;
            if (i < v1.length) {
                x = Integer.parseInt(v1[i]);
            }else{
                x=0;
            }
            if (i < v2.length) {
                y = Integer.parseInt(v2[i]);
            }else{
                y=0;
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }

}
