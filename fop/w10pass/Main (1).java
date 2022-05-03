package fop.w10pass;

class Main {

    public static void main(String[] args) {
        Password pwd = new Password(1, 5, 1, 1, 8, new char[]{'!', '?'});
        try {
            pwd.checkFormat("1DQWERR@weqwe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
