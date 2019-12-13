package isumi.junker.spider.base;

import isumi.junker.spider.param.BaseParam;
import us.codecraft.webmagic.Site;

public class BaseService {

    protected Site site(BaseParam baseParam){
        Site site = Site
                .me()
                .setDomain(baseParam.getDomain())
                .setSleepTime(baseParam.getFrequency()*1000)
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
        return site;
    }

}
