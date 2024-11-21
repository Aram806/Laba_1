public class Activity {
    private int ActivityWidth;
    private int ActivityHeight;
    private String Color;
    private int Transparency;
    private String Movable;

    public Activity(int ActivityWidth, int ActivityHeight, String Color, int Transparency, String Movable) {
        this.ActivityWidth = ActivityWidth;
        this.ActivityHeight = ActivityHeight;
        this.Color = Color;
        this.Transparency = Transparency;
        this.Movable = Movable;
    }

    public int getActivityWidth(){
        return ActivityWidth;
    }
    public void setActivityWidth(int ActivityWidth){
        this.ActivityWidth = ActivityWidth;
    }
    public int getActivityHeight(){
        return ActivityHeight;
    }
    public void setActivityHeight(int ActivityHeight){
        this.ActivityHeight = ActivityHeight;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public int getTransparency(){
        return Transparency;
    }
    public void setTransparency(int Transparency){
        this.Transparency = Transparency;
    }
    public String getMovable(){
        return Movable;
    }
    public void setMovable(String Movable){
        this.Movable = Movable;
    }

    static void onStart() {
        System.out.println("Âõîäíàÿ òî÷êà ïðèëîæåíèÿ");
    }
    static void onCreate() {
        System.out.println("Èíèöèàëèçàöèÿ ôðàãìåíòîâ");
    }
    static void onPause() {
        System.out.println("Ñâîðà÷èâàíèå ïðèëîæåíèÿ");
    }
    static void onStop() {
        System.out.println("Îñòàíîâêà àêòèâèòè");
    }
    static void onResume() {
        System.out.println("Ýêðàíû ñíîâà âèäíû ïîëüçîâàòåëþ");
    }
    static void onDestroy() {
        System.out.println("Çàêðûòèå àêòèâèòè");
    }
}
