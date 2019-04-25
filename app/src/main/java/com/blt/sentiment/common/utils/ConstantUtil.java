package com.blt.sentiment.common.utils;

/*
 * 文件名:     ConstantUtil
 * 创建者:     AustinGJ
 * 创建时间:   2018/4/22 20:21
 * 描述:      常量类
 */

public class ConstantUtil {
    //openfire 主机名
    public static final String OPENFIRE_SERVER_NAME = "openfire";
    //openfire IP地址
    public static final String OPENFIRE_SERVER_IP = "121.40.195.164";
    //openfire 端口
    public static final int OPENFIRE_SERVER_PORT = 5222;
    //舆情后台URL
    private static final String SERVER = "http://new.sevencai.cn"
            +":8000/";
    public static final String LOGIN = SERVER + "ucenter/app/login";

    public static final String PERSONALINFO = SERVER + "ucenter/app/query/personalInfo";

    public static final String QUERYUSER = SERVER + "ucenter/app/query/user";

    public static final String QUERYUPGRAGE = SERVER + "ucenter/app/query/upgrage";

    public static final String MODIFYPHONENUMBER = SERVER + "ucenter/app/modify/phoneNumber";

    public static final String MODIFYAVATAR = SERVER + "ucenter/app/modify/avatar";

    public static final String UPLOADFILE = SERVER + "ucenter/upload/file";

    public static final String UPDATECLIENTID = SERVER + "ucenter/user/updateClientId";

    public static final String GROUPCREATE = SERVER + "ucenter/rong/group/create";

    public static final String GETCREATEDGROUPS = SERVER + "ucenter/rong/group/getCreatedGroups";

    public static final String GETGROUPINFO = SERVER + "ucenter/rong/group/getGroupInfo";

    public static final String GROUPJOIN = SERVER + "ucenter/rong/group/join";

    public static final String QUITGROUP = SERVER + "ucenter/rong/group/quitGroup";

    public static final String DISMISSGROUP = SERVER + "ucenter/rong/group/dismissGroup";

    public static final String USERINFOBYUSERID = SERVER + "ucenter/app/query/userInfoByUserId";

    public static final String GETNEWTOKEN = SERVER + "ucenter/app/get/newToken";

    public static final String GETTOKEN = SERVER + "ucenter/rong/user/getToken";




    public static final String QUERYLASTVERSION = SERVER + "api/appm/appManager/queryLastVersion";

    public static final String TREEDATA = SERVER + "api/treeDataMobile";

    public static final String QUERYUSERBYOFFICEID = SERVER + "api/appm/queryUserByOfficeId";

    public static final String MENULIST = SERVER + "api/menuList";

    public static final String UPDATEHEAD = SERVER + "api/updateHead";

    public static final String UPDATEPASSWORD = SERVER + "api/updatePassword";

    public static final String UPDATEMOBILE = SERVER + "api/updateMobile";

    public static final String QUERYBACKLOG = SERVER + "api/appm/queryBacklog";

    public static final String QUERYUSERBYID = SERVER + "api/appm/queryUserById";

    public static final String CREATEGROUP = SERVER + "rong/group/create";

    public static final String QUERYGROUP = SERVER + "rong/user/queryGroup";

    public static final String QUERYGROUPUSER = SERVER + "rong/group/user/query";

    public static final String JOINGROUP = SERVER + "rong/group/join";

    public static final String SYNC = SERVER + "rong/group/sync";

    public static final String GETUITEST = SERVER + "api/pilotsend/getuiTest";


}
