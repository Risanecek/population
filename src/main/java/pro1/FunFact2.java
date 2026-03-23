package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact2 {
    /**
     * @return TODO: Celkový počet obyvatel ve všech obcích
     */
    public static long getFunFact(List<Muni> data) {
        var result = data
                .stream()
                .mapToLong(m -> m.getPopulation())
                .sum();

        return result;
    }
}