package cn.getech.poros.decencode;

import com.sun.javaws.jnl.LibraryDesc;

import com.sun.jna.Library;
import com.sun.jna.Native;
/**
 * 加解密文件工具类
 * 参考
 * https://blog.csdn.net/zjq852533445/article/details/87252214
 * c/c++套娃
 * https://blog.csdn.net/chanshibing/article/details/75050252
 * https://blog.csdn.net/ganbelieve/article/details/89448447
 * idea 依赖jna库后需要reload项目
 * 用的key是defaultKey
 * 算法不用
 */
public interface DecodeEncodeFileUtils extends Library {
    String os = System.getProperty("os.name");  // 获取当前操作系统的类型
    int beginIndex = os != null && os.startsWith("Windows") ? 1 : 0;// windows操作系统为1 否则为0

    // [Native.synchronizedLibrary] 阻止多线程同时访问本地代码
    DecodeEncodeFileUtils INSTANTCE = (DecodeEncodeFileUtils) Native.synchronizedLibrary(
            (DecodeEncodeFileUtils) Native.loadLibrary(
                    DecodeEncodeFileUtils.class.getResource("/filelock.so")
                            .getPath()
                            .substring(beginIndex)// substring(1)的原因是在Windows下获取到的路径前面会多一个斜杠，但在Linux下不会
                    , DecodeEncodeFileUtils.class
            )
    );

    /**
     * 检查文件是否为加密文件
     */
    boolean IsEncryptLockFile(String fileName);
}
