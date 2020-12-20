public class Moomintroll extends Human {
    private String leglength;
    APlace place;

    Moomintroll(String y,APlace p) {
        super(y, p);
        leglength = y;
    }

    public void thinking(AThink t, IHuman s) {
        System.out.println("Муми-тролль подумал про: " + s.getName()+"a" + t.getType());
    }

    public void walk(APlace h) {
        place = h;
        System.out.println("Муми-тролль пошагал на место: " + place.getPlace());
    }

    public void climbed(Decor d) {
        System.out.println("Муми-тролль спустился по : " + d.getStairs() + " ,переступая ногами размера: " + leglength);
    }

    public void look(Decor w, APlace s, APlace l) {
        place = s;
        places = l;
        System.out.println("Муми-тролль выглянул в :" + w.getWindow() + " из " + place.getPlace() + " на: " + places.getPlace());
    }

    public void drewattention(IHuman n, track t, APlace v) {
        if (t.getOpportunity() == true) {
            System.out.println("Муми-тролль увидел " + t.getTracks() + " Следы " + n.getName()+"a" + " и он возможно направился: " + v.getPlace());
        }
        else {
            System.out.println("Муми-тролль увидел " + t.getTracks() + " Следы " + n.getName()+"a" + " и не было никакой возможности определить, куда он направился.");
        }
    }
}

