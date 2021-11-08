package com.sagarkhurana.quizforfun.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.sagarkhurana.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Maya Angelou",true);
        answer1.put("Robert Hass",false);
        answer1.put("Jessica Hagdorn",false);
        answer1.put("Micheal Palmer",false);
        questions.put("Which American writer published ‘A brave and startling truth’ in 1996",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Acrostic ",true);
        answer2.put("Haiku",false);
        answer2.put("Epic",false);
        answer2.put("Alliterative",false);
        questions.put("What is a poem called whose first letters of each line spell out a word?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Limerick",true);
        answer3.put("Quartet",false);
        answer3.put("Sextet",false);
        answer3.put("Palindrome",false);
        questions.put("What is a funny poem of five lines called?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Robert Greene",true);
        answer4.put("John Milton",false);
        answer4.put("Philip Sidney",false);
        answer4.put("Christopher Marlowe",false);
        questions.put("Who succeeded Lyly?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Hamlet",true);
        answer5.put("Cymbeline",false);
        answer5.put("Titus Andronicus",false);
        answer5.put("Pericles, Prince of Tyre",false);
        questions.put("Which famous Shakespeare play does the quote,”Neither a borrower nor a lender be” come from?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("In which century was Shakespeare born?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("A thief",true);
        answer7.put("A clerk",false);
        answer7.put("A teacher",false);
        answer7.put("A dentist",false);
        questions.put("Who is Mr. Tench in The Power and the Glory?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Coleridge",true);
        answer8.put("Wordsworth",false);
        answer8.put("Lamb",false);
        answer8.put("Shelley",false);
        questions.put("Who said ‘Keats was a Greek’?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gertrude",true);
        answer9.put("Beatrice",false);
        answer9.put("Margaret",false);
        answer9.put("Rosalind",false);
        questions.put("Which of the following is Hamlet’s mother?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Keats",true);
        answer11.put("Blake",false);
        answer11.put("Tennyson",false);
        answer11.put("Shelley",false);
        questions.put("For whom it is said: “sensuousness is a paramount bias of his genius”:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Maud",true);
        answer12.put("Ulysses",false);
        answer12.put("Break, Break, Break",false);
        answer12.put("Crossing the Bar",false);
        questions.put("Which of the following poems by Tennyson is a monodrama?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Southey",true);
        answer13.put("Tennyson",false);
        answer13.put("Byron",false);
        answer13.put("Wordsworth",false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 1813?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Wordsworth",true);
        answer14.put("Keats",false);
        answer14.put("Byron",false);
        answer14.put("Blake",false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Dickens",true);
        answer15.put("George Eliot",false);
        answer15.put("Hardy",false);
        answer15.put("None of the above",false);
        questions.put("Moral choice is everything in the works of:",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("True",true);
        answer1.put("Abcd",false);
        answer1.put("False",false);
        answer1.put("ABCD",false);
        questions.put("What does this line of code print?\n\tprint(A in \"ABCD\")?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("str",true);
        answer2.put("list",false);
        answer2.put("dictionary",false);
        answer2.put("set",false);
        questions.put("Which of these datatypes is immutable in Python?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("512",false);
        answer3.put("any",true);
        answer3.put("246",false);
        answer3.put("128",false);
        questions.put("The maximum number of functions that can be nested in another function is",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("?SDA",false);
        answer4.put("#Kosi",false);
        answer4.put("12B",false);
        answer4.put("__12",true);
        questions.put("Which of the following is a valid variable name?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("5",false);
        answer5.put("5.0",true);
        answer5.put("5.25",false);
        answer5.put("An error message",false);
        questions.put("\"What does this line of code print?\na = 10.5; b = 2\nprint(a//b)",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("kkkkk",false);
        answer6.put("kabcd",false);
        answer6.put("akbkckd",true);
        answer6.put("k,a,b,c,d",false);
        questions.put("What does this line of code print?\nprint('k'.join(['a','b','c','d']))",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("abcd",true);
        answer7.put("a b c d",false);
        answer7.put("dcba",false);
        answer7.put("a,b,c,d",false);
        questions.put("What does this line of code print?\nprint(\"a,b,c,d,\".replace(',',''))",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("an error message",true);
        answer8.put("11",false);
        answer8.put("1",false);
        answer8.put("11",false);
        questions.put("What does this line of code print?\nprint(1,2,3,4, sep = 11)",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("1222223224",true);
        answer9.put("22",false);
        answer9.put("2",false);
        answer9.put("12",false);
        questions.put("What does this line of code print?\nprint(1,2,3,4, sep = '22')",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("return",false);
        answer10.put("pass",false);
        answer10.put("continue",true);
        answer10.put("break",false);
        questions.put("Which of these keywords skips current iteration of a loop when reached",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("return",false);
        answer11.put("pass",false);
        answer11.put("continue",false);
        answer11.put("break",true);
        questions.put("Which of these keywords breaks out of a loop when reached",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("return",true);
        answer12.put("pass",false);
        answer12.put("continue",false);
        answer12.put("break",false);
        questions.put("Which of these keywords ends a function when reached",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("json",true);
        answer13.put("xlsx",false);
        answer13.put("matplotlib",false);
        answer13.put("numpy",false);
        questions.put("Which of these modules is a text format for storing and transporting data",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("p = open(\"path\"); read(\"path\")",true);
        answer14.put("open(\"path\").read()",false);
        answer14.put("open.read(\"path\")",false);
        answer14.put("read(\"path\")",false);
        questions.put("which of these lines successfully reads from a file",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("set",true);
        answer15.put("str",false);
        answer15.put("int",false);
        answer15.put("list",false);
        questions.put("Which of these datatypes is unordered",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
