class practice{
    public static void main(String[] args) {
        Integer i1=new Integer(5);
        Integer i2=new Integer(5);
        Integer i3=Integer.valueOf(5);
        Integer i4=Integer.valueOf(5);


        System.out.println(i1==i2);
        System.out.println(i3==i4);
        

        String s1=new String("hi");
        String s2=new String("hi");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        s1="ih";
        System.out.println(s1.hashCode());
    }
}