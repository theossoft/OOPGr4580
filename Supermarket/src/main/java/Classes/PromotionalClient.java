package Classes;

public class PromotionalClient extends Actor {
    public static int promotionalClientCount; // Статическая переменная для подсчета акционных клиентов
    private int clientID; // Идентификатор клиента
    private String stockName; // Название акции

    // Конструктор создания экземпляра класса акционного клиента
    public PromotionalClient(String name, int clientID, String stockName) {
        super(name);
        this.clientID = clientID;
        this.stockName = stockName;
        promotionalClientCount++; // Увеличение счетчика акционных клиентов при создании экземпляра класса
    }

    public static int getPromotionalClientCount() {
            return promotionalClientCount; // Метод для получения количества созданных экземпляров класса акционных клиентов
        }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isReturnOrder() {
        return false;
    }
}
