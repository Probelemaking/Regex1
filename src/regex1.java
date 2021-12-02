public class regex1 {
    public static void main(String[] args) {
        String a="1563435@qq.com";
        boolean matches=a.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        System.out.println(matches);
    }
}
