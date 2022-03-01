import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
//    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum BodyTypes{
        PLANET,
        DWARF_PLANET,
        MOON
    };

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

//    public String getName() {
//        return name;
//    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        return this.satellites.add(heavenlyBody);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }
//
        HeavenlyBody objName = ((HeavenlyBody) obj);
        return this.getKey().equals(objName.getKey());
    }

    @Override
    public final int hashCode() {
//        System.out.println("hashcode called");
        return this.getKey().hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name,bodyType);
    }

    @Override
    public String toString() {
        return this.getKey().toString()+", "+this.orbitalPeriod;
    }

    public static final class Key{
        private  String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            Key key = (Key) o;
            if (this.getName().equals(((Key) o).getName()))
                return this.bodyType.equals(key.bodyType);

            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+57+this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": "+this.bodyType;
        }
    }

}