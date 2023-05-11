import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
        String[] planetsNamesStringArray = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune",
                "Uranus", "Pluto" };
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        System.out.println(randomSolarSystem);
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        for (int k = 0; k < randomSolarSystem.size() - 1; k++) {
            if(randomSolarSystem.get(k) == randomSolarSystem.get(k + 1))
            {
                randomSolarSystem.remove(randomSolarSystem.get(k));
                k--;
            }
            
        }
        System.out.println(randomSolarSystem);
    }
}
