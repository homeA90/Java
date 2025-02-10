package chapter_5;/*
DNA 염기 서열 분석
DNA 염기 서열은 생물의 유전 성질을 결정하는 매우 중요한 역할을 가지고 있습니다.
템플릿에 주어진 염기 서열에서 TAGG, CCAG, AGCC가 총 몇 번 등장하는지 세어봅시다.
만약 TAGG가 2번, CCAG가 4번, AGCC가 3번 등장한다면 아래와 같은 출력 값이 나옵니다:

TAGG: 2
CCAG: 4
AGCC: 3

힌트
문자열의 toCharArray() 메소드(함수)를 사용하면 char[] 배열을 얻을 수 있습니다.
char[] sequence = "abc".toCharArray();

반대로 char[] 배열을 문자열로 바꾸려면 이렇게 하면 됩니다:
String stringFromCharArr = new String(charArr);
TAGG: 1
CCAG: 12
AGCC: 15
 */

public class Example_5_4 {
    public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";


        //char 배열에서 4개씩 묶어주는 배열을 생성해야함
        // charArray.length - 3 개념이 중요함. charArray.length 전부 가져오면 0,1,2인덱스에 없는 값이 들어가므로 에러가 발생되기때문
        // 1개를 한꺼번에 가져오는게 아닌 1개씩 밀면서 가져오도록 하는것
        // harArray[0], charArray[1], charArray[2], charArray[3]
        // harArray[1], charArray[2], charArray[3], charArray[4]
        // 위에 처럼 가져와야 함 그리고 current[j] = charArray[i + j]; < i와 j를 더해야 플러스 1이되서 위에처럼 가져올수 있음
        char[] charArray = dna.toCharArray();
        char[] current = new char[4];
        int TAGG = 0;
        int CCAG = 0;
        int AGCC = 0;

        for (int i = 0; i < charArray.length - 3; i++) {
            for (int j = 0; j < current.length; j++) {
                current[j] = charArray[i + j];
            }

            String stringFromCharArr = new String(current);

            switch (stringFromCharArr) {
                case "TAGG":
                    TAGG++;
                    break;

                case "CCAG":
                    CCAG++;
                    break;

                case "AGCC":
                    AGCC++;
                    break;
            }
        }
        System.out.println("TAGG: " + TAGG);
        System.out.println("CCAG: " + CCAG);
        System.out.println("AGCC: " + AGCC);
    }
}
