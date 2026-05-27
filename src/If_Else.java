public class If_Else {

    public static void main(String[] args) {
        boolean isloggedin = true;
        boolean isadmin = false;
        int security = 2;

        if (isloggedin && (isadmin || security < 3)) {
            System.out.println("Access granted");
        }

        else {
            System.out.println("access denied");
        }
    }
}
