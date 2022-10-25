package project2;

import java.util.Comparator;

public class SearchArbetare implements Comparator<ArbetareAbs> {
    @Override
    public int compare(ArbetareAbs o1, ArbetareAbs o2) {
        if (o1.getId() == o2.getId()){
            return 0;

        } // end if
        return -1;
    }
}
