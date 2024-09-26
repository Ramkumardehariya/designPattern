
class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getImportantData() {
        return importantData;
    }
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryIportantData() throws InterruptedException{
        this.importantData = "Very very important data";
        Thread.sleep(5000);
    }
    @Override
    public String toString() {
        return this.ip + " : "+this.importantData;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



public class Prototype {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection network = new NetworkConnection();
        network.setIp("192.23.23");
        network.loadVeryIportantData();

        System.out.println(network);

        // network.clone();
        NetworkConnection network2 = null;
        try{
            network2 = (NetworkConnection)network.clone();
            System.out.println(network2);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
