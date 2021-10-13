import java.util.Arrays;

// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

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