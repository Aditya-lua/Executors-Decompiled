package com.appsflyer.internal;

import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1gSDK {

    @Nullable
    public AFi1zSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ExceptionManagerConfiguration f7022d;

    @Nullable
    public AFh1cSDK unregisterClient;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.unregisterClient = m8889d(jSONObject);
        this.f7022d = unregisterClient(jSONObject);
        this.AFKeystoreWrapper = registerClient(jSONObject);
    }

    /* JADX INFO: renamed from: d */
    private static AFh1cSDK m8889d(JSONObject jSONObject) {
        Object objM30460b;
        AFh1cSDK aFh1cSDK;
        List listM31892k;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "r_debugger");
            if (jSONObjectUnregisterClient != null) {
                long j10 = jSONObjectUnregisterClient.getLong("ttl");
                int i10 = jSONObjectUnregisterClient.getInt("counter");
                String strOptString = jSONObjectUnregisterClient.optString("app_ver", "");
                String strOptString2 = jSONObjectUnregisterClient.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectUnregisterClient.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectUnregisterClient.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    listM31892k = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArrayOptJSONArray.getString(i11);
                        Intrinsics.checkNotNull(string);
                        listM31892k.add(string);
                    }
                } else {
                    listM31892k = C7699p.m31892k();
                }
                List list = listM31892k;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                aFh1cSDK = new AFh1cSDK(j10, fOptDouble, list, i10, strOptString, strOptString2);
            } else {
                aFh1cSDK = null;
            }
            objM30460b = C7347n.m30460b(aFh1cSDK);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (AFh1cSDK) (C7347n.m30465g(objM30460b) ? null : objM30460b);
    }

    private static AFi1zSDK registerClient(JSONObject jSONObject) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "meta_data");
            objM30460b = C7347n.m30460b(jSONObjectUnregisterClient != null ? new AFi1zSDK(jSONObjectUnregisterClient.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (AFi1zSDK) (C7347n.m30465g(objM30460b) ? null : objM30460b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ExceptionManagerConfiguration unregisterClient(JSONObject jSONObject) {
        Object objM30460b;
        ExceptionManagerConfiguration exceptionManagerConfiguration;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "exc_mngr");
            if (jSONObjectUnregisterClient != null) {
                String string = jSONObjectUnregisterClient.getString("sdk_ver");
                int iOptInt = jSONObjectUnregisterClient.optInt("min", -1);
                int iOptInt2 = jSONObjectUnregisterClient.optInt("expire", -1);
                long jOptLong = jSONObjectUnregisterClient.optLong("ttl", -1L);
                Intrinsics.checkNotNull(string);
                exceptionManagerConfiguration = new ExceptionManagerConfiguration(string, iOptInt, iOptInt2, jOptLong);
            } else {
                exceptionManagerConfiguration = null;
            }
            objM30460b = C7347n.m30460b(exceptionManagerConfiguration);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (ExceptionManagerConfiguration) (C7347n.m30465g(objM30460b) ? null : objM30460b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m31980c(AFh1gSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m31981d(obj, "");
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.m31980c(this.f7022d, aFh1gSDK.f7022d) && Intrinsics.m31980c(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.m31980c(this.unregisterClient, aFh1gSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.f7022d;
        int iHashCode = (exceptionManagerConfiguration != null ? exceptionManagerConfiguration.hashCode() : 0) * 31;
        AFi1zSDK aFi1zSDK = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0)) * 31;
        AFh1cSDK aFh1cSDK = this.unregisterClient;
        return iHashCode2 + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0);
    }

    private static JSONObject unregisterClient(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
