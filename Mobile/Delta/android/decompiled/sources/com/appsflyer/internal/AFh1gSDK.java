package com.appsflyer.internal;

import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1gSDK {

    @Nullable
    public AFi1zSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ExceptionManagerConfiguration f5467d;

    @Nullable
    public AFh1cSDK unregisterClient;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.unregisterClient = d(jSONObject);
        this.f5467d = unregisterClient(jSONObject);
        this.AFKeystoreWrapper = registerClient(jSONObject);
    }

    private static AFh1cSDK d(JSONObject jSONObject) {
        Object objB;
        AFh1cSDK aFh1cSDK;
        List listK;
        try {
            gt.n.Companion companion = gt.n.INSTANCE;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "r_debugger");
            if (jSONObjectUnregisterClient != null) {
                long j10 = jSONObjectUnregisterClient.getLong("ttl");
                int i10 = jSONObjectUnregisterClient.getInt("counter");
                String strOptString = jSONObjectUnregisterClient.optString("app_ver", "");
                String strOptString2 = jSONObjectUnregisterClient.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectUnregisterClient.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectUnregisterClient.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    listK = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArrayOptJSONArray.getString(i11);
                        Intrinsics.checkNotNull(string);
                        listK.add(string);
                    }
                } else {
                    listK = kotlin.collections.p.k();
                }
                List list = listK;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                aFh1cSDK = new AFh1cSDK(j10, fOptDouble, list, i10, strOptString, strOptString2);
            } else {
                aFh1cSDK = null;
            }
            objB = gt.n.b(aFh1cSDK);
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        return (AFh1cSDK) (gt.n.g(objB) ? null : objB);
    }

    private static AFi1zSDK registerClient(JSONObject jSONObject) {
        Object objB;
        try {
            gt.n.Companion companion = gt.n.INSTANCE;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "meta_data");
            objB = gt.n.b(jSONObjectUnregisterClient != null ? new AFi1zSDK(jSONObjectUnregisterClient.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        return (AFi1zSDK) (gt.n.g(objB) ? null : objB);
    }

    private static ExceptionManagerConfiguration unregisterClient(JSONObject jSONObject) {
        Object objB;
        ExceptionManagerConfiguration exceptionManagerConfiguration;
        try {
            gt.n.Companion companion = gt.n.INSTANCE;
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
            objB = gt.n.b(exceptionManagerConfiguration);
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        return (ExceptionManagerConfiguration) (gt.n.g(objB) ? null : objB);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.c(AFh1gSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "");
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.c(this.f5467d, aFh1gSDK.f5467d) && Intrinsics.c(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.c(this.unregisterClient, aFh1gSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.f5467d;
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
