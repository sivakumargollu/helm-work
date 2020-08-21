public class MyColor {

    public static void main(String[] args) {
        String color = "NONE";
        int colorCode = 0;
        if(args.length >= 1){
            try {
                 colorCode = Integer.parseInt(args[0]);
            } catch (NumberFormatException e){
                e.printStackTrace();
            }
            switch (colorCode){
                case  1 : color = "BLUE";break;
                case  2: color = "GREEN";break;
                case 3: color = "RED";
                default:break;
            }
        }
        System.out.println("Printed color " + color);
    }
}
