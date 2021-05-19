package com.jeremy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jeremy.li
 * @date 2020/12/10
 * @description
 */
public class T005 {
    public static void main(String[] args) throws ClassNotFoundException {


//        String channelPrefix = "qjgg_android";
//        String channel1 = "qjgg_android_11111";
//        String channel2 = "111qjgg_android_11111";
//        String channel3 = "dsaldij";
//        System.out.println(channel1.indexOf(channelPrefix) == 0);
//        System.out.println(channel2.indexOf(channelPrefix));
//        System.out.println(channel3.indexOf(channelPrefix));

        printSql();
    }

    public static void printSql(){
        String storageSql = "update tw_storage set unique_code = '%s' where unique_code = '%s';";
        String purchaseOrderSql = "update tw_purchase_order set unique_code = '%s' where unique_code = '%s';";
        String leaseOrderSql = "update lease_order_sku set unique_code = '%s' where unique_code = '%s';";

        /*系统IMEI码	还机IMEI码
        353884100970151	353884101033298
        353869101342526	353879101403715
        353868101369497	353868101542671
        353869101335268	353955103319453*/

        /*系统IMEI码	还机IMEI码
        353964103250346   	353964103166633
        356342109983276   	356342108681087
        358743091226103     358743091221807*/


//        系统IMEI：358735095834957
//        还机IMEI：358735095827944
        List<SqlTemp> sqlList = new ArrayList<>();
        sqlList.add(new SqlTemp("358735095834957","358735095827944"));
        //sqlList.add(new SqlTemp("356342109983276","356342108681087"));

        System.out.println("--------------------------aif-invoicing--------------------------");
        sqlList.stream().forEach(sqlTemp -> {
            String storageSql1 =String.format(storageSql,sqlTemp.getNewValue(),sqlTemp.getOldValue());
            String purchaseOrderSql1 =String.format(purchaseOrderSql,sqlTemp.getNewValue(),sqlTemp.getOldValue());

            System.out.println(storageSql1);
            System.out.println(purchaseOrderSql1);
        });

        System.out.println("--------------------------lease--------------------------");
        sqlList.stream().forEach(sqlTemp -> {
            String leaseOrderSql1 =String.format(leaseOrderSql,sqlTemp.getNewValue(),sqlTemp.getOldValue());
            System.out.println(leaseOrderSql1);
        });
    }
}
