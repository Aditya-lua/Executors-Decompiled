package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "Lcom/appsflyer/internal/AFa1ySDK;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "AFLogger", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "AFKeystoreWrapper", "(Landroid/content/Context;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFa1zSDK implements AFa1ySDK {

    @NotNull
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    private static JSONObject AFKeystoreWrapper(Context p8) {
        JSONObject jSONObject = null;
        try {
            InputStream inputStreamOpen = p8.getAssets().open("af_init_config.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            try {
                String strH = ut.n.h(new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192));
                ut.c.a(inputStreamOpen, null);
                JSONObject jSONObject2 = new JSONObject(strH);
                try {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json loaded successfully", false, 4, null);
                    return jSONObject2;
                } catch (FileNotFoundException unused) {
                    jSONObject = jSONObject2;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json not found, skipping", false, 4, null);
                    return jSONObject;
                } catch (IOException e10) {
                    e = e10;
                    jSONObject = jSONObject2;
                    IOException iOException = e;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(iOException.getMessage()), iOException, false, false, false, false, 120, null);
                    return jSONObject;
                } catch (JSONException e11) {
                    e = e11;
                    jSONObject = jSONObject2;
                    JSONException jSONException = e;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(jSONException.getMessage()), jSONException, false, false, false, false, 120, null);
                    return jSONObject;
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject = jSONObject2;
                    Throwable th3 = th;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(th3.getMessage()), th3, false, false, false, false, 120, null);
                    return jSONObject;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ut.c.a(inputStreamOpen, th4);
                    throw th5;
                }
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e12) {
            e = e12;
        } catch (JSONException e13) {
            e = e13;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void AFLogger(@NotNull Context p8) {
        Object objB;
        AFa1mSDK next;
        Intrinsics.checkNotNullParameter(p8, "");
        JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(p8);
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            objB = jt.n.b(jSONObjectAFKeystoreWrapper != null ? JsonUtils.toMap(jSONObjectAFKeystoreWrapper) : null);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Failed to parse config: " + thE.getMessage(), thE, false, false, false, false, 120, null);
        }
        if (jt.n.g(objB)) {
            objB = null;
        }
        Map map = (Map) objB;
        if (map == null) {
            return;
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Starting to apply configuration from af_init_config.json", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                Iterator<AFa1mSDK> it = AFa1mSDK.registerClient().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.c(next.registerClient, str));
                AFa1mSDK aFa1mSDK = next;
                if (aFa1mSDK == null) {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported values have been inserted to the config file", false, 4, null);
                } else {
                    Intrinsics.checkNotNullParameter(value, "");
                    try {
                        aFa1mSDK.unregisterClient.invoke(value);
                    } catch (Throwable th3) {
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Wrong Argument type was passed in the initconfig.json file.", th3, false, false, false, false, 120, null);
                    }
                }
            }
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Successfully applied configuration from af_init_config.json", false, 4, null);
    }
}
