public class Human implements IHuman, IStandardFunc {
    private String Name;
    APlace places;
    Human(String n, APlace h) {
        Name = n;
        places = h;
    }
    public void walk(APlace h){
        places = h;
        System.out.println(Name + " пошагал на место: " + places.getPlace());
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }
    public void somersault(APlace h){
        places = h;
        System.out.println(Name + " сделал кувырок на локации: " + places.getPlace());
    }
    public void Footprint(track k, Decor l){
        System.out.println(Name + " отавил " + k.getTracks() + " Следы на" + l.getDampEarth());
    }
}
