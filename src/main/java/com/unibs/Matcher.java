package src.main.java.com.unibs;

public class Matcher{
    static final int AgeThreshold = 10;

    static boolean hasMatch(CuoreSolitario cuoreSolitario1, CuoreSolitario cuoreSolitario2){
        return cuoreSolitario1.getSesso() != cuoreSolitario2.getSesso();
    }
    /*
    25, 25 -> 100%
    20, 25 -> 70%
    (10 - 5) * 10
    Affinità massima se l'età è la medesima.. Con una differenza di 10 anni l'affinità è a 0
     */
    static float getAffinity(CuoreSolitario cuoreSolitario1, CuoreSolitario cuoreSolitario2){
        if(cuoreSolitario1.getSesso() == cuoreSolitario2.getSesso()) return 0;
        return Math.max(0, (AgeThreshold - Math.abs(cuoreSolitario1.getAge() - cuoreSolitario2.getAge())) * 10);
    }
}