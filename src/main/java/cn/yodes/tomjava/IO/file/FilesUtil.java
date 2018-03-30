package cn.yodes.tomjava.IO.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * <p>Description: //TODO</p>
 * <p>Copyright (c) 2018 open.yodes.cn Inc. All rights reserved.</p>
 * </pre>
 *
 * @author Yodes Yang
 * @since 2018/3/29 20:12
 */
public class FilesUtil {
    /**
     * 获取指定目录下的所有文件（不包括文件夹)
     * @param path 文件夹的File对象或者文件夹路径字符串
     * @param depth 遍历深度，从深度1开始
     * @return 指定目录下所有的文件的File对象的集合
     */
    public static ArrayList<File> getAllFiles(Object path, int depth) {
        File directory = null;
        if (path instanceof File) {
            directory = (File)path;
        } else {
            directory = new File(path.toString());
        }
        ArrayList<File> files = new ArrayList<File>();
        if (directory.isFile()) {
            files.add(directory);
        } else if (directory.isDirectory()) {
            depth--;
            if (depth >= 0) {
                File[] fileList = directory.listFiles();
                for (File file : fileList) {
                    files.addAll(getAllFiles(file, depth));
                }
            }
        }
        return files;
    }
}
