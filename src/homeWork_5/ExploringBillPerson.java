package homeWork_5;

import java.util.*;

//Другой ищет, кто больше всех потратил, сортирует, ищет среднее потраченное всеми клиентами и т.д.
public class ExploringBillPerson implements MethodsForCollection<BillPerson> {
    @Override
    public BillPerson max(Collection<BillPerson> collection) {
        double maxSum = 0;
        BillPerson billPerson = null;
        if (collection != null && !collection.isEmpty()) {
            for (BillPerson p : collection) {
                if (p != null) {
                    if (p.getSum() > maxSum) {
                        maxSum = p.getSum();
                        billPerson = p;
                    }
                }
            }
        }
        return billPerson;
    }

    @Override
    public double middle(Collection<BillPerson> collection) {
        double middleSum = 0;
        if (collection != null && !collection.isEmpty()) {
            for (BillPerson p : collection) {
                if (p != null) {
                    middleSum += p.getSum();
                }
                middleSum /= collection.size();
            }
        }
        return middleSum;
    }

    @Override
    public Collection<BillPerson> sort(Collection<BillPerson> collection) {
        List<BillPerson> list = new ArrayList<>(collection);
        Collections.sort(list, new Comparator<BillPerson>() {
            @Override
            public int compare(BillPerson t1, BillPerson t2) {
                if (t1 != null && t2 != null) {
                    return Double.compare(t1.getSum(), t2.getSum());
                } else if (t1 == null && t2 == null) {
                    return 0;
                } else if (t2 == null) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return list;
    }
}
