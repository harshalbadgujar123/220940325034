class GrandParent {
    String grandfathername;
    String grandmothername;

    GrandParent(String GFN,String GMN){
        grandfathername=GFN;
        grandmothername=GMN;

        System.out.println("grand father name:"+grandfathername);
        System.out.println("grand mother name:"+grandmothername);
    }
}
class Parent extends GrandParent{
    String fathername;
    String mothername;

    Parent(String FN,String MN,String GFN,String GMN){
        super(GFN,GMN);

        fathername=FN;
        mothername=MN;

        System.out.println("father name:"+fathername);
        System.out.println("mother name:"+mothername);
    }
}
class child extends Parent {

    child(String FN,String MN,String GFN,String GMN){
        super(FN,MN,GFN,GMN);
    }
}
public class Harshal {
    public static void main(String[] args) {
        child h = new child(FN:'papa',MN:'aai',GFN:'grandpa',GMN:'granyy')
    }
}

