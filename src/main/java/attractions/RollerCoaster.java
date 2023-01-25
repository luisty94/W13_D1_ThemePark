package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() >= 145 && visitor.getAge() > 12;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double extraCharge = visitor.getHeight() >= 200 ? 2.00 : 1.00;
        return defaultPrice() * extraCharge;
    }
}
