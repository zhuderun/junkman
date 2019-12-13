package isumi.junker.spider.service;

import isumi.junker.spider.base.BaseService;
import isumi.junker.spider.param.ListWebSite;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

public class BlogService extends BaseService {

    /**
     * 爬取数据
     */
    public void spideListWebSite(ListWebSite listWebSite){
        Site site = super.site(listWebSite);
        Spider.create(new PageProcessor() {
            @Override
            public void process(Page page) {
                Selectable allItems =  page.getHtml().$(listWebSite.getItemContainerSelect());
                for(Selectable item:allItems.nodes()){
                    List<String> itemImages = item.$("img").all();
                    System.out.println(itemImages);
                }
            }
            @Override
            public Site getSite() {
                return site;
            }
        }).addUrl(listWebSite.getPageUrl()).run();
    }

    public static void main(String[] args) {
        BlogService service = new BlogService();
        ListWebSite site = new ListWebSite();
        site.setItemContainerSelect(".blog-item");
        site.setDomain("https://my.oschina.net/");
        site.setPageUrl("https://my.oschina.net/flashsword");
        service.spideListWebSite(site);
    }

}
