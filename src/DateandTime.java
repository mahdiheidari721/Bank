public class DateandTime {
    static int tabehal(String past,String now){
String[] splitpast=past.split("\\-");
        String[] splitnow=now.split("\\-");
        return (Integer.parseInt(splitnow[0])-Integer.parseInt(splitpast[0]))*12+Integer.parseInt(splitnow[1])-Integer.parseInt(splitpast[1]);
    }
public void Process(String[] split){


}
}
