package week1.day2;

public class Browser {
    public void launchBrowser(String browserName){
        System.out.println("Browser launched successfully");
    }
    public void loadurl(){
        System.out.println("Application url loaded successfully");
    }
    public static void main(String[] args) {
        Browser bName=new Browser();
        bName.launchBrowser("Firefox");
        Browser lUrl=new Browser();
        lUrl.loadurl();
    }

     

}
