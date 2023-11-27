public class VentilationActuator extends Actuator{

    public VentilationActuator(String name){
        this.name = name;
    }
    private void setValue(double value){

    }

    public String toString(){

        return null;
    }

    @Override
    public void PrintData(){
        System.out.println(this.getData());
    }
}
