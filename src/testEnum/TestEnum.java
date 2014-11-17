package testEnum;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class TestEnum {
    public enum ColorEnum{
        red,green,yellow,blue;
    }
    public enum SeasonEnum{
        spring,summer,autumn,winter;
        private final static String position="test";
        public static SeasonEnum getSeason(){
            if("test".equals(position))
                return spring;
            else
                return winter;
        }
    }
    public enum Gender{
        MAN("MAN"),WOMEN("WOMEN");
        private final String value;
        Gender(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }
    public enum OrderState{
        CANCEL{public String getName(){
            return "已取消";
        }},
        WAITCONFIRM{public String getName(){
            return "待审核";
        }},
        WAITPAYMENT{public String getName(){
            return "等待付款";
        }},
        ADMEASUREPRODUCT{public String getName(){
           return "正在配货" ;
        }},
        DELIVERED{public String getName(){
            return "已发货";
        }},
        RECEIVED{public String getName(){
            return "已收货";
        }};
        public abstract String getName();
    }

    public static void main(String[] args) {
        ColorEnum colorEnum=ColorEnum.blue.blue;
        switch(colorEnum){
            case red:
                System.out.println("color is red");
                break;
            case green:
                System.out.println("color is green");
                break;
            case yellow:
                System.out.println("color is yellow");
                break;
            case blue:
                System.out.println("color is blue");
                break;
        }
        System.out.println("遍历ColorEnum中的值");
        for (ColorEnum colorEnum1:ColorEnum.values()){
            System.out.println(colorEnum);
        }
        System.out.println(ColorEnum.values().length);
        System.out.println(ColorEnum.red.ordinal());
        System.out.println(ColorEnum.green.ordinal());
        System.out.println(ColorEnum.yellow.ordinal());
        System.out.println(ColorEnum.blue.ordinal());
        System.out.println(ColorEnum.red.compareTo(ColorEnum.green));
        System.out.println("======================================");
        System.err.println("季节为"+SeasonEnum.getSeason());
        System.out.println("======================================");
        for (OrderState orderState:OrderState.values()) {
            System.out.println(orderState.getName());
        }

    }
}
