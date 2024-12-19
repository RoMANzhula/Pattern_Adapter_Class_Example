public class Main {
    public static void main(String[] args) {
        Human worker = new AdapterHumanToWorker(); 

        worker.put(); 
        worker.carry(); 
        worker.liftUp(); 
        worker.twist(); 
    }
}
