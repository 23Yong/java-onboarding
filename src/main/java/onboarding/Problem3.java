package onboarding;

public class Problem3 {

    public static int solution(int number) {
        int answer = 0;
        for (int num = 3; num <= number; num++) {
            answer += clap(num);
        }

        return answer;
    }

    private static int clap(int number) {
        return 0;
    }
}
