public class Fragment{
    private int LayoutType;
    private int FragmentWidth;
    private int FragmentHeight;
    private int ColumnsCount;
    private int LinesCount;
    private String TextColor;
    private String BackgroundColor;

    public Fragment(int LayoutType, int FragmentWidth, int FragmentHeigth, int ColumnsCount, int LinesCount, String TextColor, String BackgroundColor) {
        this.LayoutType = LayoutType;
        this.FragmentWidth = FragmentWidth;
        this.FragmentHeight = FragmentHeigth;
        this.ColumnsCount = ColumnsCount;
        this.LinesCount = LinesCount;
        this.TextColor = TextColor;
        this.BackgroundColor = BackgroundColor;
    }

    public int getLayoutType(){
        return LayoutType;
    }
    public void setLayoutType(int LayoutType){
        this.LayoutType = LayoutType;
    }
    public int getFragmentWidth(){
        return FragmentWidth;
    }
    public void setFragmentWidth(int FragmentWidth){
        this.FragmentWidth = FragmentWidth;
    }
    public int getFragmentHeight(){
        return FragmentHeight;
    }
    public void setFragmentHeight(int FragmentHeight){
        this.FragmentHeight = FragmentHeight;
    }
    public int getColumnsCount(){
        return ColumnsCount;
    }
    public void setColumnsCount(int ColumnsCount){
        this.ColumnsCount = ColumnsCount;
    }
    public int getLinesCount(){
        return LinesCount;
    }
    public void setLinesCount(int LinesCount){
        this.LinesCount = LinesCount;
    }
    public String getTextColor(){
        return TextColor;
    }
    public void setTextColor(String TextColor){
        this.TextColor = TextColor;
    }
    public String getBackgroundColor(){
        return BackgroundColor;
    }
    public void setBackgroundColor(String BackgroundColor){
        this.BackgroundColor = BackgroundColor;
    }

    static void onAttach() {
        System.out.println("Ïðèêëåïëåíèå ê àêòèâèòè");
    }
    static void onStart() {
        System.out.println("Çàïóñê ýêðàíà");
    }
    static void onCreateView() {
        System.out.println("Èíèöèàëèçàöèÿ ïðåäñòàâëåíèÿ");
    }
    static void onViewCreated() {
        System.out.println("Âüþ áûëî ñîçäàíî");
    }
    static void onDestroyView() {
        System.out.println("Óíè÷òîæåíèå âüþ");
    }
    static void onPause() {
        System.out.println("Ýêðàí íå âèäåí ïîëüçîâàòåëþ");
    }
    static void onResume() {
        System.out.println("Ýêðàí ñíîâà âèäåí ïîëüçîâàòåëþ");
    }
    static void onDetach() {
        System.out.println("Îòêðåêëåïëåíèå îò àêòèâèòè");
    }
    static void onDestroy() {
        System.out.println("Çàêðûòèå ýêðàíà");
    }
}
