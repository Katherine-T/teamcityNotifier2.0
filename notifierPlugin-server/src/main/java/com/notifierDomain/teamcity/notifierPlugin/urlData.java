package com.notifierDomain.teamcity.notifierPlugin;

public class urlData {
    String GroupSendMessageBot_Url;
    String corpid;
    String corpsecret;
    String Get_Token_Url;
    String SendMessage_Url;
    String GroupSendMessage_Url;

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }

    public String getCorpsecret() {
        return corpsecret;
    }

    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret;
    }
    public void setGet_Token_Url(String corpid, String corpsecret) {
        this.Get_Token_Url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + corpid + 			"&corpsecret="+ corpsecret;
    }

    public String getGet_Token_Url() {
        return Get_Token_Url;
    }

    public String getSendMessage_Url() {
        SendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";
        return SendMessage_Url;
    }
    public String getGroupSendMessage_Url() {
        GroupSendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/appchat/send?access_token=";
        return GroupSendMessage_Url;
    }
    public String getGroupSendMessageBot_Url() {
        GroupSendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=7eb7a6c2-5582-4c36-a3d4-3476b6ce7347";
        return GroupSendMessageBot_Url;
    }
}
