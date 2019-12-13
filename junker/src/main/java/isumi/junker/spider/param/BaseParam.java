package isumi.junker.spider.param;

public class BaseParam {

    private String domain;

    private int frequency = 1;//单位 秒

    private int limitToRest = 20;//请求多少个链接开始休息

    private int resttile = 30;//单位 秒

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getLimitToRest() {
        return limitToRest;
    }

    public void setLimitToRest(int limitToRest) {
        this.limitToRest = limitToRest;
    }

    public int getResttile() {
        return resttile;
    }

    public void setResttile(int resttile) {
        this.resttile = resttile;
    }
}
