package com.notifierDomain.teamcity.notifierPlugin;

import java.util.*;

public class Test {
    private static final String APPID = "ww1cfe92ce0552bbe8";
    private static final String APPSCREAT = "qa4SGISCYLq8x2qZcwBqRhTom9quWbrWI_OclGXLM3U";
    private static final int APPLICATION_ID =1000045;
    public static void main(String[] args) {
        String webhook_url="https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=7eb7a6c2-5582-4c36-a3d4-3476b6ce7347";
        send_weChatMsg swgroup = new send_weChatMsg();
        try {
            String postdata2 = swgroup.creategrouppostbotdata2("text", "test" ,"");
            String resp2 = swgroup.postBot("utf-8", send_weChatMsg.CONTENT_TYPE , webhook_url, postdata2);
            //       String a = sw.getDep(token);
            //       System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//        List<WeChatUser> value;
//        Map<String, String> myMap = new HashMap<String, String>();
//
//        WeChatAPI ap = new WeChatAPI();
//        List<WeChatDepartment> list = WeChatAPI.getDepartments();
//        Map<String, List<WeChatUser>> user = WeChatAPI.getAllUsers(list);
//        for (String key : user.keySet()) {
//            value = user.get(key);
//            for (int i = 0; i < value.size(); i++) {
//                String tn[] =value.get(i).getName().split("-");
//                myMap.put(tn[0], value.get(i).getId());
//            }
//        }
//        String s = "Katherine";
//        String temp = "";
//        String nu="";
//        String a[] = s.split("，");
//        for (int i = 0; i < a.length; i++) {
//            Set set1=myMap.entrySet();
//            Iterator it1=set1.iterator();
//            while(it1.hasNext()) {
//                Map.Entry entry=(Map.Entry)it1.next();
//                if(entry.getKey().equals(a[i])) {
//                    temp= (String) entry.getValue();
//                }
//            }
//            nu = nu + temp +"|";
//        }
//        send_weChatMsg sw = new send_weChatMsg();
//        try {
//            Singleton singleton = Singleton.getInstance();
//            Map<String, Object> map = singleton.getAccessTokenAndJsapiTicket(APPID,
//                    APPSCREAT);
//           String token = (String) map.get("access_token");
////            String postdata = sw.createpostdata(nu, "text", APPLICATION_ID, "content","success");
////            String resp = sw.post("utf-8", send_weChatMsg.CONTENT_TYPE,(new urlData()).getSendMessage_Url(), postdata, token);
////            System.out.println(token);
//
////            String postdata2 = sw.creategrouppostdata("cbbNoti", "text", "content","test");
////            String resp2 = sw.post("utf-8", send_weChatMsg.CONTENT_TYPE,(new urlData()).getGroupSendMessage_Url(), postdata2, token);
////            String postdata2 = sw.creategrouppostdatamention( "text", "Katherine");
////            String resp2 = sw.postBot("utf-8", send_weChatMsg.CONTENT_TYPE,"https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=7eb7a6c2-5582-4c36-a3d4-3476b6ce7347", postdata2);
////            System.out.println(token);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
