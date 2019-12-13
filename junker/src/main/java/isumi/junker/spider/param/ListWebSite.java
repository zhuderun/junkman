package isumi.junker.spider.param;

public class ListWebSite extends BaseParam{

    /**
     * 列表页url
     */
    private String pageUrl;

    /**
     * 列表页最外层选择器
     */
    private String containerSelect;

    /**
     * 需要抓取的页码
     */
    private PageParam pageParam;

    private String itemContainerSelect;

    private String itemTitleSelect;

    private String itemPageUrlSelect;

    private String itemContentSelect;

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getContainerSelect() {
        return containerSelect;
    }

    public void setContainerSelect(String containerSelect) {
        this.containerSelect = containerSelect;
    }

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }

    public String getItemContainerSelect() {
        return itemContainerSelect;
    }

    public void setItemContainerSelect(String itemContainerSelect) {
        this.itemContainerSelect = itemContainerSelect;
    }

    public String getItemTitleSelect() {
        return itemTitleSelect;
    }

    public void setItemTitleSelect(String itemTitleSelect) {
        this.itemTitleSelect = itemTitleSelect;
    }

    public String getItemPageUrlSelect() {
        return itemPageUrlSelect;
    }

    public void setItemPageUrlSelect(String itemPageUrlSelect) {
        this.itemPageUrlSelect = itemPageUrlSelect;
    }

    public String getItemContentSelect() {
        return itemContentSelect;
    }

    public void setItemContentSelect(String itemContentSelect) {
        this.itemContentSelect = itemContentSelect;
    }
}
