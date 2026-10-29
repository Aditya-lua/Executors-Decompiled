package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        String str = AFa1tSDK.m8724d().AFKeystoreWrapper.setAndroidIdData().AppsFlyerLib;
        String string = AFa1tSDK.m8724d().AFKeystoreWrapper.registerClient().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        LinkGenerator linkGeneratorAddParameter = new LinkGenerator("af_app_invites").setBaseURL(str, string, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(((AFa1tSDK) appsFlyerLib).AFKeystoreWrapper.setAndroidIdData().valueOf).addParameter("af_siteid", context.getPackageName());
        String string2 = AFa1tSDK.m8724d().AFKeystoreWrapper.registerClient().getString(AppsFlyerProperties.ONELINK_SCHEME);
        if (string2 != null && string2.length() > 3) {
            linkGeneratorAddParameter.setBaseDeeplink(string2);
        }
        return linkGeneratorAddParameter;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.INSTANCE.m8967w(LogTag.ENGAGEMENT, "[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
        linkGeneratorGenerateInviteUrl.addParameters(map);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.ENGAGEMENT;
        aFLogger.m8960d(logTag, "[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
        StringBuilder sb2 = new StringBuilder("[Invite] Generated URL: ");
        sb2.append(linkGeneratorGenerateInviteUrl.generateLink());
        aFLogger.m8960d(logTag, sb2.toString());
        String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = AFInAppEventType.INVITE;
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = AFInAppEventType.SHARE;
        }
        HashMap map2 = new HashMap();
        if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
            map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
        }
        map2.put(AFInAppEventParameterName.AF_CHANNEL, str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, map2);
    }
}
