package com.zzh.contest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;

/**
 * 保存和读取json文件
 */
public class FileOperations {
    static final String HEAD_PATH = System.getProperty("user.home") + "/.ReviewAllot";

    public static void saveJsonFile(Map<String, Integer> map, String afterPath) {
        String fullPath = FileOperations.HEAD_PATH + afterPath;
        System.out.println("保存文件路径：" + fullPath);
        ObjectMapper mapper = new ObjectMapper();
        try {
            // 创建一个文件对象
            File file = new File(fullPath);
            // 如果父目录不存在，创建父目录
            if (!file.getParentFile().exists()) {
                System.out.println("删除目录结果：" + file.getParentFile().mkdirs());
            }
            // 如果文件已存在，则删除旧文件
            if (file.exists()) {
                System.out.println("删除文件结果：" + file.delete());
            }
            System.out.println("创建文件结果" + file.createNewFile());
            // 创建json文件
            Writer write = new OutputStreamWriter(Files.newOutputStream(file.toPath()), StandardCharsets.UTF_8);
            // 将map写入json文件
            mapper.writeValue(file, map);
            write.flush();
            write.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static StringBuilder readJsonFile(String afterPath) {
        String fullPath = FileOperations.HEAD_PATH + afterPath;
        System.out.println("读取文件路径：" + fullPath);
        try {
            File file = new File(fullPath);
            // 如果文件存在
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Reader reader = new InputStreamReader(Files.newInputStream(file.toPath()), StandardCharsets.UTF_8);
                int ch;
                StringBuilder stringBuffer = new StringBuilder();
                while ((ch = reader.read()) != -1) {
                    stringBuffer.append((char) ch);
                }
                fileReader.close();
                reader.close();
                return stringBuffer;
            } else {
                // 不存在返回null
                return null;
            }
        } catch (Exception e) {
            // 异常返回null
            return null;
        }
    }
}