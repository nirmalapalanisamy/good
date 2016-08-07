public static boolean contains(int[] set1, int[] set2) {
    boolean contains = false;
    for (int i = 0; i < set1.length; i++) {
        for (int a = 0; a < set2.length - 1; a++) {
            if (set1[i] == set2[a] && set1[i + 1] == set2[a + 1]) {
                contains = true;
            } else {
                contains = false;
            }
        }
    }
    return contains;
}