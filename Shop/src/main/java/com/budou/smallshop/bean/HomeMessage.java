package com.budou.smallshop.bean;

import java.util.List;

/**
 * Created by 杨大少 on 2017/8/18.
 * 首页数据的展示
 */

public class HomeMessage {


    /**
     * Flag : true
     * Value : {"banners":[{"Id":14,"Type":1,"StartTime":"2015-12-09T16:17:36","EndTime":"2021-12-31T16:06:22","IsShow":1,"Title":"第一张","Img":"fr_1708162011115828103.png","Url":"/mob/Store/All?storeid=1085","DisplayOrder":3},{"Id":15,"Type":1,"StartTime":"2015-01-12T10:13:49","EndTime":"2020-12-31T10:13:53","IsShow":1,"Title":"第二张","Img":"fr_1708121358142204356.png","Url":"/mob/Store?storeid=11261","DisplayOrder":2},{"Id":17,"Type":1,"StartTime":"2016-01-12T10:20:54","EndTime":"2021-07-03T20:17:45","IsShow":1,"Title":"第三张","Img":"fr_1708141032451042248.jpg","Url":"/mob/Store?storeid=11265","DisplayOrder":1}],"Nav":[{"FloorId":0,"AdId":827,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/Store?storeid=11265","AdContentType":"0","AdContent":"旗舰店","ClickCount":0,"Image":"sb_1708161611296863207.png","OrderNo":0},{"FloorId":0,"AdId":821,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/Store?storeid=1085","AdContentType":"0","AdContent":"松鼠超市","ClickCount":0,"Image":"sb_1708141804107360709.png","OrderNo":1},{"FloorId":0,"AdId":808,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=619","AdContentType":"0","AdContent":"服装城","ClickCount":0,"Image":"sb_1708081142240319985.png","OrderNo":2},{"FloorId":0,"AdId":815,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=1679","AdContentType":"0","AdContent":"海外直淘","ClickCount":0,"Image":"sb_1708081154078649848.png","OrderNo":3},{"FloorId":0,"AdId":816,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=362","AdContentType":"0","AdContent":"箱包","ClickCount":0,"Image":"sb_1708081155267644036.png","OrderNo":4},{"FloorId":0,"AdId":817,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=74","AdContentType":"0","AdContent":"音响","ClickCount":0,"Image":"sb_1708081157028112944.png","OrderNo":5},{"FloorId":0,"AdId":819,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=248","AdContentType":"0","AdContent":"饼干蛋糕","ClickCount":0,"Image":"sb_1708081204567116650.png","OrderNo":6},{"FloorId":0,"AdId":812,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=71","AdContentType":"0","AdContent":"手机","ClickCount":0,"Image":"sb_1708081149291169596.png","OrderNo":7},{"FloorId":0,"AdId":813,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=1495","AdContentType":"0","AdContent":"营养保健","ClickCount":0,"Image":"sb_1708081150038864529.png","OrderNo":8},{"FloorId":0,"AdId":814,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=477","AdContentType":"0","AdContent":"特色小吃","ClickCount":0,"Image":"sb_1708081151536804074.png","OrderNo":9},{"FloorId":0,"AdId":807,"AdposId":191,"ItemId":0,"AdType":1,"AdUrl":"/mob/catalog/category?cateId=32","AdContentType":"0","AdContent":"个肤美妆","ClickCount":0,"Image":"sb_1708081139393210288.png","OrderNo":10},{"FloorId":0,"AdId":820,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=816","AdContentType":"0","AdContent":"户外运动","ClickCount":0,"Image":"sb_1708081206235300268.png","OrderNo":11},{"FloorId":0,"AdId":818,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=114","AdContentType":"0","AdContent":"家居用品","ClickCount":0,"Image":"sb_1708081159146061966.png","OrderNo":12},{"FloorId":0,"AdId":810,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=65","AdContentType":"0","AdContent":"办公设备","ClickCount":0,"Image":"sb_1708081147336647789.png","OrderNo":13},{"FloorId":0,"AdId":811,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=1703","AdContentType":"0","AdContent":"酒类","ClickCount":0,"Image":"sb_1708081148231071837.png","OrderNo":14},{"FloorId":0,"AdId":809,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/search?keyword=家电","AdContentType":"0","AdContent":"生活家电","ClickCount":0,"Image":"sb_1708081143316462450.png","OrderNo":15},{"FloorId":0,"AdId":824,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=387","AdContentType":"0","AdContent":"母婴玩具","ClickCount":0,"Image":"sb_1708161603435388715.png","OrderNo":16},{"FloorId":0,"AdId":825,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=963","AdContentType":"0","AdContent":"图书","ClickCount":0,"Image":"sb_1708161607347127023.png","OrderNo":17},{"FloorId":0,"AdId":826,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=431","AdContentType":"0","AdContent":"宠物用品","ClickCount":0,"Image":"sb_1708161609227322433.png","OrderNo":18},{"FloorId":0,"AdId":828,"AdposId":191,"ItemId":0,"AdType":0,"AdUrl":"/mob/Store/class?storeId=1085&storeCid=2321","AdContentType":"0","AdContent":"汽车用品","ClickCount":0,"Image":"sb_1708161616345046836.png","OrderNo":20}],"Goods":[{"FloorId":87,"AdId":771,"AdposId":92,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=14003","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021920266745560.png","OrderNo":0},{"FloorId":87,"AdId":772,"AdposId":92,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=14791","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021924316306139.png","OrderNo":0},{"FloorId":87,"AdId":773,"AdposId":92,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=13433","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021926352341691.png","OrderNo":0},{"FloorId":87,"AdId":774,"AdposId":92,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=9249","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021927205310040.png","OrderNo":0},{"FloorId":87,"AdId":775,"AdposId":92,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=15703","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021928124509522.png","OrderNo":0},{"FloorId":88,"AdId":735,"AdposId":93,"ItemId":20561,"AdType":0,"AdUrl":"/mob/catalog/product?pid=20561","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708022010042048376.png","OrderNo":0},{"FloorId":88,"AdId":736,"AdposId":93,"ItemId":21573,"AdType":0,"AdUrl":"/mob/catalog/product?pid=21573","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032057062354265.png","OrderNo":0},{"FloorId":88,"AdId":745,"AdposId":93,"ItemId":20570,"AdType":0,"AdUrl":"/mob/catalog/product?pid=20570","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708011202543279273.png","OrderNo":0},{"FloorId":88,"AdId":746,"AdposId":93,"ItemId":19476,"AdType":0,"AdUrl":"/mob/catalog/product?pid=19476","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032059450215649.png","OrderNo":0},{"FloorId":88,"AdId":747,"AdposId":93,"ItemId":13887,"AdType":0,"AdUrl":"/mob/catalog/product?pid=13887","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032100398067030.png","OrderNo":0},{"FloorId":89,"AdId":748,"AdposId":94,"ItemId":9464,"AdType":0,"AdUrl":"/mob/catalog/product?pid=9464","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708022007231667459.png","OrderNo":0},{"FloorId":89,"AdId":749,"AdposId":94,"ItemId":20509,"AdType":0,"AdUrl":"/mob/catalog/product?pid=20509","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032102436690195.png","OrderNo":0},{"FloorId":89,"AdId":750,"AdposId":94,"ItemId":19431,"AdType":0,"AdUrl":"/mob/catalog/product?pid=19431","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032103105293781.png","OrderNo":0},{"FloorId":89,"AdId":751,"AdposId":94,"ItemId":15562,"AdType":0,"AdUrl":"/mob/catalog/product?pid=15562","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032103419356205.png","OrderNo":0},{"FloorId":89,"AdId":752,"AdposId":94,"ItemId":12361,"AdType":0,"AdUrl":"/mob/catalog/product?pid=12361","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1707032104356611965.png","OrderNo":0},{"FloorId":90,"AdId":778,"AdposId":95,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=5463","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708022003207448811.png","OrderNo":0},{"FloorId":90,"AdId":779,"AdposId":95,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=4063","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021946118298260.png","OrderNo":0},{"FloorId":90,"AdId":780,"AdposId":95,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=3762","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021947303562016.png","OrderNo":0},{"FloorId":90,"AdId":781,"AdposId":95,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=3562","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021949431569804.png","OrderNo":0},{"FloorId":90,"AdId":782,"AdposId":95,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=4017","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021951118337564.png","OrderNo":0},{"FloorId":91,"AdId":783,"AdposId":96,"ItemId":0,"AdType":0,"AdUrl":"/catalog/product?pid=5715","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708022013559304240.png","OrderNo":0},{"FloorId":91,"AdId":784,"AdposId":96,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=5758","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021955093757376.png","OrderNo":0},{"FloorId":91,"AdId":785,"AdposId":96,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=5704","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021956233220212.png","OrderNo":0},{"FloorId":91,"AdId":786,"AdposId":96,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=21600","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021957238151929.png","OrderNo":0},{"FloorId":91,"AdId":787,"AdposId":96,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/product?pid=9457","AdContentType":"0","AdContent":null,"ClickCount":0,"Image":"sb_1708021958504519366.png","OrderNo":0}],"FloorName":[{"FloorId":87,"AdId":770,"AdposId":87,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=619","AdContentType":"0","AdContent":"精品女装","ClickCount":0,"Image":null,"OrderNo":0},{"FloorId":88,"AdId":173,"AdposId":88,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=32","AdContentType":"0","AdContent":"个肤美妆","ClickCount":0,"Image":null,"OrderNo":0},{"FloorId":89,"AdId":174,"AdposId":89,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=58","AdContentType":"0","AdContent":"家电","ClickCount":0,"Image":null,"OrderNo":0},{"FloorId":90,"AdId":768,"AdposId":90,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=65","AdContentType":"0","AdContent":"电脑","ClickCount":0,"Image":null,"OrderNo":0},{"FloorId":91,"AdId":769,"AdposId":91,"ItemId":0,"AdType":0,"AdUrl":"/mob/catalog/category?cateId=477","AdContentType":"0","AdContent":"特色美食","ClickCount":0,"Image":null,"OrderNo":0}]}
     * ErrorCode : 0
     * Message : null
     */

    private boolean Flag;
    private ValueBean Value;
    private int ErrorCode;
    private Object Message;

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public ValueBean getValue() {
        return Value;
    }

    public void setValue(ValueBean Value) {
        this.Value = Value;
    }

    public int getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(int ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public Object getMessage() {
        return Message;
    }

    public void setMessage(Object Message) {
        this.Message = Message;
    }

    public static class ValueBean {
        private List<BannersBean> banners;
        private List<NavBean> Nav;
        private List<GoodsBean> Goods;
        private List<FloorNameBean> FloorName;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public List<NavBean> getNav() {
            return Nav;
        }

        public void setNav(List<NavBean> Nav) {
            this.Nav = Nav;
        }

        public List<GoodsBean> getGoods() {
            return Goods;
        }

        public void setGoods(List<GoodsBean> Goods) {
            this.Goods = Goods;
        }

        public List<FloorNameBean> getFloorName() {
            return FloorName;
        }

        public void setFloorName(List<FloorNameBean> FloorName) {
            this.FloorName = FloorName;
        }

        public static class BannersBean {
            /**
             * Id : 14
             * Type : 1
             * StartTime : 2015-12-09T16:17:36
             * EndTime : 2021-12-31T16:06:22
             * IsShow : 1
             * Title : 第一张
             * Img : fr_1708162011115828103.png
             * Url : /mob/Store/All?storeid=1085
             * DisplayOrder : 3
             */

            private int Id;
            private int Type;
            private String StartTime;
            private String EndTime;
            private int IsShow;
            private String Title;
            private String Img;
            private String Url;
            private int DisplayOrder;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public int getType() {
                return Type;
            }

            public void setType(int Type) {
                this.Type = Type;
            }

            public String getStartTime() {
                return StartTime;
            }

            public void setStartTime(String StartTime) {
                this.StartTime = StartTime;
            }

            public String getEndTime() {
                return EndTime;
            }

            public void setEndTime(String EndTime) {
                this.EndTime = EndTime;
            }

            public int getIsShow() {
                return IsShow;
            }

            public void setIsShow(int IsShow) {
                this.IsShow = IsShow;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }

            public int getDisplayOrder() {
                return DisplayOrder;
            }

            public void setDisplayOrder(int DisplayOrder) {
                this.DisplayOrder = DisplayOrder;
            }
        }

        public static class NavBean {
            /**
             * FloorId : 0
             * AdId : 827
             * AdposId : 191
             * ItemId : 0
             * AdType : 0
             * AdUrl : /mob/Store?storeid=11265
             * AdContentType : 0
             * AdContent : 旗舰店
             * ClickCount : 0
             * Image : sb_1708161611296863207.png
             * OrderNo : 0
             */

            private int FloorId;
            private int AdId;
            private int AdposId;
            private int ItemId;
            private int AdType;
            private String AdUrl;
            private String AdContentType;
            private String AdContent;
            private int ClickCount;
            private String Image;
            private int OrderNo;

            public int getFloorId() {
                return FloorId;
            }

            public void setFloorId(int FloorId) {
                this.FloorId = FloorId;
            }

            public int getAdId() {
                return AdId;
            }

            public void setAdId(int AdId) {
                this.AdId = AdId;
            }

            public int getAdposId() {
                return AdposId;
            }

            public void setAdposId(int AdposId) {
                this.AdposId = AdposId;
            }

            public int getItemId() {
                return ItemId;
            }

            public void setItemId(int ItemId) {
                this.ItemId = ItemId;
            }

            public int getAdType() {
                return AdType;
            }

            public void setAdType(int AdType) {
                this.AdType = AdType;
            }

            public String getAdUrl() {
                return AdUrl;
            }

            public void setAdUrl(String AdUrl) {
                this.AdUrl = AdUrl;
            }

            public String getAdContentType() {
                return AdContentType;
            }

            public void setAdContentType(String AdContentType) {
                this.AdContentType = AdContentType;
            }

            public String getAdContent() {
                return AdContent;
            }

            public void setAdContent(String AdContent) {
                this.AdContent = AdContent;
            }

            public int getClickCount() {
                return ClickCount;
            }

            public void setClickCount(int ClickCount) {
                this.ClickCount = ClickCount;
            }

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public int getOrderNo() {
                return OrderNo;
            }

            public void setOrderNo(int OrderNo) {
                this.OrderNo = OrderNo;
            }
        }

        public static class GoodsBean {
            /**
             * FloorId : 87
             * AdId : 771
             * AdposId : 92
             * ItemId : 0
             * AdType : 0
             * AdUrl : /mob/catalog/product?pid=14003
             * AdContentType : 0
             * AdContent : null
             * ClickCount : 0
             * Image : sb_1708021920266745560.png
             * OrderNo : 0
             */

            private int FloorId;
            private int AdId;
            private int AdposId;
            private int ItemId;
            private int AdType;
            private String AdUrl;
            private String AdContentType;
            private Object AdContent;
            private int ClickCount;
            private String Image;
            private int OrderNo;

            public int getFloorId() {
                return FloorId;
            }

            public void setFloorId(int FloorId) {
                this.FloorId = FloorId;
            }

            public int getAdId() {
                return AdId;
            }

            public void setAdId(int AdId) {
                this.AdId = AdId;
            }

            public int getAdposId() {
                return AdposId;
            }

            public void setAdposId(int AdposId) {
                this.AdposId = AdposId;
            }

            public int getItemId() {
                return ItemId;
            }

            public void setItemId(int ItemId) {
                this.ItemId = ItemId;
            }

            public int getAdType() {
                return AdType;
            }

            public void setAdType(int AdType) {
                this.AdType = AdType;
            }

            public String getAdUrl() {
                return AdUrl;
            }

            public void setAdUrl(String AdUrl) {
                this.AdUrl = AdUrl;
            }

            public String getAdContentType() {
                return AdContentType;
            }

            public void setAdContentType(String AdContentType) {
                this.AdContentType = AdContentType;
            }

            public Object getAdContent() {
                return AdContent;
            }

            public void setAdContent(Object AdContent) {
                this.AdContent = AdContent;
            }

            public int getClickCount() {
                return ClickCount;
            }

            public void setClickCount(int ClickCount) {
                this.ClickCount = ClickCount;
            }

            public String getImage() {
                return Image;
            }

            public void setImage(String Image) {
                this.Image = Image;
            }

            public int getOrderNo() {
                return OrderNo;
            }

            public void setOrderNo(int OrderNo) {
                this.OrderNo = OrderNo;
            }
        }

        public static class FloorNameBean {
            /**
             * FloorId : 87
             * AdId : 770
             * AdposId : 87
             * ItemId : 0
             * AdType : 0
             * AdUrl : /mob/catalog/category?cateId=619
             * AdContentType : 0
             * AdContent : 精品女装
             * ClickCount : 0
             * Image : null
             * OrderNo : 0
             */

            private int FloorId;
            private int AdId;
            private int AdposId;
            private int ItemId;
            private int AdType;
            private String AdUrl;
            private String AdContentType;
            private String AdContent;
            private int ClickCount;
            private Object Image;
            private int OrderNo;

            public int getFloorId() {
                return FloorId;
            }

            public void setFloorId(int FloorId) {
                this.FloorId = FloorId;
            }

            public int getAdId() {
                return AdId;
            }

            public void setAdId(int AdId) {
                this.AdId = AdId;
            }

            public int getAdposId() {
                return AdposId;
            }

            public void setAdposId(int AdposId) {
                this.AdposId = AdposId;
            }

            public int getItemId() {
                return ItemId;
            }

            public void setItemId(int ItemId) {
                this.ItemId = ItemId;
            }

            public int getAdType() {
                return AdType;
            }

            public void setAdType(int AdType) {
                this.AdType = AdType;
            }

            public String getAdUrl() {
                return AdUrl;
            }

            public void setAdUrl(String AdUrl) {
                this.AdUrl = AdUrl;
            }

            public String getAdContentType() {
                return AdContentType;
            }

            public void setAdContentType(String AdContentType) {
                this.AdContentType = AdContentType;
            }

            public String getAdContent() {
                return AdContent;
            }

            public void setAdContent(String AdContent) {
                this.AdContent = AdContent;
            }

            public int getClickCount() {
                return ClickCount;
            }

            public void setClickCount(int ClickCount) {
                this.ClickCount = ClickCount;
            }

            public Object getImage() {
                return Image;
            }

            public void setImage(Object Image) {
                this.Image = Image;
            }

            public int getOrderNo() {
                return OrderNo;
            }

            public void setOrderNo(int OrderNo) {
                this.OrderNo = OrderNo;
            }
        }
    }
}
