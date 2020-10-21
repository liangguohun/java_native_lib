package cn.getech.poros.decencode;

/**
 * <p>
 * nohup java -jar xxx.jar &
 * nohup 表示不挂断运行命令行
 * >/usr/local/temp.txt &
 * > /usr/local/temp.txt 表示将所有启动的日志信息记录到temp.txt文件中
 * </p>
 *
 * @author guohun.liang@getech.cn
 * @since 2020/10/20 17:44
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(DecodeEncodeFileUtils.class.getResource("/filelock.so"));
//        boolean result = DecodeEncodeFileUtils.INSTANTCE.IsEncryptLockFile("/oracle学习汇报材料.pptx");
//        System.out.println("result:"+ result);

        long result = new DecodeEncodeFileUtils2().IsEncryptLockFile("/oracle学习汇报材料.pptx");
        System.out.println("result:"+ result);
    }
}
