package cn.demo.decencode;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * 加解密文件工具类
 * 参考 https://blog.csdn.net/zjq852533445/article/details/87252214
 * idea 依赖jna库后需要reload项目
 * 用的key是defaultKey
 * 算法不用
 */
public class DecodeEncodeFileUtils2 {
    static {
        System.loadLibrary("filelock");
    }


    /**
     * 检查文件是否为加密文件
     */
    public static native long IsEncryptLockFile(String fileName);
}
