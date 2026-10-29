package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1qSDK {
    public String AFLogger;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f6852d;
    public String[] force;
    public DeepLinkListener unregisterClient;

    /* JADX INFO: renamed from: v */
    private final AFc1bSDK f6853v;

    @NonNull
    public List<List<String>> registerClient = new ArrayList();
    public long AFKeystoreWrapper = 3000;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final List<String> f6854w = new ArrayList();

    public AFa1qSDK(@NonNull AFc1bSDK aFc1bSDK) {
        this.f6853v = aFc1bSDK;
    }

    /* JADX INFO: renamed from: d_ */
    private Uri m8713d_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.m8963e(LogTag.DDL, "Failed to parse deeplink from recursive JSON search", e10, false, false);
                return null;
            }
        }
        return null;
    }

    private static String registerClient(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int iIndexOf = str.indexOf(63);
        String strSubstring = iIndexOf == -1 ? "" : str.substring(iIndexOf);
        if (strSubstring.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (strSubstring.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
        } else {
            arrayList.add(strSubstring);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("access_token")) {
                it.remove();
            } else {
                if (sb2.length() != 0) {
                    sb2.append("&");
                } else if (!str2.startsWith("?")) {
                    sb2.append("?");
                }
                sb2.append(str2);
            }
        }
        return str.replace(strSubstring, sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AFLogger(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.unregisterClient != null) {
            try {
                try {
                    deepLinkResult = new DeepLinkResult(DeepLink.parseFromOaoa(map).setDeferred(false), null);
                } catch (JSONException e10) {
                    AFLogger.INSTANCE.m8962e(LogTag.DDL, "Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                m8716d(deepLinkResult);
            } catch (Throwable th2) {
                m8716d(new DeepLinkResult(null, null));
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX INFO: renamed from: b_ */
    public final void m8714b_(AFa1kSDK aFa1kSDK, Intent intent, Context context) {
        boolean z10;
        String string;
        Uri uriM8713d_;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.f6853v;
        if (context != null) {
            aFc1aSDK.f6868d.f6933d = context.getApplicationContext();
        }
        if (intent == null) {
            AFLogger.INSTANCE.m8960d(LogTag.DDL, "Intent is null, skipping deeplink processing");
        } else {
            if (!new AFj1sSDK(intent).AFLogger("af_consumed")) {
                Uri uri = null;
                Uri data = "android.intent.action.VIEW".equals(intent.getAction()) ? intent.getData() : null;
                Bundle extras = intent.getExtras();
                if (!this.registerClient.isEmpty() && extras != null) {
                    for (List<String> list : this.registerClient) {
                        if (list == null) {
                            uriM8713d_ = null;
                        } else {
                            Iterator<String> it = list.iterator();
                            if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                                uriM8713d_ = m8713d_(string, it);
                            } else {
                                uriM8713d_ = null;
                            }
                        }
                        if (uriM8713d_ != null) {
                            AFLogger.INSTANCE.m8960d(LogTag.DDL, "Deeplink extracted from push notification payload at path: ".concat(String.valueOf(list)));
                            List<List<String>> list2 = this.registerClient;
                            Intrinsics.checkNotNullParameter("payloadKey", "");
                            AFj1iSDK.AFLogger(aFa1kSDK.d).put("payloadKey", list2);
                            AFa1lSDK aFa1lSDK = aFa1kSDK.AFKeystoreWrapper;
                            if (aFa1lSDK != null) {
                                aFa1lSDK.mo8703d(aFa1kSDK.d);
                            }
                            uri = uriM8713d_;
                            break;
                        }
                    }
                }
                Iterator it2 = Arrays.asList(data, uri).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Uri uri2 = (Uri) it2.next();
                        if (uri2 != null) {
                            new AFj1sSDK(intent).m8945T_("af_consumed", System.currentTimeMillis());
                            m8715c_(aFa1kSDK, uri2);
                            z10 = true;
                            break;
                        }
                    } else {
                        AFLogger.INSTANCE.m8960d(LogTag.DDL, "No deep link detected");
                    }
                }
                if (!z10 && this.unregisterClient != null && this.f6853v.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0 && !this.f6853v.AFKeystoreWrapper().AFKeystoreWrapper("ddl_sent")) {
                    this.f6853v.afWarnLog().m8820d(new AFe1fSDK(this.f6853v));
                }
                if (!z10) {
                    AFLogger();
                }
                this.f6853v.AFKeystoreWrapper().registerClient("ddl_sent", true);
            }
            AFLogger.INSTANCE.m8960d(LogTag.DDL, "skipping re-use of previously consumed deeplink w/af_consumed");
        }
        z10 = false;
        if (!z10) {
            this.f6853v.afWarnLog().m8820d(new AFe1fSDK(this.f6853v));
        }
        if (!z10) {
            AFLogger();
        }
        this.f6853v.AFKeystoreWrapper().registerClient("ddl_sent", true);
    }

    /* JADX INFO: renamed from: c_ */
    public final void m8715c_(AFa1kSDK aFa1kSDK, Uri uri) {
        if (this.f6853v.valueOf().f6933d != null) {
            if (this.f6854w.isEmpty()) {
                m8719f_(aFa1kSDK, uri, null);
            } else {
                this.f6853v.afWarnLog().m8820d(new AFf1zSDK(this, aFa1kSDK, uri, this.f6854w));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8717d(String str, DeepLinkResult.Error error) {
        if (this.unregisterClient != null) {
            AFLogger.INSTANCE.m8960d(LogTag.DDL, "Error occurred: ".concat(String.valueOf(str)));
            m8716d(new DeepLinkResult(null, error));
        }
    }

    /* JADX INFO: renamed from: e_ */
    public final boolean m8718e_(Intent intent) {
        if (intent == null) {
            return false;
        }
        return ("android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) || !this.registerClient.isEmpty();
    }

    /* JADX INFO: renamed from: f_ */
    public final void m8719f_(AFa1kSDK aFa1kSDK, Uri uri, Uri uri2) {
        Intrinsics.checkNotNullParameter("af_deeplink", "");
        if (!aFa1kSDK.d.containsKey("af_deeplink")) {
            String strRegisterClient = registerClient(uri.toString());
            String str = this.AFLogger;
            if (str != null && this.f6852d != null && strRegisterClient.contains(str)) {
                Uri.Builder builderBuildUpon = Uri.parse(strRegisterClient).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.f6852d.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                strRegisterClient = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1kSDK.d.put("appended_query_params", encodedQuery);
                AFa1lSDK aFa1lSDK = aFa1kSDK.AFKeystoreWrapper;
                if (aFa1lSDK != null) {
                    aFa1lSDK.mo8703d(aFa1kSDK.d);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1kSDK.d.put("af_deeplink", strRegisterClient);
            AFa1lSDK aFa1lSDK2 = aFa1kSDK.AFKeystoreWrapper;
            if (aFa1lSDK2 != null) {
                aFa1lSDK2.mo8703d(aFa1kSDK.d);
            }
        }
        AFLogger();
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1qSDK.m8935W_(this.f6853v.AFLogger().m8769r_(), map, uri);
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this.f6853v, UUID.randomUUID(), uri);
        if (aFe1aSDK.f6934v) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1kSDK.d.put("isBrandedDomain", bool);
            AFa1lSDK aFa1lSDK3 = aFa1kSDK.AFKeystoreWrapper;
            if (aFa1lSDK3 != null) {
                aFa1lSDK3.mo8703d(aFa1kSDK.d);
            }
        }
        if (!aFe1aSDK.values()) {
            AFLogger(map);
        } else {
            aFe1aSDK.force = new AFe1aSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1qSDK.5
                @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
                /* JADX INFO: renamed from: d */
                public final void mo8720d(String str2) {
                    AFa1qSDK.this.m8717d(str2, DeepLinkResult.Error.NETWORK);
                }

                @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
                public final void unregisterClient(Map<String, String> map2) {
                    for (String str2 : map2.keySet()) {
                        map.put(str2, map2.get(str2));
                    }
                    AFa1qSDK.this.AFLogger(map);
                }
            };
            this.f6853v.afWarnLog().m8820d(aFe1aSDK);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8716d(DeepLinkResult deepLinkResult) {
        if (this.unregisterClient != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            aFLogger.m8960d(logTag, sb2.toString());
            try {
                this.unregisterClient.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.m8961e(LogTag.DDL, th2.getLocalizedMessage() != null ? th2.getLocalizedMessage() : "Error in onDeepLinking callback execution", th2);
                return;
            }
        }
        AFLogger.INSTANCE.m8960d(LogTag.DDL, "skipping, no callback registered");
    }

    private void AFLogger() {
        try {
            this.f6853v.setAppInviteOneLink().mo8956d();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb2 = new StringBuilder("Could not notify deeplink extraction finished: ");
            sb2.append(th2.getMessage());
            aFLogger.m8960d(logTag, sb2.toString());
        }
    }
}
