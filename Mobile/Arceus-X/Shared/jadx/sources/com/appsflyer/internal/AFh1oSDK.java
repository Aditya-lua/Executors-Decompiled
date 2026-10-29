package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1oSDK implements AFh1sSDK {

    @Nullable
    private Long AFKeystoreWrapper;

    @Nullable
    private JSONObject AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFi1aSDK f7024d;

    /* JADX INFO: renamed from: e */
    private boolean f7025e;
    private boolean force;

    @Nullable
    private Long registerClient;

    @NotNull
    private final AFc1iSDK unregisterClient;

    /* JADX INFO: renamed from: v */
    private boolean f7026v;

    public AFh1oSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1aSDK aFi1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1aSDK, "");
        this.unregisterClient = aFc1iSDK;
        this.f7024d = aFi1aSDK;
    }

    private final JSONObject AFKeystoreWrapper() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (jSONObjectWaitForAttributionData != null) {
            this.registerClient = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void AFLogger() {
        this.f7025e = false;
        this.force = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    /* JADX INFO: renamed from: D_ */
    public final void mo8890D_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1qSDK};
            Map map = AFa1bSDK.getInstance;
            Object declaredConstructor = map.get(1527976489);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41415), Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 38)).getDeclaredConstructor(Uri.class, AFa1qSDK.class);
                map.put(1527976489, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = map.get(260993585);
            if (method == null) {
                method = ((Class) AFa1bSDK.AFLogger((char) (41416 - (ViewConfiguration.getWindowTouchSlop() >> 8)), KeyEvent.keyCodeFromString(""), View.MeasureSpec.getSize(0) + 37)).getMethod("AFLogger", null);
                map.put(260993585, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(1508099722);
            if (method2 == null) {
                method2 = ((Class) AFa1bSDK.AFLogger((char) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 50 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("AFLogger", null);
                map.put(1508099722, method2);
            }
            boolean zBooleanValue = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
            this.f7025e = !zBooleanValue;
            this.force = zBooleanValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFh1sSDK
    /* JADX INFO: renamed from: d */
    public final void mo8892d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            unregisterClient("attr", aFh1pSDK, attributionData);
            this.f7026v = true;
        }
        MigrationDataProvider.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean registerClient() {
        return this.f7025e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFh1sSDK
    public final void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        JSONObject jSONObject = this.AFLogger;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            unregisterClient("attr", aFh1pSDK, jSONObject);
        } else {
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper();
            if (jSONObjectAFKeystoreWrapper != null) {
                unregisterClient("attr", aFh1pSDK, jSONObjectAFKeystoreWrapper);
            }
        }
        MigrationDataProvider.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.appsflyer.internal.AFh1sSDK
    public final void registerClient(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.AFKeystoreWrapper = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            unregisterClient("dl", aFh1pSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    /* JADX INFO: renamed from: d */
    public final void mo8891d() {
        if (this.f7025e || this.force || MigrationDataProvider.waitForDeepLinkingData(0L) == null) {
            return;
        }
        this.f7025e = true;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final void unregisterClient(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0) {
        JSONObject jSONObjectAFKeystoreWrapper;
        Intrinsics.checkNotNullParameter(aFf1uSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1 && aFf1uSDK.unregisterClient == AFd1bSDK.CONVERSION) {
            Iterator<Referrer> it = this.f7024d.unregisterClient.iterator();
            while (it.hasNext()) {
                if (it.next().getState() == Referrer.State.STARTED) {
                    return;
                }
            }
            if (this.f7026v || (jSONObjectAFKeystoreWrapper = AFKeystoreWrapper()) == null) {
                return;
            }
            this.AFLogger = jSONObjectAFKeystoreWrapper;
            function0.invoke();
        }
    }

    private final void unregisterClient(String str, AFh1pSDK aFh1pSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        aFh1pSDK.AFKeystoreWrapper(map3);
        Map<String, Object> map4 = aFh1pSDK.f7027d;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1zSDK aFe1zSDKAFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFe1zSDKAFKeystoreWrapper, "");
        unregisterClient(map4, aFe1zSDKAFKeystoreWrapper);
    }

    private final void unregisterClient(Map<String, Object> map, AFe1zSDK aFe1zSDK) {
        Long l10;
        if (aFe1zSDK == AFd1bSDK.LAUNCH) {
            l10 = this.AFKeystoreWrapper;
        } else {
            l10 = aFe1zSDK == AFd1bSDK.ATTR ? this.registerClient : null;
        }
        if (l10 != null) {
            AFj1iSDK.AFLogger(map).put("migration", C7688j0.m31791g(C7352s.m30477a("delay", Long.valueOf(l10.longValue()))));
        }
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean unregisterClient() {
        return this.f7026v;
    }
}
