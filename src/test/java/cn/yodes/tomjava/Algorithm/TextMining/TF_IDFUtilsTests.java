package cn.yodes.tomjava.Algorithm.TextMining;

import cn.yodes.tomjava.IO.file.FilesUtil;
import com.google.common.io.Resources;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * <p>Description: //TODO</p>
 * <p>Copyright (c) 2018 open.yodes.cn Inc. All rights reserved.</p>
 * </pre>
 *
 * @author Yodes Yang
 * @since 2018/3/29 13:23
 */
public class TF_IDFUtilsTests {
    private List<String> fileList;

    @Before
    public void initialDate() throws IOException {
        String route = Resources.getResource("text_mining/poems").getPath(), result = "";
        List<File> files = FilesUtil.getAllFiles(route, 2);
        fileList = new ArrayList<>();
        for (File file : files) {
            fileList.add(FileUtils.readFileToString(file, "UTF-8"));
        }
    }

    @Test
    public void countTF_IDF() {
        // HanLP.Config.enableDebug();
        String result = TF_IDFUtils.countIDF(fileList, true);
        System.out.println(result);
    }

    @Test
    public void countTF() {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> tfMap = TF_IDFUtils.countTFByText(fileList, true);
        List<Map.Entry<String, Integer>> tfArrayList = new ArrayList<>(tfMap.entrySet());
        tfArrayList.sort(Comparator.comparing(Map.Entry::getValue));

        result.append("--------------TF Result--------------\n");
        for (Map.Entry<String, Integer> entry : tfArrayList) {
            result.append(entry.getKey()).append("\t").append(entry.getValue()).append("\n");
        }
        System.out.println(result.toString());
    }
}
