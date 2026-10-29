package com.appsflyer.internal;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1aSDK extends AFe1kSDK<Map<String, ? extends String>> {

    @Nullable
    private String AFLoggerLogLevel;

    @NotNull
    private final UUID afDebugLog;

    @Nullable
    private String afErrorLog;

    @Nullable
    private String afInfoLog;

    @Nullable
    public AFa1ySDK force;

    /* JADX INFO: renamed from: v */
    public final boolean f6934v;

    public interface AFa1ySDK {
        /* JADX INFO: renamed from: d */
        void mo8720d(@NotNull String str);

        void unregisterClient(@NotNull Map<String, String> map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1aSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull UUID uuid, @NotNull Uri uri) throws Throwable {
        super(AFd1bSDK.ONELINK, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, aFc1bSDK, uuid.toString());
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zBooleanValue = false;
        this.afDebugLog = uuid;
        try {
            String host = uri.getHost();
            String path = uri.getPath();
            if (host != null && host.length() != 0 && path != null && path.length() != 0) {
                try {
                    Object[] objArr = {uri, aFc1bSDK.enableTCFDataCollection()};
                    Map map = AFa1bSDK.getInstance;
                    Object declaredConstructor = map.get(1527976489);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) (41416 - TextUtils.getOffsetAfter("", 0)), Gravity.getAbsoluteGravity(0, 0), TextUtils.getCapsMode("", 0, 0) + 37)).getDeclaredConstructor(Uri.class, AFa1qSDK.class);
                        map.put(1527976489, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(260993585);
                        if (method == null) {
                            method = ((Class) AFa1bSDK.AFLogger((char) (41415 - TextUtils.indexOf((CharSequence) "", '0')), View.resolveSize(0, 0), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("AFLogger", null);
                            map.put(260993585, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(1508099722);
                            if (method2 == null) {
                                method2 = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 50 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("AFLogger", null);
                                map.put(1508099722, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(-2082167780);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 37, 50 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("unregisterClient", null);
                                    map.put(-2082167780, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
                                if (zBooleanValue2 && listSplit$default.size() == 3) {
                                    this.afInfoLog = (String) listSplit$default.get(1);
                                    this.afErrorLog = (String) listSplit$default.get(2);
                                    this.AFLoggerLogLevel = uri.toString();
                                }
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 == null) {
                        throw th5;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "OneLinkValidator: reflection init failed", e10, false, false, false, false, 96, null);
        }
        this.f6934v = zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final /* bridge */ /* synthetic */ boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo8801a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    /* JADX INFO: renamed from: d */
    public final long mo8802d() {
        return AFf1wSDK.registerClient;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: e */
    public final boolean mo8803e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        AFa1ySDK aFa1ySDK = this.force;
        if (aFa1ySDK != null) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
            if (this.e == AFd1cSDK.SUCCESS && responseNetwork != null) {
                Object body = responseNetwork.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                aFa1ySDK.unregisterClient((Map) body);
                return;
            }
            Throwable v5 = getV();
            String str = "Can't get OneLink data";
            if (!(v5 instanceof ParsingException)) {
                String str2 = this.AFLoggerLogLevel;
                if (str2 != null) {
                    str = str2;
                }
            } else {
                if (!((ParsingException) v5).getRawResponse().isSuccessful()) {
                    String str3 = this.AFLoggerLogLevel;
                    aFa1ySDK.mo8720d(str3 != null ? str3 : "Can't get OneLink data");
                    return;
                }
                str = "Can't parse one link data";
            }
            aFa1ySDK.mo8720d(str);
        }
    }

    public final boolean values() {
        String str;
        String str2 = this.afInfoLog;
        return (str2 == null || str2.length() == 0 || (str = this.afErrorLog) == null || str.length() == 0 || Intrinsics.m31980c(this.afInfoLog, Payload.TYPE_APP)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Return type fixed from 'com.appsflyer.internal.AFd1pSDK<java.util.Map<java.lang.String, java.lang.String>>' to match base method */
    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<Map<String, ? extends String>> AFLogger(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFd1sSDK aFd1sSDKAfDebugLog = getD();
        String str2 = this.afInfoLog;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str3 = this.afErrorLog;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AFd1pSDK<Map<String, String>> aFd1pSDKM8784d = aFd1sSDKAfDebugLog.m8784d(str2, str3, this.afDebugLog, str);
        Intrinsics.checkNotNullExpressionValue(aFd1pSDKM8784d, "");
        return aFd1pSDKM8784d;
    }
}
