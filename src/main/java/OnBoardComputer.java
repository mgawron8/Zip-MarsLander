public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if(status.getAltitude() > 6000){
            burn = 100;
        }else if(status.getVelocity() >= 100){
            burn = 200;
        }else if(status.getVelocity() > 10){
            burn = 110;
        }else if(status.getVelocity() >= 2) {
            burn = 101;
        }else if(status.getVelocity() >= 0) {
            burn = 99;
        }else{burn = 100;}

        if(status.getVelocity() == 0 && status.getAltitude() > 100){
            burn = 0;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
