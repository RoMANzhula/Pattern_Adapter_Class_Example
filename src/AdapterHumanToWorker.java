public class AdapterHumanToWorker extends Worker implements Human { //класс адаптер, который позволяет адаптировать Человека
    //в работника путем обьединения - т.е. реализуем в методах интерфейса методы класса
    @Override //аннотация, которая говорит, что мы будем переопределять метод
    public void put() { //обязательный к реализации метод (т.к. мы имплементируем интерфейс Human)
        putTheBox(); //реализуем метод класса Worker
    }

    @Override //аннотация, которая говорит, что мы будем переопределять метод
    public void carry() { //обязательный к реализации метод (т.к. мы имплементируем интерфейс Human)
        carryTools(); //реализуем метод класса Worker
    }

    @Override //аннотация, которая говорит, что мы будем переопределять метод
    public void liftUp() { //обязательный к реализации метод (т.к. мы имплементируем интерфейс Human)
        liftUpMaterials(); //реализуем метод класса Worker
    }

    @Override //аннотация, которая говорит, что мы будем переопределять метод
    public void twist() { //обязательный к реализации метод (т.к. мы имплементируем интерфейс Human)
        twistScrews(); //реализуем метод класса Worker
    }
}
