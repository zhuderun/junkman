import isumi.junker.spider.utils.FileUtils;
import net.coobird.thumbnailator.Thumbnails;
import java.io.File;
import java.io.IOException;

public class ThumbnailatorTest {

    private static String FILE_PATH = "f://";

    public static void main(String[] args) throws IOException {
        Thumbnails.of(new File("/original.png"))
                .size(160, 160)
                .toFile(new File("/thumbnail.png"));

        byte [] imageByte = FileUtils.download("http://static.oschina.net/uploads/space/2014/0612/000228_XQfi_190591.png",10000);
        FileUtils.byte2File(imageByte,FILE_PATH,"test.png");
    }
}
