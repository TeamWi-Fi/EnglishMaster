package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import java.util.Random;

/**
 * Created by s14007 on 15/08/25.
 */
public class QuestionBank {
    public static String[][][] q() {
        String[][][] q= new String[5][20][12];

        //単語編
        q[0][0] = new String[]{"1", "男の子", "boy", "解：boy", "1", "boy","home","not","together", null, "1"};
        q[0][1] = new String[]{"2", "今日", "today",	"解：today", "1", "sometimes","often","yesterday","today", null, "1"};
        q[0][2] = new String[]{"3", "明日", "tomorrow", "解：tomorrow", "1", "yesterday","today","tomorrow","sometimes", null, "1"};
        q[0][3] = new String[]{"4", "入浴", "bath", "解：bath", "1", "lion","clock","bath","face", null, "1"};
        q[0][4] = new String[]{"5", "地球", "earth", "解：earth", "1", "earth","foot","gun","hair", null, "1"};
        q[0][5] = new String[]{"6", "仕事", "job", "解：job", "1", "dictionary","job","computer","radio", null, "1"};
        q[0][6] = new String[]{"7", "りんご", "apple", "解：apple", "1", "apple","banana","car","sun", null, "1"};
        q[0][7] = new String[]{"8", "太陽", "sun", "解：sun", "1", "sun","moon","coffee","blue", null, "1"};
        q[0][8] = new String[]{"9", "女の子", "girl", "解：girl", "1", "girl","boy","lady","hip", null, "1"};
        q[0][9] = new String[]{"10", "色", "color", "解：color", "1", "color","blue","red","boss", null, "1"};
        q[0][10] = new String[]{"11", "メガネ", "glasses", "解：glasses", "1", "chop","glasses","phone","speak" ,null, "1"};
        q[0][11] = new String[]{"12", "キノコ", "mash", "解：mash", "1", "teemo","mash","room","yellow", null, "1"};
        q[0][12] = new String[]{"13", "犬", "dog", "解：dog", "1", "cat","dog","zoo","cash", null, "1"};
        q[0][13] = new String[]{"14", "猫", "cat", "解：cat", "1", "ls","cat","find","bash", null, "1"};
        q[0][14] = new String[]{"15", "鳥", "bard", "解：bard", "1", "bard","cord","forever","sale", null, "1"};
        q[0][15] = new String[]{"16", "電話", "phone", "解：phone", "1", "watch","banana","phone","bag", null, "1"};
        q[0][16] = new String[]{"17", "海", "sea", "解：sea", "1", "cocoa","sea","apple","river", null, "1"};
        q[0][17] = new String[]{"18", "空", "sky", "解：sky", "1", "sea","sky","tree","shy", null, "1"};
        q[0][18] = new String[]{"19", "時計", "clock", "解：clock", "1", "test","clock","dog","dad", null, "1"};
        q[0][19] = new String[]{"20", "神", "god", "解：god","1", "bed","god","heavy","papa", null, "1"};

        //日常会話編
        q[1][0] = new String[]{"1", "??? am human", "I", "私は人間です", "I", "my", "this", "mine", null, "2"};
        q[1][1] = new String[]{"2", "Thank ???.", "you", "ありがとう", "you","am","do","why", null, "2"};
        q[1][2] = new String[]{"3", "I ??? from Tokyo.", "am", "私は東京出身です", "1", "is", "be", "am", "are", null, "2"};
        q[1][3] = new String[]{"4", "You ??? our teacher", "are", "あなたは私達の先生です", "1", "are", "this", "know", "which", null, "2"};
        q[1][4] = new String[]{"5", "We ??? near the station.", "are", "私達は駅の近くにいます", "1", "this", "the", "fork", "are", null, "2"};
        q[1][5] = new String[]{"6", "I ??? baseball after school.", "play", "私は放課後野球をします", "1", "am", "play", "catch", "get", null, "2"};
        q[1][6] = new String[]{"7", "Welcome to my ???, Takao. Please come in.", "home", "私の家へようこそ太郎、どうぞお入りください", "1", "time", "home", "winter", "day", null, "2"};
        q[1][7] = new String[]{"8", "A: Do you like Japanese ???, Joe?  B: yes, I do. I like sushi.", "food", "A:あなたは日本食が好きですか?ジョー B: はい、私は寿司が好きです。", "1", "songs", "food", "fruit", "animals", null, "2"};
        q[1][8] = new String[]{"9", "My father is cooking breakfast in the ??? now. He is a good cook.", "kitchen", "私の父は厨房で朝ごはんを作っています。彼は素晴らしいコックです。", "1", "bedroom", "kitchen", "bathroom", "pool", null, "2"};
        q[1][9] = new String[]{"10", "A: Where are my old CDs, Mom? B: In that ??? on the table.", "box", "A: 母さん、僕の古いCDはどこ? B: テーブルの上にあるよ", "1", "box", "pen", "sport", "watch", null, "2"};
        q[1][10] = new String[]{"11", "Tokyo is big city. Many ??? live there.", "people", "東京は大都会です。多くの人々がそこに住んでいます。", "1", "people", "desks", "cars", "houses", null, "2"};
        q[1][11] = new String[]{"12", "A: Do you have your bag, Steve? B: Yes, It`s ??? the desk.", "under", "スティーブ、あなた自分のバッグは持っている?　うん、机の下にあるよ", "1", "about", "to", "among", "under", null, "2"};
        q[1][12] = new String[]{"13", "August is the ??? month of the year.", "eighth", "8月は8番目の月です", "1", "second", "fourth", "sixth", "eighth", null, "2"};
        q[1][13] = new String[]{"14", "A: Kate, please ??? up and come to the blackboard. B: Yes, Ms.Sullivan.", "stand", "A:ケイト、立ち上がって黒板に来てください。　B:はい、サバリン先生", "1", "cook", "do", "be", "stand", null, "2"};
        q[1][14] = new String[]{"15", "A: Let`s ??? about summer camp. B: OK.", "talk", "サマーキャンプについてお話しましょう", "1", "sleep", "talk", "know", "open", null, "2"};
        q[1][15] = new String[]{"16", "A: I want a ??? of tea, please, Mom. B: Here you are, Tom.", "cup", "A:お母さん、お茶が飲みたいです　B:はい、どうぞ", "1", "cup", "coin", "camera", "mouth", null, "2"};
        q[1][16] = new String[]{"17", "A: What do you do ??? school, Peter? B: I usually play tennis.", "after", "A: あなたは放課後何をしていますか？ピーター B: 私は普段テニスをしています", "1", "after", "into", "down", "on", null, "2"};
        q[1][17] = new String[]{"18", "Tina and Bill watch their favorite TV show at nine o`clock every ???", "night", "ティナとビルは9時に毎晩自分の好きなテレビ番組を見ます", "1", "minute", "calendar", "night", "hour", null, "2"};
        q[1][18] = new String[]{"19", "That man is Mr. White. I know ??? very well.", "him", "彼はホワイト氏です。私は彼を非常によく知っています。", "1", "it", "him", "you", "her", null, "2"};
        q[1][19] = new String[]{"20", "A: Can you ??? curry, Dan? B: Yes, I can.", "make", "A: ダン、あなたはカレーを作ることができますか? B: はい、できますよ。", "1", "make", "making", "made", "makes", null, "2"};

        q[2][0] = new String[]{};
        q[3][0] = new String[]{};
        q[4][0] = new String[]{};
        return q;
    }

    public static String[] randomQView() {
        Random rand = new Random();
        String[][][] tmp = q();
        return tmp[ModeSelect.stageId][rand.nextInt(20)];
    }
}
