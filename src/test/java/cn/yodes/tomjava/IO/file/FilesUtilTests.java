package cn.yodes.tomjava.IO.file;

import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * <pre>
 * <p>Description: //TODO</p>
 * <p>Copyright (c) 2018 open.yodes.cn Inc. All rights reserved.</p>
 * </pre>
 *
 * @author Yodes Yang
 * @since 2018/3/29 20:36
 */
public class FilesUtilTests {
    @Test
    public void test() {
        String route = "C:\\Users\\S9015834\\Desktop\\wordCount_TF";
        List<File> fileList = FilesUtil.getAllFiles(route, 2);
        System.out.println(fileList);
    }
}
