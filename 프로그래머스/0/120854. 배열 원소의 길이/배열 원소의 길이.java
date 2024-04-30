class Solution {
    public int[] solution(String[] strlist) {
        int[] strslength = new int [strlist.length];
        for(int i = 0; i<strslength.length; i++) {
            strslength[i] = strlist[i].length();
        }
        return strslength;
    }
}