package come.zhu.com.hushiguang.zhudome.DB;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "STORE_PRISE".
 */
public class StorePrise {

    private Long id;
    private String deviceId;
    private String newsId;

    public StorePrise() {
    }

    public StorePrise(Long id) {
        this.id = id;
    }

    public StorePrise(Long id, String deviceId, String newsId) {
        this.id = id;
        this.deviceId = deviceId;
        this.newsId = newsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

}
