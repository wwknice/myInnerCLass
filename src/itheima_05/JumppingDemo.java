package itheima_05;

public class JumppingDemo {
    public static void main(String[] args){
        //需求：创造接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat() {
            @Override
            public void method(Jumpping j2) {

            }
        };
        jo.method(j);

        Jumpping j2 = new Dog() {
            @Override
            public void method(Jumpping j2) {

            }
        };
        j2.method(j2);
        System.out.println("---------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }

            @Override
            public void method(Jumpping j2) {

            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }

            @Override
            public void method(Jumpping j2) {

            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("贾志豪可以调高了");
            }

            @Override
            public void method(Jumpping j2) {

            }
        });
    }
}
