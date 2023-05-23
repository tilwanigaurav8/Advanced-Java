public class beanimp {
    public static void main(String[] args){
        bean b=new bean();
        b.setName("Gaurav Tilwani");
        b.setTech("Web Development");
        b.setRoll(10429);
        b.toString();
        String t=b.getTech();
        System.out.println(b);
        System.out.println(t);
    }
}
