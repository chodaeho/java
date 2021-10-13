import java.util.Arrays;

class Marathon {
	public static void main(String[] args) {
        Marathon marathon = new Marathon();

        String[] participant = { "leo", "kiki", "eden" };
        String[] completion = { "eden", "kiki" };
        // String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        // String[] completion = {"josipa", "filipa", "marina", "nikola"};
        // String[] participant = {"mislav", "stanko", "mislav", "ana"};
        // String[] completion = {"stanko", "ana", "mislav"};
        marathon.solution(participant, completion);
	}

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int index = 0;
        for(index = 0; index < completion.length; index++) {
            if(!participant[index].equals(completion[index])) {
                return participant[index];
            }
        }
        answer = participant[index];
        return answer;
    }
}