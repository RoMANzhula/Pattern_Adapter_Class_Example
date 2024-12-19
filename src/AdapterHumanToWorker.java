public class AdapterHumanToWorker extends Worker implements Human { 
    @Override
    public void put() {
        putTheBox();
    }

    @Override
    public void carry() { 
        carryTools();
    }

    @Override
    public void liftUp() {
        liftUpMaterials();
    }

    @Override
    public void twist() {
        twistScrews();
    }
}
