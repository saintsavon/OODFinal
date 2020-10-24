package Desktop;
public class DesktopFactory {

    public Desktop buildDesktop(String desktopType) {
        if (desktopType.equals(null)){
            return null;
        }
        else if(desktopType.equals("High End Work Station Desktop")){
            return new WorkStation();
        }
        else if(desktopType.equals("High End Gaming Desktop")){
            return new GamingStation();
        }
        else if(desktopType.equals("Casual Browsing Desktop")){
            return new BrowsingStation(); // This is new
        }
        return null;
    }
    
}
