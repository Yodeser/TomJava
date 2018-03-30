package cn.yodes.tomjava.Algorithm.TextMining;

import com.hankcs.hanlp.tokenizer.NotionalTokenizer;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <pre>
 * <p>Description: //TODO</p>
 * <p>Copyright (c) 2018 open.yodes.cn Inc. All rights reserved.</p>
 * </pre>
 *
 * @author Yodes Yang
 * @since 2018/3/29 11:48
 */
public class TF_IDFUtils {
    /**
     * 对单词表进行TF求取
     *
     * @param wordList 单词表
     * @return 词频Map
     */
    private static Map<String, Integer> countTFByWordList(List<String> wordList) {
        Map<String, Integer> tfMap = new HashMap<>();
        for (String word : wordList) {
            if (tfMap.containsKey(word)) {
                tfMap.put(word, tfMap.get(word) + 1);
            } else {
                tfMap.put(word, 1);
            }
        }
        return tfMap;
    }

    /**
     * 对文本进行分词后求取TF值
     *
     * @param textList  文本List
     * @param hasNature 词频是否包含词性
     * @return 词频Map
     */
    public static Map<String, Integer> countTFByText(List<String> textList, boolean hasNature) {
        StringBuilder textBuilder = new StringBuilder();
        for (String text : textList) {
            textBuilder.append(text).append("\n");
        }
        List<String> wordList = NotionalTokenizer.segment(textBuilder.toString())
                .stream()
                //词性过滤，如不需要过滤词性则不需要此filter
//                .filter(term -> term.nature.startsWith("n")
//                        || term.nature.startsWith("rr")
//                        || term.nature.startsWith("v"))
                .map(term -> term.word + ((hasNature) ? "\t" + term.nature : ""))
                .collect(Collectors.toList());
        return countTFByWordList(wordList);
    }

    /**
     * 计算某一词汇的IDF值
     *
     * @param textList 文本List
     * @param word     词汇
     * @return 该词汇的IDF值（Double类型）
     */
    private static Double calculateIDFByWord(List<String> textList, String word) {
        int count = 0;
        for (String text : textList) {
            if (text.contains(word.split("\\s+")[0])) {
                count++;
            }
        }
        return Math.log10(textList.size() / (double) (count + 1));
    }

    public static String countIDF(List<String> textList, boolean hasNature) {
        StringBuilder tfResult = new StringBuilder(), tf_idfResult = new StringBuilder(), allResult = new StringBuilder();
        Map<String, Double> idfMap = new HashMap<>();
        Map<String, Integer> tf_idfMap = countTFByText(textList, hasNature);

        List<Map.Entry<String, Integer>> tfArrayList = new ArrayList<>(tf_idfMap.entrySet());
        tfArrayList.sort(Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : tfArrayList) {
            idfMap.put(entry.getKey(), entry.getValue() * calculateIDFByWord(textList, entry.getKey()));
            tfResult.append(entry.getKey()).append("\t").append(entry.getValue()).append("\n");
        }
        List<Map.Entry<String, Double>> idfArrayList = new ArrayList<>(idfMap.entrySet());
        idfArrayList.sort(Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Double> entry : idfArrayList) {
            tf_idfResult.append(entry.getKey()).append("\t").append(entry.getValue()).append("\n");
        }

        allResult.append("--------------TF-IDF Result --------------\n");
        allResult.append(tf_idfResult);
//        allResult.append("--------------TF Result--------------\n");
//        allResult.append(tfResult);

        return allResult.toString();
    }
}
